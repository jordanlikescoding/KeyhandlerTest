import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements Runnable{
    Thread thread;
    KeyHandler k = new KeyHandler();
    public boolean upPressed, downPressed, rightPressed, leftPressed;
    
    public Test(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setBackground(Color.white);

        frame.getContentPane().add(panel);
        panel.setSize(800,800);
        panel.setBackground(Color.blue);
        panel.addKeyListener(k);
        panel.setFocusable(true);
    }

    public void startTest(){
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        while(thread != null){
            update();
            
        }
    }

    public void update(){
    }
}
