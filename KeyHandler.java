import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    public int upPressed, downPressed, rightPressed, leftPressed;


    public void keyTyped(KeyEvent e) {
        //not being used
    }
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //WASD key movement
        if(code == 83){upPressed = 1;}
        if(code == KeyEvent.VK_A){leftPressed = 1;}
        if(code == 81){downPressed = 1;}
        if(code == KeyEvent.VK_D){rightPressed = 1;}
        
    }
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //WASD key movement
        if(code == KeyEvent.VK_W){upPressed = 0;}
        if(code == KeyEvent.VK_A){leftPressed = 0;}
        if(code == KeyEvent.VK_S){downPressed = 0;}
        if(code == KeyEvent.VK_D){rightPressed = 0;}
    }
}
