package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import model.RowGameModel;
import controller.RowGameController;

public class RowGameView implements View {
    public JFrame gui = new JFrame("Tic Tac Toe");
    public RowGameModel gameModel = new RowGameModel();
    public JButton reset = new JButton("Reset");
    public JButton undo = new JButton("Undo");
    public GameBlocksView blocks;
    public GameMessageView messageUI;

    /**
     * Creates a new game initializing the GUI.
     */
    public RowGameView(RowGameController controller) {
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);

        blocks = new GameBlocksView(3, gui, controller);

        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        options.add(undo);
        gui.add(options, BorderLayout.CENTER);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.resetGame();
            }
        });

        undo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                controller.undo();
            }
        });

        messageUI = new GameMessageView(gui);
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
        this.blocks.update(model);
        this.messageUI.update(model);
    }
}
