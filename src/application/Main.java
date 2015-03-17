package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static class Tile {
        public ImageView img;
        public Rectangle rect;
        
        public Tile(ImageView img, Rectangle rect) {
            this.img = img;
            this.rect = rect;
        }
    }
    
    private Tile[][] tiles = new Tile[8][8];
    private Board board = new Board(true);
    
    @Override
    public void start(Stage primaryStage) {
        try {
            GridPane boardGrid = new GridPane();

            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {
                    Rectangle rect = new Rectangle(100, 100);
                    rect.setFill((x + y) % 2 == 0 ? Color.BLACK : Color.WHITE);
                    ImageView imgView = new ImageView();
                    imgView.setFitHeight(100);
                    imgView.setFitWidth(100);
                    Piece p = board.get(x, y);
                    imgView.setImage(p == null ? null : new Image(p.getImageLocation()));
                    
                    tiles[x][y] = new Tile(imgView, rect);
                    
                    boardGrid.add(rect, x, 8 - y);
                    boardGrid.add(imgView, x, 8 - y);
                }
            }

            Scene scene = new Scene(boardGrid, 800, 800);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
