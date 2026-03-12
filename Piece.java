public abstract class Piece {
    protected boolean isWhite;
    protected boolean hasMoved = false;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(Board board, int sx, int sy, int dx, int dy);
    public abstract char getSymbol();
}
