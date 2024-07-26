import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleMarioGame extends Application {
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PLAYER_SIZE = 40;
    
    private Rectangle player;
    private Pane root;
    
    @Override
    public void start(Stage primaryStage) {
        root = new Pane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        player = new Rectangle(PLAYER_SIZE, PLAYER_SIZE, Color.BLUE);
        player.setTranslateX(WIDTH / 2 - PLAYER_SIZE / 2);
        player.setTranslateY(HEIGHT - PLAYER_SIZE);
        
        root.getChildren().add(player);
        
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.LEFT) {
                movePlayer(-10);
            } else if (event.getCode() == KeyCode.RIGHT) {
                movePlayer(10);
            }
        });
        
        primaryStage.setTitle("Simple Mario Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void movePlayer(int dx) {
        double newX = player.getTranslateX() + dx;
        if (newX >= 0 && newX <= WIDTH - PLAYER_SIZE) {
            player.setTranslateX(newX);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
