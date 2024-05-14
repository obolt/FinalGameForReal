import javax.swing.*;
import java.awt.*;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

// hello?? import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

public class Ball extends JPanel {
   private int x, y, xVel, yVel, size;
   private int color;


   public Ball(){
     size = (int) (Math.random()*80 + 20); //random num btwn 20-100
       x = (int) (Math.random() * 50 + 10);
       y = (int) (Math.random() * 50 + 10);
       xVel = (int) (Math.random() * 50 + 2);
       yVel = (int) (Math.random() * 50 + 2);
       color = (int) (Math.random() * 255);
   }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        System.out.println("Hi!");
        Color colored = new Color(color, color, color);
        g.fillOval(20,30,5,8);
        g.fillOval(400, 400, 5, 8);
        g.setColor(colored);
        g.fillOval(x, y, 20, 20);
////        xLoc +=2;
//        xLoc += xVel;
//        //yLoc -=4;
//
//        if (xLoc > getWidth()-20){
//            xVel=  xVel*-1;
//        }
//        if( xLoc < 20){
//            xVel = xVel*-1;
//        }


        g.setColor(Color.blue);
       // g.drawString("Hello World", 0, 50);
        JButton button = new JButton();
        //button.setIcon(new ImageIcon(circle.jpeg));
        try {
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }
}
