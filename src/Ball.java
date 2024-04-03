import javax.swing.*;
import java.awt.*;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

// hello?? import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

public class Ball extends JPanel {
   private int xLoc;
   private int yLoc;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        System.out.println("Hi!");
        g.fillOval(20,30,5,8);
        g.fillOval(400, 400, 5, 8);
        g.setColor(Color.RED);
        g.fillOval(xLoc, yLoc, 20, 20);
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
        g.drawString("Hello World", 0, 50);
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
