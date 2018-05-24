/** AguaClara Sensor Development Spring 2018
 * Mobile Application-Processed Endoscope Turbidity Sensor
 * 
 * Framework for video frame capture, conversion, and display adapted from 
 * http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html 
 * 
 * IMPORTANT: setProp() was written to change a property of the camera but has been unsuccessful. This might 
 * be due to closed systems in the cameras that were tested, incompatibility between the devices and the 
 * program, or, the most likely possibility, a weakness in the Java OpenCV library itself. 
 * 
 * Because it is necessary to hold the exposure constant for our endoscope turbidity sensor, we've decided
 * to move to working with the Android camera library, which may be more suitable because 1) we intend our
 * final software product to be a mobile-application, and 2) there is much more online documentation for the
 * Android libraries. 
 * 
 * UPDATE: The Android libraries are indeed capable of setting constant exposure for the Android phone's 
 * rear and front cameras. However, they are not able to directly access external cameras as OpenCV can on a 
 * computer. We are currently still looking for a way to integrate these two capabilities.*/

import java.awt.image.BufferedImage;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class VideoCap {
	VideoCapture cap;
    Mat2Image mat2Img;

	static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
   
	/** Constructor: create a VideoCap object for the default camera */
	public VideoCap(){
		this(0);
	}
	
	/** Constructor: create a VideoCap object for either the default camera or the secondary/external camera
	 * @param camera the index of the camera. Use 0 for the default camera and 1, 2, etc. for other cameras. 
	 * Disclaimer: the VideoCapture constructor and open() methods have not been tested with more than 2
	 * cameras in the system. Therefore, all indexes above 0 are treated as an index of 1. */
    public VideoCap(int camera){
        if (camera == 0) {
            cap = new VideoCapture();
            mat2Img = new Mat2Image();
            cap.open(0);
            
	        setProp();
        }
        else {
	        	VideoCapture cap0 = new VideoCapture(0); //Assign different ID to default camera in order to
	        cap = new VideoCapture(1);				// to open another. E.g. default is built-in webcam,
	        											// other is second camera or external/USB camera.
	        mat2Img = new Mat2Image();
	        
	        cap.open(1);
	        cap0.release();
	        
	        setProp();
        }
    } 
    
    /** Intended to modify a camera property but has not been successful. See class comments. */
    public void setProp() {
    		int prop = 2; //doesn't work for properties that are 0 or have actual values
    		cap.set(prop, 50);
    		
    		try { Thread.sleep(30);
		} catch (InterruptedException e) { } //an online post suggested waiting after setting the property
    											//and using the camera again
    		//System.out.println("Property " + prop + ": " + cap.get(prop));
    }
    
    /** Return the next video frame as a BufferedImage (java.awt) */
    public BufferedImage getOneImgFrame() {
        cap.read(mat2Img.mat);
        return mat2Img.getImage(mat2Img.mat);
    }
    
    /** Return the next video frame as a Mat image (org.opencv.core) */
    public Mat getOneMatFrame() {
    		cap.read(mat2Img.mat);
    		return mat2Img.mat;
    }
}