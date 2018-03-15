import java.awt.image.BufferedImage;
import org.opencv.core.Core;
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
        }
        else {
	        	VideoCapture cap0 = new VideoCapture(0); //Assign different ID to default camera in order to
	        cap = new VideoCapture(1);				// to open another. E.g. default is built-in webcam,
	        											// other is USB cam.
	        mat2Img = new Mat2Image();
	        
	        cap.open(1);
	        cap0.release();
        }
    } 
 
    BufferedImage getOneFrame() {
        cap.read(mat2Img.mat);
        return mat2Img.getImage(mat2Img.mat);
    }
}
