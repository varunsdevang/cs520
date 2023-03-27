package view;

import model.Player;
import model.RowGameModel;
import javax.swing.JTextArea;
import javax.swing.JPanel;


public class GameMessageUI implements View {

    private JTextArea message = new JTextArea();

    public GameMessageUI(JPanel messagePanel){
        message.setText("Player 1 to play 'X'");
        message.setEditable(false);
        messagePanel.add(message);
    }

    public void update(RowGameModel model){

        if (model.getFinalResult() != null) {
            this.message.setText(model.getFinalResult());
            return;
        }

        if (model.movesLeft == 9){
            this.message.setText("Player 1 to play 'X'");
            return;
        }

        if (model.getPlayer() == Player.Player1){
            this.message.setText("'X': Player 1");
        } else {
            this.message.setText("'O': Player 2");
        }
    }
}
