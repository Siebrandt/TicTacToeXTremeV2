/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.viewGame;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Rainer Siebrandt
 */
public class TicTacToeXTreme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var viewGame = new viewGame();
        
        initialize(viewGame);
        
        viewGame.show();
    }
    
    private static void initialize(viewGame viewGame){
        viewGame.setSize(new Dimension(500, 960));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        viewGame.setLocation(dim.width/2-viewGame.getSize().width/2, dim.height/2-viewGame.getSize().height/2);
        
        try{
            viewGame.setIconImage(ImageIO.read(new File("Resources/TicTacToeXTreme.png")));
        }
        catch(IOException ex){
            
        }
        var contentpane = viewGame.getContentPane();
        
        /*JButton jb00 = new JButton();
        jb00.setText(jb00.getName());
        var gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        contentpane.add(jb00, gridBagConstraints);*/
    }
    
}
