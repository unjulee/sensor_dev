/* Written by: AguaClara Sensor Development Spring 2018
 * Date: March 15, 2018 - 
 * Project: Mobile Application-Processed Endoscope Turbidity Sensor
 * 
 * Framework for video frame capture, conversion, and display adapted from 
 * http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html */

import java.awt.Graphics;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class EndoscopeFrame extends JFrame {
    private JPanel contentPane;
    VideoCap videoCap;
    int counter;
    int sec;
    
	public static void main(String[] args) {
        try {
            EndoscopeFrame frame = new EndoscopeFrame();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public EndoscopeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(0, 0, 1280, 960);
        setBounds(0, 0, 640, 480);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
  
        videoCap = new VideoCap();
        
//        for (int i = 0; i < 19; i++)
//        		System.out.println(videoCap.cap.get(i)); //Print each camera setting
        
        counter = 0;
        sec = (int) new Date().getTime();
        
        new MyThread().start();
    }
     
    public void paint(Graphics g){
        g = contentPane.getGraphics();  
        g.drawImage(videoCap.getOneImgFrame(), 0, 0, this);
       
        if (counter % 10 == 0) {
			System.out.println("Average Light: " + averageLight(videoCap.mat2Img.mat));
			
			int currentSec = (int) new Date().getTime();
	        System.out.println("Elapsed: " + (currentSec - sec) + " ms" + '\n');
	        sec = currentSec;
        }
       
        //The code below uses a static method
//        Mat mat = videoCap.getOneMatFrame();
//        g.drawImage(Mat2Image.getImageStatic(mat), 0, 0, this);
//        
//        if (counter % 10 == 0) {
//        		System.out.println("Average light: " + averageGrey(mat));
//        	
//	        int currentSec = (int) new Date().getTime();
//	        System.out.println("Elapsed: " + (currentSec - sec) + " ms" + '\n');
//	        sec = currentSec;
//        }
        
    }
 
    public static int averageLight(Mat mat) {
    		Imgproc.cvtColor(mat, mat, Imgproc.COLOR_BGR2GRAY);
    		int[][] pixelShades = new int[mat.rows()/10+1][mat.cols()/10+1];    		
    		int sum = 0;

    		for (int r = 0; r < mat.rows(); r = r + 10) {
    			for (int c = 0; c < mat.cols(); c = c + 10) {
    				pixelShades[r/10][c/10] = (int) mat.get(r, c)[0]; 
    				
    				sum += pixelShades[r/10][c/10];
    			}
    		}
    		
    		return sum/pixelShades.length;
    }
    
    class MyThread extends Thread{
        @Override
        public void run() {
            while (true) {
                repaint();
                counter++;
                try { Thread.sleep(30);
                } catch (InterruptedException e) { }
            }  
        } 
    }

}
