/** Written by: AguaClara Sensor Development Spring 2018
 * Project: Mobile Application-Processed Endoscope Turbidity Sensor
 * Date: March 15, 2018
 * Description: This program displays the camera stream of a built in camera on the computer or an external
 * camera while printing to the console the average light intensity per pixel in a video frame. The OpenCV
 * library for Java is used to communicate with the camera and process images.
 * 
 * Framework for video frame capture, conversion, and display adapted from 
 * http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html */

import java.awt.Graphics;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class EndoscopeFrame extends JFrame {
    private JPanel contentPane;		//A JPanel to draw the video frames on
    VideoCap videoCap;				//A VideoCapture object to open and obtain video frames from a camera
    int sec;							//Used to obtain elapsed time between image processing calculations
    
	public static void main(String[] args) {
        try {
            EndoscopeFrame frame = new EndoscopeFrame();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	/** Constructor: create a JFrame with a content pane to draw on, initialize video capture, and start a 
	 * thread to repaint the pane with new video frames */
	public EndoscopeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1000, 500);  //Adjust your desire; a frame size smaller than the camera image size
        								//simply won't show part of the image until you expand the window
        contentPane = new JPanel(); 
        setContentPane(contentPane);
        contentPane.setLayout(null);
  
        videoCap = new VideoCap();
        
        //Print each camera property. The order of properties, which corresponds with their IDs,
        //can be found in the VideoCapture class specs under method get(int propid):
        //	https://docs.opencv.org/3.1.0/d8/dfe/classcv_1_1VideoCapture.html
        //Unfortunately, only four of the settings have been nonzero in our testing (on a Macbook computer):
        //the width (property #3), height (4), frames per second (5), and format of Mat objects (8).
        System.out.println("Camera Properties: ");
        for (int i = 0; i < 19; i++)
        		System.out.println(videoCap.cap.get(i));
        System.out.println();
        
        sec = (int) new Date().getTime();
        new MyThread().start();
    }
     
	@Override
    public void paint(Graphics g){
        g = contentPane.getGraphics();  
        
        g.drawImage(videoCap.getOneImgFrame(), 0, 0, this);
		System.out.println("Average Light: " + averageLight(videoCap.mat2Img.mat, 10));
		
		int currentSec = (int) new Date().getTime();
        System.out.println("Elapsed: " + (currentSec - sec) + " ms" + '\n');
        sec = currentSec;
    }
 
    /** Compute the average light intensity of the first (top left) pixel in every X by X square of pixels 
     * in the Mat image, where X is given as spacing.
     * @param mat a nonempty Mat image
     * @param spacing the size of squares to sample from, in pixels. Increasing spacing enhances accuracy
     * but increases space and time complexity quadratically. 
     * @return an integer value from 0 to 255 */
    public static int averageLight(Mat mat, int spacing) {
    		Imgproc.cvtColor(mat, mat, Imgproc.COLOR_BGR2GRAY);
    		int[][] pixelSamples = new int[mat.rows()/spacing+1][mat.cols()/spacing+1];    		
    		int sum = 0;

    		for (int r = 0; r * spacing < mat.rows(); r++)
    			for (int c = 0; c * spacing < mat.cols(); c++) {
    				pixelSamples[r][c] = (int) mat.get(r*spacing, c*spacing)[0]; 
    				sum += pixelSamples[r][c];
    			}
    		
    		return sum/pixelSamples.length/pixelSamples[0].length;
    }
    
    /** An instance of MyThread repaints the EndoscopeFrame every 30 ms to update the video displayed.*/
    class MyThread extends Thread{
        @Override
        public void run() {
            while (true) {
                repaint();
                try { Thread.sleep(100);
                } catch (InterruptedException e) { }
            }  
        } 
    }
}