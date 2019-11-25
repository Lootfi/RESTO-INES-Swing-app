/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Yacine
 */
public class Menu extends JFrame{

    public Menu(){
        JPanel cp = new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(this);
        //this.setUndecorated(true);
        this.setResizable(false);
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //left
        
        JPanel menuLeft = new JPanel();
        JLabel logoL = new JLabel(new ImageIcon(getClass().getResource("/appihm/logo.png")));
        menuLeft.add(logoL);
        
        
        c.gridx = 0;
        c.gridy = 0;
//        c.fill = GridBagConstraints.HORIZONTAL;
        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0;
        c.weighty = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        cp.add(menuLeft, c);
        
        
        //right
        c = new GridBagConstraints();
        JPanel backgRight = new JPanel();
        c.gridwidth =1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        //c.fill = GridBagConstraints.VERTICAL; //needs work
        c.fill = GridBagConstraints.HORIZONTAL;
        cp.add(backgRight, c);
//        backgRight.setLayout(new GridLayout(2, 1));
       
        
        
        //top

        c = new GridBagConstraints();

        JPanel top = new JPanel();
        top.setLayout(new FlowLayout(0,0,0));
        JLabel topL = new JLabel(new ImageIcon(getClass().getResource("/appihm/top3.png")));
        top.add(topL);
        
        
        //bottom
        
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        c.weightx = 1;
        c.weighty = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.VERTICAL;
        
        JPanel mitem1 = new JPanel();
        mitem1.setLayout(new BoxLayout(mitem1, BoxLayout.Y_AXIS));
        JLabel pizzaL = new JLabel(new ImageIcon(getClass().getResource("/appihm/pizza.png")));
        mitem1.add(pizzaL);
        mitem1.add(Box.createVerticalStrut(40));
        JLabel pizL = new JLabel("Pizza");
        mitem1.add(pizL);
        mitem1.add(Box.createVerticalStrut(10));
        JLabel pizP = new JLabel("300.00DA");
        mitem1.add(pizP);
        mitem1.add(Box.createVerticalStrut(20));
        JButton cmdBtn1 = new JButton("Commander");
        mitem1.add(cmdBtn1);
        pizzaL.setAlignmentX(CENTER_ALIGNMENT);
        pizL.setAlignmentX(CENTER_ALIGNMENT);
        pizP.setAlignmentX(CENTER_ALIGNMENT);
        cmdBtn1.setAlignmentX(CENTER_ALIGNMENT);
        
        
        JPanel mitem2 = new JPanel();
        mitem2.setLayout(new BoxLayout(mitem2, BoxLayout.Y_AXIS));
        JLabel saladeL = new JLabel(new ImageIcon(getClass().getResource("/appihm/salade.png")));
        mitem2.add(saladeL);
        mitem2.add(Box.createVerticalStrut(40));
        JLabel salL = new JLabel("Salade");
        mitem2.add(salL);
        mitem2.add(Box.createVerticalStrut(10));
        JLabel salP = new JLabel("100.00DA");
        mitem2.add(salP);
        mitem2.add(Box.createVerticalStrut(20));
        JButton cmdBtn2 = new JButton("Commander");
        mitem2.add(cmdBtn2);
        saladeL.setAlignmentX(CENTER_ALIGNMENT);
        salL.setAlignmentX(CENTER_ALIGNMENT);
        salP.setAlignmentX(CENTER_ALIGNMENT);
        cmdBtn2.setAlignmentX(CENTER_ALIGNMENT);
        
        
        
        JPanel mitem3 = new JPanel();
        mitem3.setLayout(new BoxLayout(mitem3, BoxLayout.Y_AXIS));
        JLabel spaghetiL = new JLabel(new ImageIcon(getClass().getResource("/appihm/spagheti.png")));
        mitem3.add(spaghetiL);
        mitem3.add(Box.createVerticalStrut(40));
        JLabel spaL = new JLabel("Spagheti");
        mitem3.add(spaL);
        mitem3.add(Box.createVerticalStrut(10));
        JLabel spaP = new JLabel("200.00DA");
        mitem3.add(spaP);
        mitem3.add(Box.createVerticalStrut(20));
        JButton cmdBtn3 = new JButton("Commander");
        mitem3.add(cmdBtn3);
        spaghetiL.setAlignmentX(CENTER_ALIGNMENT);
        spaL.setAlignmentX(CENTER_ALIGNMENT);
        spaP.setAlignmentX(CENTER_ALIGNMENT);
        cmdBtn3.setAlignmentX(CENTER_ALIGNMENT);
        
        
        bottom.add(mitem1,c);
        bottom.add(mitem2,c);
        bottom.add(mitem3,c);
        
        
        backgRight.setLayout(new BorderLayout());
        backgRight.add(top,BorderLayout.NORTH);
        backgRight.add(bottom,BorderLayout.CENTER);
        menuLeft.setBackground(new Color(6, 214, 62));
        backgRight.setBackground(new Color(237, 0, 59));
        top.setBackground(new Color(255, 237, 247));
        bottom.setBackground(new Color(251,255,255));
        this.setContentPane(cp);
        this.setVisible(true);
    }
    
}
