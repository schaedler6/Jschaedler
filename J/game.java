import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        add(new GamePanel());
        setResizable(false);
        pack();

        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame ex = new SnakeGame();
        ex.setVisible(true);
    }
}