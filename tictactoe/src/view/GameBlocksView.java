package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.RowGameController;
import java.awt.*;
import java.awt.event.*;
import model.RowGameModel;

public class GameBlocksView implements View {
    private JButton[][] blocks;
    public int blockSize;
    
    public GameBlocksView(int size , JFrame gui, RowGameController controller) {
        JPanel gamePanel = new JPanel(new FlowLayout());
        JPanel game = new JPanel(new GridLayout(3,3));
        gamePanel.add(game, BorderLayout.CENTER);
        gui.add(gamePanel, BorderLayout.NORTH);

        blockSize = size;
        blocks = new JButton[size][size];
        // Initialize a JButton for each cell of the 3x3 game board.
        for(int row = 0; row<size; row++) {
            for(int column = 0; column<size;column++) {
                blocks[row][column] = new JButton();
                blocks[row][column].setPreferredSize(new Dimension(75,75));
                game.add(blocks[row][column]);
                blocks[row][column].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
			            controller.move((JButton)e.getSource());
                    }
                });
            }
        }
    }

    public void update(RowGameModel model) {
        for(int row = 0; row<this.blockSize; row++) {
            for(int column = 0; column<this.blockSize;column++) {
                this.blocks[row][column].setText(model.blocksData[row][column].getContents());
                this.blocks[row][column].setEnabled(model.blocksData[row][column].getIsLegalMove());  
            }
        }
    }

    public JButton getBlock(int row,int column){
        return this.blocks[row][column];
    }
}
