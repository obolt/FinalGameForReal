import javax.swing.*;
import java.awt.*;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

// hello?? import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;

public class Ball extends JPanel {
   private int x, y, xVel, yVel, size, r, b, gr;
   private int color;


   public Ball(){
     size = (int) (Math.random()*80 + 20); //random num btwn 20-100
       x = (int) (Math.random() * 50 + 10);
       y = (int) (Math.random() * 50 + 10);
       xVel = (int) (Math.random() * 50 + 2);
       yVel = (int) (Math.random() * 50 + 2);
       int r = (int) (Math.random() * 255 + 1);
       int b = (int) (Math.random() * 255 + 1);
       int gr = (int) (Math.random() * 255 + 1);
   }

    public void draw(Graphics g) {

        Color colord = new Color(r,gr,b);
        g.setColor(colord);
        g.fillOval(x, y, size, size);


    }

    public void move(JPanel panel, Graphics g) {

        int p = 4;

        x += xVel;
        y += yVel;

        if ((x >= (panel.getWidth() - (2*size)) || (x <= 0)) || (y >= (panel.getHeight() - (2*size)) || (y <= 0))) {

            xVel *= -1;
            yVel *= -1;
            p *= -1;
            // x = size;
            // y = size;
            x += 3 * xVel;
            y += 3 * yVel;
            int xRand = (int) (Math.random() * p + xVel);
            int yRand = (int) (Math.random() * p + yVel);

            xVel = xRand;
            yVel = yRand;

        }
        draw(g);

    }


    // @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        Color colored = new Color(color, color, color);
//        g.setColor(colored);
//        g.fillOval(x, y, 20, 20);
//
//
//        g.setColor(Color.blue);
//       // g.drawString("Hello World", 0, 50);
//        JButton button = new JButton();
//        //button.setIcon(new ImageIcon(circle.jpeg));
//        try {
//            Thread.sleep(100);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        repaint();
//    }
}
