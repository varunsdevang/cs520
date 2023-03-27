package view;

import model.Player;
import model.RowGameModel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;



public class GameMessageView implements View {

    private JTextArea message = new JTextArea();

    public GameMessageView(JFrame gui){
        JPanel messages = new JPanel(new FlowLayout());
        messages.setBackground(Color.white);
        gui.add(messages, BorderLayout.SOUTH);

        message.setText("Player 1 to play 'X'");
        message.setEditable(false);
        messages.add(message);
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
