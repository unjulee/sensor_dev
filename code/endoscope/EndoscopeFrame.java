import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/* Code taken from http://computervisionandjava.blogspot.com/2013/10/java-opencv-webcam.html */

public class EndoscopeFrame extends JFrame {
    private JPanel contentPane;
    VideoCap videoCap;
    
	public static void main(String[] args) {
        try {
            EndoscopeFrame frame = new EndoscopeFrame();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    EndoscopeFrame frame = new EndoscopeFrame();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
	}
	
	public EndoscopeFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1280, 960);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
  
        videoCap = new VideoCap();
        
        for (int i = 0; i < 19; i++)
        		System.out.println(videoCap.cap.get(i)); //Print each camera setting
        
        new MyThread().start();
    }
     
    public void paint(Graphics g){
        g = contentPane.getGraphics();
        g.drawImage(videoCap.getOneFrame(), 0, 0, this);
    }
 
    class MyThread extends Thread{
        @Override
        public void run() {
            while (true) {
                repaint();
                try { Thread.sleep(30);
                } catch (InterruptedException e) { }
            }  
        } 
    }

}
