import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JPanel implements KeyListener, ActionListener {
    private int ballX = 497; // Posicionando a bola no centro
    private int ballY = 369;
    private int ballXDir = -1; // Diminuindo a velocidade pela metade
    private int ballYDir = -1; // Diminuindo a velocidade pela metade
    private int player1Y = 334; // Posicionando os jogadores no centro
    private int player2Y = 334;
    private int player1Score = 0;
    private int player2Score = 0;
    private Timer timer;

    public PongGame() {
        this.setFocusable(true);
        this.addKeyListener(this);
        timer = new Timer(10, this); // Diminuindo a velocidade da bola
        timer.start();
    }

    public void paint(Graphics g) {
        // Fundo
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1024, 768);

        // Bola
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, 50, 50); // Aumentando o tamanho da bola

        // Jogador 1
        g.setColor(Color.WHITE);
        g.fillRect(20, player1Y, 20, 100);

        // Jogador 2
        g.fillRect(984, player2Y, 20, 100);

        // Pontuação
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("Player 1: " + player1Score, 50, 50);
        g.drawString("Player 2: " + player2Score, 850, 50);

        // Movimentar a bola
        ballX += ballXDir;
        ballY += ballYDir;

        // Colisão com as paredes
        if (ballY < 0 || ballY > 718) { // Ajustando para novo tamanho da bola
            ballYDir = -ballYDir;
        }

        // Colisão com os jogadores
        if (new Rectangle(ballX, ballY, 50, 50).intersects(new Rectangle(20, player1Y, 20, 100)) ||
            new Rectangle(ballX, ballY, 50, 50).intersects(new Rectangle(984, player2Y, 20, 100))) {
            ballXDir = -ballXDir;
        }

        // Pontuação
        if (ballX < 0) {
            ballX = 497;
            ballY = 369;
            player2Score++;
        }
        if (ballX > 994) {
            ballX = 497;
            ballY = 369;
            player1Score++;
        }
        
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W && player1Y > 0) {
            player1Y -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_S && player1Y < 668) {
            player1Y += 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && player2Y > 0) {
            player2Y -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && player2Y < 668) {
            player2Y += 20;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong Game");
        PongGame game = new PongGame();
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.setVisible(true);
    }
}