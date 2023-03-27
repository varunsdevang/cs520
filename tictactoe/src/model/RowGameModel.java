package model;


public class RowGameModel 
{
    public static final String GAME_END_NOWINNER = "Game ends in a draw";

    public RowBlockModel[][] blocksData = new RowBlockModel[3][3];

    /**
     * The current player taking their turn
     */

    private Player player;

    public int movesLeft = 9;

    private int[] lastMove = null;

    private String finalResult = null;

    public RowGameModel() {
	super();
    player = Player.Player1;
	for (int row = 0; row < 3; row++) {
	    for (int col = 0; col < 3; col++) {
		blocksData[row][col] = new RowBlockModel(this);
	    } // end for col
	} // end for row
    }

    public String getFinalResult() {
	return this.finalResult;
    }

    public void setFinalResult(String finalResult) {
	this.finalResult = finalResult;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public int[] getLastMove() {
        return this.lastMove;
    }

    public void setLastMove(int row, int column) {
        this.lastMove = new int[2];
        this.lastMove[0] = row;
        this.lastMove[1] = column;
    }

    public void clearLastMove(){
        this.lastMove = null;
    }
}
