import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,500);

        MyPanel panel = new MyPanel();

        frame.add(panel);

        ImageIcon icon = new ImageIcon("images/circle.jpeg");

        frame.setVisible(true);
// SJHFAKSJHCKJDSHCKJSDCKJSDNCJKSDC Ball ball = new Ball();


    }
}