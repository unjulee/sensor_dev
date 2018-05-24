/** AguaClara Sensor Development Spring 2018
 * Mobile Application-Processed Endoscope Turbidity Sensor
 * 
 * Framework for video frame capture, conversion, and display adapted from 
 * http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html */

import java.awt.image.BufferedImage;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class Mat2Image {
	Mat mat = new Mat();
    BufferedImage img;
    byte[] dat;
    
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }   
    
    public Mat2Image() {
    }
   
    public Mat2Image(Mat mat) {
        getSpace(mat);
    }
    
    
    public void getSpace(Mat mat) {
        this.mat = mat;
        int w = mat.cols(), h = mat.rows();
        
        if (dat == null || dat.length != w * h * 3)
            dat = new byte[w * h * 3];
       
        if (img == null || img.getWidth() != w || img.getHeight() != h
            || img.getType() != BufferedImage.TYPE_3BYTE_BGR)
                img = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
       
        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_RGB2BGR); //corrects red and blue channels
    }
    
    public BufferedImage getImage(Mat mat){
        getSpace(mat);
        mat.get(0, 0, dat);
        img.getRaster().setDataElements(0, 0, mat.cols(), mat.rows(), dat);
        return img;
    }
 
    /** A static version of getImage(Mat mat). More concise, but currently unused because may be slower. */
    public static BufferedImage getImageStatic(Mat mat) {
    		Imgproc.cvtColor(mat,mat,Imgproc.COLOR_RGB2BGR); //corrects red and blue channels

    		int w = mat.cols(), h = mat.rows();
		byte data[] = new byte[mat.cols() * mat.rows() * 3];
		BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
    
		mat.get(0, 0, data);
		img.getRaster().setDataElements(0, 0, w, h, data);
        return img;
    }
 }