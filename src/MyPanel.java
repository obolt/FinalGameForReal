import javax.swing.*;
import java.awt.*;
import java.util.*;

// import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.circle;
// ^where did that come from

public class MyPanel extends JPanel {
private int count = 0;
   private int xLoc = 500;
   private int yLoc = 500;
//    private ArrayList<Color> colors = new ArrayList<Color>();
//    colors.add(Color.red);

//    int xVel = 10;
    public MyPanel(){

        setBackground(new Color(255, 204, 153));





        ArrayList<Ball> ballList = new ArrayList <Ball>(20);
        for(int i = 0; i <20; i++) {
            ballList.add(new Ball());
        }

//        for(int i = 0; i<20; i++){
//            ballList.get(i).move(panel, g);
//        }


//ballList.add(new Ball );

        // HYPOTHETICAL
        // Ball[] set = new Ball[20];
        // ARRAYLIST
        //
    }
// LOOK LOOK LOOK MAYBE READD
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
////        System.out.println("Hi!");
//        g.fillOval(20,30,5,8);
//        g.fillOval(400, 400, 5, 8);
//        g.setColor(Color.RED);
//        g.fillOval(xLoc, yLoc, 20, 20);
//


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

//
//        g.setColor(Color.blue);
//        g.drawString("Hello World", 0, 50);
//        JButton button = new JButton();
//       // button.setIcon(new ImageIcon(circle.png));
//        try {
//            Thread.sleep(100);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        repaint();
    }


//}
