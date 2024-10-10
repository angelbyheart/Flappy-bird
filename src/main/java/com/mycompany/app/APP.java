/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app;
import javax.swing.*;
/**
 *
 * @author victus
 */
public class APP {

    public static void main(String[] args) {
        int boardHeight=640;
        int boardWidth=360;
        JFrame frame = new JFrame("Flappy bird");
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setSize(boardWidth,boardHeight);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}
