import java.awt.image.BufferedImage;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.video.Video;
import org.opencv.videoio.VideoCapture;

public class VideoCap {
	VideoCapture cap;
    Mat2Image mat2Img;

	static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
   
	VideoCap(){
		this(0);
	}
	
    VideoCap(int camera){
        if (camera == 0) {
            cap = new VideoCapture();
            mat2Img = new Mat2Image();
            cap.open(0);
            
	        //setProp();
        }
        else {
	        	VideoCapture cap0 = new VideoCapture(0); //Assign different ID to default camera in order to
	        cap = new VideoCapture(1);				// to open another. E.g. default is built-in webcam,
	        											// other is USB cam.
	        mat2Img = new Mat2Image();
	        
	        cap.open(1);
	        cap0.release();
	        
	        //setProp();
        }
    } 
    
    /** This method tries to change a property of the camera but doesn't work. **/
    public void setProp() {
    		int prop = 4;
    		cap.set(prop, 50);
    		
    		try { Thread.sleep(30);
			} catch (InterruptedException e) { }
    		
    		System.out.println("Property " + prop + ": " + cap.get(prop));
    }
    
    public BufferedImage getOneImgFrame() {
        cap.read(mat2Img.mat);
        return mat2Img.getImage(mat2Img.mat);
    }
    
    public Mat getOneMatFrame() {
    		cap.read(mat2Img.mat);
    		return mat2Img.mat;
    }
}
