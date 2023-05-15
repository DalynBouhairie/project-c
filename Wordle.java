//Dalyn Bouhairie
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class Wordle  extends JFrame implements ActionListener, ItemListener, KeyListener {

  private JLabel title;
  private static JLabel[][] setup;
  private static JPanel setupPanel;
  private static int rand;
  private static JPanel panel;
  private JTextField text;
  private JButton enter;
  private JPanel bigPanel;
  private static String word;
  private static int row;
  private static boolean isWord;
  private static Scanner sc;
  private static Scanner fin;
  private JComboBox<String> letterNum;
  private static String file;
  private static int num;
  private int count;
  private JButton start2;
  private String answer;
  private JButton reset;
  private JComboBox<String> letterList;

  Wordle() throws FileNotFoundException {
    super("Wordle");

    file = "5-letter.txt";

    panel = new JPanel();
    panel.setLayout(new BorderLayout(10, 10));

    {bigPanel = new JPanel();
    bigPanel.setPreferredSize(new Dimension(400, 100));
    text = new JTextField();
    text.setPreferredSize(new Dimension(300, 100));
    enter = new JButton("ENTER");
    enter.setFont(new Font("sans-serif", 1, 14));
    enter.setPreferredSize(new Dimension(100, 100));
    bigPanel.add(text);
    bigPanel.add(enter);
    panel.add(bigPanel, BorderLayout.PAGE_END);
    }
    letterList = new JComboBox<String>();
    String letters = "5";
    letterNum = new JComboBox<String>(letters);
    JPanel numLetters = new JPanel();
    numLetters.add(letterNum);
    numLetters.setSize(300, 70);
    start2 = new JButton("START GAME");
    JPanel startPanel = new JPanel();
    startPanel.add(start2);
    startPanel.setSize(300, 70);
    reset = new JButton("NEW GAME");
    JPanel resetPanel = new JPanel();
    resetPanel.add(reset);
    resetPanel.setSize(300, 70);
title = new JLabel("Wordle");
    title.setFont(new Font("sans-serif", 1, 50));
    title.setAlignmentX(CENTER_ALIGNMENT);
    JPanel start = new JPanel();
    start.setLayout(new BoxLayout(start, BoxLayout.Y_AXIS));
    start.add(title);
    start.add(numLetters);
    start.add(startPanel);
    start.add(resetPanel);
panel.add(start, BorderLayout.PAGE_START);

    JPanel blank = new JPanel();
    blank.setPreferredSize(new Dimension(200, 1000));
    panel.add(blank, BorderLayout.LINE_START);
    JPanel blank2 = new JPanel();
    blank2.setPreferredSize(new Dimension(200, 1000));
    panel.add(blank2, BorderLayout.LINE_END);

    letterNum.setSelectedItem("5");
    num = 5;
    setupPanel = new JPanel();

  }

public static void main(String[] args) throws FileNotFoundException, IOException{
    JFrame frame = new Wordle();
    frame.setPreferredSize(new Dimension(1000,1000));
    frame.pack();
    frame.setVisible(true);
}

  public void itemStateChanged(ItemEvent e){
    
      }
    }
  }

  