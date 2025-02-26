import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 700;
        int boardHeight = boardWidth;

    JFrame frame =new JFrame("Snake Game");
    frame.setVisible(true);
    frame.setSize(boardHeight,boardWidth);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    SnakeGame1 SnakeGame1 = new SnakeGame1(boardHeight, boardWidth);
    frame.add(SnakeGame1);
    frame.pack();
    SnakeGame1.requestFocus();
    }
}
