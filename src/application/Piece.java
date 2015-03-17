package application;

public class Piece {
    
    public final PieceType type;
    public final Color color;
    
    public Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }
    
    public String getImageLocation() {
        return color.toString() + "_" + type.toString() + ".png";
    }
}
