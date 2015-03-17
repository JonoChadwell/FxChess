package application;

public class Board {
    private Piece[][] grid = new Piece[8][8];
    
    public Board(boolean startingPieces) {
        if (startingPieces) {
            for (int i = 0; i < 8; i++) {
                grid[i][1] = new Piece(PieceType.PAWN, Color.WHITE);
                grid[i][6] = new Piece(PieceType.PAWN, Color.BLACK);
            }
            
            grid[0][0] = new Piece(PieceType.ROOK, Color.WHITE);
            grid[1][0] = new Piece(PieceType.KNIGHT, Color.WHITE);
            grid[2][0] = new Piece(PieceType.BISHOP, Color.WHITE);
            grid[3][0] = new Piece(PieceType.QUEEN, Color.WHITE);
            grid[4][0] = new Piece(PieceType.KING, Color.WHITE);
            grid[5][0] = new Piece(PieceType.BISHOP, Color.WHITE);
            grid[6][0] = new Piece(PieceType.KNIGHT, Color.WHITE);
            grid[7][0] = new Piece(PieceType.ROOK, Color.WHITE);
            
            grid[0][7] = new Piece(PieceType.ROOK, Color.BLACK);
            grid[1][7] = new Piece(PieceType.KNIGHT, Color.BLACK);
            grid[2][7] = new Piece(PieceType.BISHOP, Color.BLACK);
            grid[3][7] = new Piece(PieceType.QUEEN, Color.BLACK);
            grid[4][7] = new Piece(PieceType.KING, Color.BLACK);
            grid[5][7] = new Piece(PieceType.BISHOP, Color.BLACK);
            grid[6][7] = new Piece(PieceType.KNIGHT, Color.BLACK);
            grid[7][7] = new Piece(PieceType.ROOK, Color.BLACK);
        }
    }
    
    public boolean isValid(int x, int y) {
        return x > 0 && x < 8 && y > 0 && y < 8;
    }
    
    public Piece get(int x, int y) {
        try {
            return grid[x][y];
        } catch(IndexOutOfBoundsException ex) {
            return null;
        }
    }
}
