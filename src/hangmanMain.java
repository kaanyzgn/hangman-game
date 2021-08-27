import java.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.image.*;
import java.awt.image.BufferedImage;
	

public class hangmanMain {
	
	static int lifeSpent = 0;
	static int test = 100;

	
	public static void main(String[] args) throws IndexOutOfBoundsException{
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// ArrayList of Words
	    ArrayList<String> words = new ArrayList<String>();
		words.add("INTERRUPT");
		words.add("FLUTTER");
		words.add("TECHNICIAN");
		words.add("CANTEEN");
		words.add("KNOWLEDGE");
		words.add("UNCHARGED");
		words.add("COACH");
		words.add("CINEMA");
		words.add("REPATRIATION");
		words.add("SKYSCRAPER");
		words.add("LEGISLATE");
		words.add("SEGMENT");
		words.add("WROUGHT");
		words.add("PHENOMENON");
		words.add("HYBRID");
		words.add("EXPLICIT");
		words.add("CONJUNCTION");
		words.add("ARISTOCRACY");
		words.add("IMMIGRANT");
		words.add("TRANSITION");
		words.add("UNTENABLE");
		words.add("VULNERABLE");
		words.add("ZENITH");
		words.add("QUENCH");
		words.add("PRESTIGE");
		
		Collections.shuffle(words);
		String randomlySelectedWord = words.get(0);		
		// ArrayList of Words
		
		
			
		// JFrame construction
		JFrame gameFrame = new JFrame();
		gameFrame.setSize(800,800);
		gameFrame.setTitle("Hangman");
		gameFrame.setLocation(200,300);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		// JFrame construction
		
		// JComponents for when the user loses health
		beginningComponent bC = new beginningComponent();
		firstLife fL = new firstLife();
		secondLife sL = new secondLife();
		thirdLife tL = new thirdLife();
		forthLife foL = new forthLife();
		fifthLife fiL = new fifthLife();
		sixthLife siL = new sixthLife();
		Death died = new Death();
		Lines lL = new Lines();
		Lines5 l5L = new Lines5();
		Lines6 l6L = new Lines6();
		Lines7 l7L = new Lines7();
		Lines8 l8L = new Lines8();
		Lines9 l9L = new Lines9();
		Lines10 l10L = new Lines10();
		Lines11 l11L = new Lines11();
		Lines12 l12L = new Lines12();
		Heading hD = new Heading();
		SeventhLife svL = new SeventhLife();
		noChance nC = new noChance();
		
		
	
		
		gameFrame.add(bC);
		gameFrame.validate();
		
		
				
		if(randomlySelectedWord.length()==4) {			
		gameFrame.add(lL);
		gameFrame.validate();
		}
		
		else if(randomlySelectedWord.length()==5) {
			gameFrame.add(l5L);
			gameFrame.validate();
		}
		
		else if(randomlySelectedWord.length()==6) {
			gameFrame.add(l6L);
			gameFrame.validate();
		}
		
		else if(randomlySelectedWord.length()==7) {
			gameFrame.add(l7L);
			gameFrame.validate();
			}
		
		else if(randomlySelectedWord.length()==8) {
			gameFrame.add(l8L);
			gameFrame.validate();
		}
        
		else if(randomlySelectedWord.length()==9) {
			gameFrame.add(l9L);
			gameFrame.validate();
		}
		else if(randomlySelectedWord.length()==10) {
			gameFrame.add(l10L);
			gameFrame.validate();
		}
		else if(randomlySelectedWord.length()==11) {
			gameFrame.add(l11L);
			gameFrame.validate();
		}
		else if(randomlySelectedWord.length()==12) {
			gameFrame.add(l12L);
			gameFrame.validate();
		}
		
		
				
		
		 // JButtons
				JButton buttonA = new JButton("A");
				buttonA.setBounds(450, 100, 50, 50);
				gameFrame.add(buttonA); 
				buttonA.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("A")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'A') {
									JLabel labelA = new JLabel();
									labelA.setFont(new Font("Arial",Font.BOLD,18));
									labelA.setText("A");
									gameFrame.add(labelA);
									labelA.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonA.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonB = new JButton("B");
				buttonB.setBounds(500, 100, 50, 50);
				gameFrame.add(buttonB);
				buttonB.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("B")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'B') {
									JLabel labelB = new JLabel();
									labelB.setFont(new Font("Arial",Font.BOLD,18));
									labelB.setText("B");
									gameFrame.add(labelB);
									labelB.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonB.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});// Line 58 to this is the action of the A button
				
				
				JButton buttonC = new JButton("C");
				buttonC.setBounds(550, 100, 50, 50);
				gameFrame.add(buttonC);
				buttonC.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("C")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'C') {
									JLabel labelC = new JLabel();
									labelC.setFont(new Font("Arial",Font.BOLD,18));
									labelC.setText("C");
									gameFrame.add(labelC);
									labelC.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonC.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonD = new JButton("D");
				buttonD.setBounds(600, 100, 50, 50);
				gameFrame.add(buttonD);
				buttonD.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("D")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'D') {
									JLabel labelD = new JLabel();
									labelD.setFont(new Font("Arial",Font.BOLD,18));
									labelD.setText("D");
									gameFrame.add(labelD);
									labelD.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonD.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonE = new JButton("E");
				buttonE.setBounds(650, 100, 50, 50);
				gameFrame.add(buttonE);
				buttonE.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("E")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'E') {
									JLabel labelE = new JLabel();
									labelE.setFont(new Font("Arial",Font.BOLD,18));
									labelE.setText("E");
									gameFrame.add(labelE);
									labelE.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonE.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonF = new JButton("F");
				buttonF.setBounds(700, 100, 50, 50);
				gameFrame.add(buttonF);
				buttonF.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("F")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'F') {
									JLabel labelF = new JLabel();
									labelF.setFont(new Font("Arial",Font.BOLD,18));
									labelF.setText("F");
									gameFrame.add(labelF);
									labelF.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonF.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonG = new JButton("G");
				buttonG.setBounds(450, 150, 50, 50);
				gameFrame.add(buttonG);
				buttonG.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("G")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'G') {
									JLabel labelG = new JLabel();
									labelG.setFont(new Font("Arial",Font.BOLD,18));
									labelG.setText("G");
									gameFrame.add(labelG);
									labelG.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonG.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonH = new JButton("H");
				buttonH.setBounds(500, 150, 50, 50);
				gameFrame.add(buttonH);
				buttonH.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("H")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'H') {
									JLabel labelH = new JLabel();
									labelH.setFont(new Font("Arial",Font.BOLD,18));
									labelH.setText("H");
									gameFrame.add(labelH);
									labelH.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonH.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonI = new JButton("I");
				buttonI.setBounds(550, 150, 50, 50);
				gameFrame.add(buttonI);
				buttonI.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("I")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'I') {
									JLabel labelI = new JLabel();
									labelI.setFont(new Font("Arial",Font.BOLD,18));
									labelI.setText("I");
									gameFrame.add(labelI);
									labelI.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonI.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonJ = new JButton("J");
				buttonJ.setBounds(600, 150, 50, 50);
				gameFrame.add(buttonJ);
				buttonJ.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("J")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'J') {
									JLabel labelJ = new JLabel();
									labelJ.setFont(new Font("Arial",Font.BOLD,18));
									labelJ.setText("J");
									gameFrame.add(labelJ);
									labelJ.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonJ.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonK = new JButton("K");
				buttonK.setBounds(650, 150, 50, 50);
				gameFrame.add(buttonK);
				buttonK.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("K")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'K') {
									JLabel labelK = new JLabel();
									labelK.setFont(new Font("Arial",Font.BOLD,18));
									labelK.setText("K");
									gameFrame.add(labelK);
									labelK.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonK.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonL = new JButton("L");
				buttonL.setBounds(700, 150, 50, 50);
				gameFrame.add(buttonL);
				buttonL.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("L")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'L') {
									JLabel labelL = new JLabel();
									labelL.setFont(new Font("Arial",Font.BOLD,18));
									labelL.setText("L");
									gameFrame.add(labelL);
									labelL.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonL.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonM = new JButton("M");
				buttonM.setBounds(450, 200, 50, 50);
				gameFrame.add(buttonM);
				buttonM.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("M")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'M') {
									JLabel labelM = new JLabel();
									labelM.setFont(new Font("Arial",Font.BOLD,18));
									labelM.setText("M");
									gameFrame.add(labelM);
									labelM.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonM.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonN = new JButton("N");
				buttonN.setBounds(500, 200, 50, 50);
				gameFrame.add(buttonN);
				buttonN.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("N")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'N') {
									JLabel labelN = new JLabel();
									labelN.setFont(new Font("Arial",Font.BOLD,18));
									labelN.setText("N");
									gameFrame.add(labelN);
									labelN.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonN.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonO = new JButton("O");
				buttonO.setBounds(550, 200, 50, 50);
				gameFrame.add(buttonO);
				buttonO.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("O")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'O') {
									JLabel labelO = new JLabel();
									labelO.setFont(new Font("Arial",Font.BOLD,18));
									labelO.setText("O");
									gameFrame.add(labelO);
									labelO.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonO.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonP = new JButton("P");
				buttonP.setBounds(600, 200, 50, 50);
				gameFrame.add(buttonP);
				buttonP.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("P")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'P') {
									JLabel labelP = new JLabel();
									labelP.setFont(new Font("Arial",Font.BOLD,18));
									labelP.setText("P");
									gameFrame.add(labelP);
									labelP.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonP.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonQ = new JButton("Q");
				buttonQ.setBounds(650, 200, 50, 50);
				gameFrame.add(buttonQ);
				buttonQ.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("Q")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'Q') {
									JLabel labelQ = new JLabel();
									labelQ.setFont(new Font("Arial",Font.BOLD,18));
									labelQ.setText("Q");
									gameFrame.add(labelQ);
									labelQ.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonQ.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonR = new JButton("R");
				buttonR.setBounds(700, 200, 50, 50);
				gameFrame.add(buttonR);
				buttonR.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("R")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'R') {
									JLabel labelR = new JLabel();
									labelR.setFont(new Font("Arial",Font.BOLD,18));
									labelR.setText("R");
									gameFrame.add(labelR);
									labelR.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonR.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonS = new JButton("S");
				buttonS.setBounds(450, 250, 50, 50);
				gameFrame.add(buttonS);
				buttonS.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("S")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'S') {
									JLabel labelS = new JLabel();
									labelS.setFont(new Font("Arial",Font.BOLD,18));
									labelS.setText("S");
									gameFrame.add(labelS);
									labelS.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonS.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonT = new JButton("T");
				buttonT.setBounds(500, 250, 50, 50);
				gameFrame.add(buttonT);
				buttonT.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("T")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'T') {
									JLabel labelT = new JLabel();
									labelT.setFont(new Font("Arial",Font.BOLD,18));
									labelT.setText("T");
									gameFrame.add(labelT);
									labelT.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonT.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonU = new JButton("U");
				buttonU.setBounds(550, 250, 50, 50);
				gameFrame.add(buttonU);
				buttonU.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("U")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'U') {
									JLabel labelU = new JLabel();
									labelU.setFont(new Font("Arial",Font.BOLD,18));
									labelU.setText("U");
									gameFrame.add(labelU);
									labelU.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonU.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonV = new JButton("V");
				buttonV.setBounds(600, 250, 50, 50);
				gameFrame.add(buttonV);
				buttonV.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("V")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'V') {
									JLabel labelV = new JLabel();
									labelV.setFont(new Font("Arial",Font.BOLD,18));
									labelV.setText("V");
									gameFrame.add(labelV);
									labelV.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonV.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonW = new JButton("W");
				buttonW.setBounds(650, 250, 50, 50);
				gameFrame.add(buttonW);
				buttonW.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("W")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'W') {
									JLabel labelW = new JLabel();
									labelW.setFont(new Font("Arial",Font.BOLD,18));
									labelW.setText("W");
									gameFrame.add(labelW);
									labelW.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonW.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonX = new JButton("X");
				buttonX.setBounds(700, 250, 50, 50);
				gameFrame.add(buttonX);
				buttonX.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("X")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'X') {
									JLabel labelX = new JLabel();
									labelX.setFont(new Font("Arial",Font.BOLD,18));
									labelX.setText("X");
									gameFrame.add(labelX);
									labelX.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonX.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonY = new JButton("Y");
				buttonY.setBounds(550, 300, 50, 50);
				gameFrame.add(buttonY);
				buttonY.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("Y")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'Y') {
									JLabel labelY = new JLabel();
									labelY.setFont(new Font("Arial",Font.BOLD,18));
									labelY.setText("Y");
									gameFrame.add(labelY);
									labelY.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonY.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
				
				JButton buttonZ = new JButton("Z");
				buttonZ.setBounds(600, 300, 50, 50);
				gameFrame.add(buttonZ);
				buttonZ.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						if (randomlySelectedWord.contains("Z")) {
							for (int a=0 ; a<randomlySelectedWord.length() ; a++) {
								if (randomlySelectedWord.charAt(a) == 'Z') {
									JLabel labelZ = new JLabel();
									labelZ.setFont(new Font("Arial",Font.BOLD,18));
									labelZ.setText("Z");
									gameFrame.add(labelZ);
									labelZ.setBounds(a*15+150, 100, 100, 100);
								}
							}
						}
						else {
							buttonZ.setVisible(false);
							if (lifeSpent == 0) {
								gameFrame.add(fL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 1) {
								gameFrame.add(sL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 2) {
								gameFrame.add(tL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 3) {
								gameFrame.add(foL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 4) {
								gameFrame.add(fiL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 5) {
								gameFrame.add(siL);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent == 6) {
								gameFrame.add(died);
								gameFrame.validate();
								lifeSpent++;
							}
							else if (lifeSpent <=7) {
								gameFrame.add(nC);
								gameFrame.validate();
							}
						}	
					}
				});
						
						
					
				
				
		// JButtons
		
		
	}

}
