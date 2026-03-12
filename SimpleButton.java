import javax.swing.*;

public class SimpleButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Button");

        JButton button = new JButton("Click Me");

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
