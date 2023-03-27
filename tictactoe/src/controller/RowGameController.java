package controller;

import javax.swing.JButton;
import model.RowGameModel;
import model.Player;
import view.RowGameView;

public class RowGameController {
    public RowGameModel gameModel;
    public RowGameView gameView;

    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameController() {
	gameModel = new RowGameModel();
	gameView = new RowGameView(this);

        for(int row = 0; row<3; row++) {
            for(int column = 0; column<3 ;column++) {
	        	gameModel.blocksData[row][column].setContents("");
				gameModel.blocksData[row][column].setIsLegalMove(true);
            }
        }
		gameView.update(gameModel);
    }

    /**
     * Moves the current player into the given block.
     *
     * @param block The block to be moved to by the current player
     */
    public void move(JButton block) {
	gameModel.movesLeft--;
	
	if(gameModel.getPlayer() == Player.Player1) {
	    // Check whether player 1 won
	    if(block==gameView.blocks.getBlock(0, 0)) {
		gameModel.blocksData[0][0].setContents("X");
		gameModel.blocksData[0][0].setIsLegalMove(false);
		gameModel.setLastMove(0, 0);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[2][0].getContents())) ||
		       (gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][2].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		    if (gameModel.getFinalResult() != null) {
		    }
		}
	    } else if(block==gameView.blocks.getBlock(0,1)) {
		gameModel.blocksData[0][1].setContents("X");
		gameModel.blocksData[0][1].setIsLegalMove(false);
		gameModel.setLastMove(0, 1);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][1].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(0,2)) {
		gameModel.blocksData[0][2].setContents("X");
		gameModel.blocksData[0][2].setIsLegalMove(false);
		gameModel.setLastMove(0, 2);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][0].getContents())) ||
		       (gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[1][2].getContents()) &&
			gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		    if (gameModel.getFinalResult() != null) {
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1, 0)) {
		gameModel.blocksData[1][0].setContents("X");
		gameModel.blocksData[1][0].setIsLegalMove(false);
		gameModel.setLastMove(1, 0);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][2].getContents())) ||
		       (gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1, 1)) {
		gameModel.blocksData[1][1].setContents("X");
		gameModel.blocksData[1][1].setIsLegalMove(false);
		gameModel.setLastMove(1, 1);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[1][2].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[2][1].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][2].getContents()) &&
			gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1,2)) {
		gameModel.blocksData[1][2].setContents("X");
		gameModel.blocksData[1][2].setIsLegalMove(false);
		gameModel.setLastMove(1, 2);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[0][2].getContents()) &&
			gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][0].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2,0)) {
		gameModel.blocksData[2][0].setContents("X");
		gameModel.blocksData[2][0].setIsLegalMove(false);
		gameModel.setLastMove(2, 0);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[2][1].getContents()) &&
			gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[0][0].getContents())) ||
		       (gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][2].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2,1)) {
		gameModel.blocksData[2][1].setContents("X");
		gameModel.blocksData[2][1].setIsLegalMove(false);
		gameModel.setLastMove(2, 1);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][0].getContents()) &&
			gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][1].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2,2)) {
		gameModel.blocksData[2][2].setContents("X");
		gameModel.blocksData[2][2].setIsLegalMove(false);
		gameModel.setLastMove(2, 2);
		gameModel.setPlayer(Player.Player2);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[2][1].getContents()) &&
			gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][0].getContents())) ||
		       (gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[1][2].getContents()) &&
			gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][0].getContents()))) {
			gameModel.setFinalResult("Player 1 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    }
	} else {
	    // Check whether player 2 won
	    if(block==gameView.blocks.getBlock(0, 0)) {
		gameModel.blocksData[0][0].setContents("O");
		gameModel.blocksData[0][0].setIsLegalMove(false);
		gameModel.setLastMove(0, 0);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[2][0].getContents())) ||
		       (gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][2].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(0, 1)) {
		gameModel.blocksData[0][1].setContents("O");
		gameModel.blocksData[0][1].setIsLegalMove(false);
		gameModel.setLastMove(0, 1);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][1].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(0, 2)) {
		gameModel.blocksData[0][2].setContents("O");
		gameModel.blocksData[0][2].setIsLegalMove(false);
		gameModel.setLastMove(0, 2);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[0][0].getContents())) ||
		       (gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[1][2].getContents()) &&
			gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1, 0)) {
		gameModel.blocksData[1][0].setContents("O");
		gameModel.blocksData[1][0].setIsLegalMove(false);
		gameModel.setLastMove(1, 0);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][2].getContents())) ||
		       (gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1,1)) {
		gameModel.blocksData[1][1].setContents("O");
		gameModel.blocksData[1][1].setIsLegalMove(false);
		gameModel.setLastMove(1, 1);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[1][2].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][1].getContents()) &&
			gameModel.blocksData[0][1].getContents().equals(gameModel.blocksData[2][1].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][0].getContents()) &&
			gameModel.blocksData[0][0].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][2].getContents()) &&
			gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[2][0].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(1,2)) {
		gameModel.blocksData[1][2].setContents("O");
		gameModel.blocksData[1][2].setIsLegalMove(false);
		gameModel.setLastMove(1, 2);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[0][2].getContents()) &&
			gameModel.blocksData[0][2].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[1][0].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2,0)) {
		gameModel.blocksData[2][0].setContents("O");
		gameModel.blocksData[2][0].setIsLegalMove(false);
		gameModel.setLastMove(2, 0);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[2][1].getContents()) &&
			gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[1][0].getContents()) &&
			gameModel.blocksData[1][0].getContents().equals(gameModel.blocksData[0][0].getContents())) ||
		       (gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][2].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2,1)) {
		gameModel.blocksData[2][1].setContents("O");
		gameModel.blocksData[2][1].setIsLegalMove(false);
		gameModel.setLastMove(2, 1);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][0].getContents()) &&
			gameModel.blocksData[2][0].getContents().equals(gameModel.blocksData[2][2].getContents())) ||
		       (gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][1].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    } else if(block==gameView.blocks.getBlock(2, 2)) {
		gameModel.blocksData[2][2].setContents("O");
		gameModel.blocksData[2][2].setIsLegalMove(false);
		gameModel.setLastMove(2, 2);
		gameModel.setPlayer(Player.Player1);
		if(gameModel.movesLeft<7) {
		    if((gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[2][1].getContents()) &&
			gameModel.blocksData[2][1].getContents().equals(gameModel.blocksData[2][0].getContents())) ||
		       (gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[1][2].getContents()) &&
			gameModel.blocksData[1][2].getContents().equals(gameModel.blocksData[0][2].getContents())) ||
		       (gameModel.blocksData[2][2].getContents().equals(gameModel.blocksData[1][1].getContents()) &&
			gameModel.blocksData[1][1].getContents().equals(gameModel.blocksData[0][0].getContents()))) {
			gameModel.setFinalResult("Player 2 wins!");
			endGame();
		    } else if(gameModel.movesLeft==0) {
			gameModel.setFinalResult(RowGameModel.GAME_END_NOWINNER);
		    }
		}
	    }
	}
    gameView.update(gameModel);
	}


    /**
     * Ends the game disallowing further player turns.
     */
    public void endGame() {
	for(int row = 0;row<3;row++) {
	    for(int column = 0;column<3;column++) {
		gameView.blocks.getBlock(row,column).setEnabled(false);
	    }
	}
    }

    /**
     * Resets the game to be able to start playing again.
     */
    public void resetGame() {
        for(int row = 0;row<3;row++) {
            for(int column = 0;column<3;column++) {
                gameModel.blocksData[row][column].reset();
				gameModel.blocksData[row][column].setIsLegalMove(true);
            }
        }
		
        gameModel.setPlayer(Player.Player1);
        gameModel.movesLeft = 9;
		gameModel.setFinalResult(null);
		gameView.update(gameModel);
    }

	public void undo() {
		if (gameModel.movesLeft < 9 && gameModel.getLastMove() != null) {
	
			int[] lastMove  = gameModel.getLastMove();

			gameModel.blocksData[lastMove[0]][lastMove[1]].setContents("");

			gameModel.blocksData[lastMove[0]][lastMove[1]].setIsLegalMove(true);

			gameModel.movesLeft +=1;

			if (gameModel.getPlayer() == Player.Player1){
				gameModel.setPlayer(Player.Player2);
			} else {
				gameModel.setPlayer(Player.Player1);
			}

			if (gameModel.getFinalResult() != null){
				gameModel.setFinalResult(null);
			}

			gameModel.clearLastMove();
			gameView.update(gameModel);
		}
	}
}
