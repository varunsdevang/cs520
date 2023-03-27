package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import model.RowGameModel;
import controller.RowGameController;

public class RowGameGUI implements View {
    public JFrame gui = new JFrame("Tic Tac Toe");
    public RowGameModel gameModel = new RowGameModel();
    // public JButton[][] blocks = new JButton[3][3];
    public JButton reset = new JButton("Reset");
    //public JTextArea playerturn = new JTextArea();
    public GameBlocks blocks;
    public GameMessageUI messageUI;

    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameGUI(RowGameController controller) {
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);

        JPanel gamePanel = new JPanel(new FlowLayout());
        JPanel game = new JPanel(new GridLayout(3,3));
        gamePanel.add(game, BorderLayout.CENTER);

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        JPanel messages = new JPanel(new FlowLayout());
        messages.setBackground(Color.white);

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);
        blocks = new GameBlocks(3, game, controller);
        messageUI = new GameMessageUI(messages);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.resetGame();
            }
        });
    }

    /**
     * Updates the block at the given row and column 
     * after one of the player's moves.
     *
     * @param gameModel The RowGameModel containing the block
     * @param row The row that contains the block
     * @param column The column that contains the block
     */
    // public void updateBlock(RowGameModel gameModel, int row, int column) {
	// blocks[row][column].setText(gameModel.blocksData[row][column].getContents());
	// blocks[row][column].setEnabled(gameModel.blocksData[row][column].getIsLegalMove());
    // }

    public void update(RowGameModel model){

    }
}
