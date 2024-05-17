import java.util.ArrayList;
import javax.swing.JPanel;
public class ballHouse extends JPanel {
    ArrayList<Ball> ballList;


    public ballHouse() {
        ballList = new ArrayList<Ball>(20);
        for (int i = 0; i < 20; i++) {
            ballList.add(new Ball());
        }
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < ballList.size(); i++) {
            ballList.get(i).draw(g);
            ballList.get(i).move(this, g);

        }


    }
}
