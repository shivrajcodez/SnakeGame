import javax.swing.*;

public class snakeGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        gamePanel panel = new gamePanel();

        frame.add(panel);
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();  // sizes the frame so all contents are at or above their preferred sizes
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // center on screen
    }
}
