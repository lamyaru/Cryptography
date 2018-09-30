import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.*;

public class mainFrame extends JFrame implements ActionListener {
	
	vig  v = new vig(); 
	mono m = new mono();
	atbash a = new atbash();
	csr c = new csr();
	
	public mainFrame(){
		
		
		JLabel la1 = new JLabel("CRYPTOGRAPHY");
		JLabel bg = new JLabel(new ImageIcon("cyber1.jpg"));
		JButton b1 =new JButton("Vigenere");
		JButton b2 =new JButton("Atbash");
		JButton b3 =new JButton("Ceasar");
		JButton b4 =new JButton("Mono-Alpha");
		JButton b5 =new JButton("?");
    	
	    	Font sty1 = new Font("Phosphate",Font.BOLD,40);
	    	Font sty2 = new Font("Futura",Font.BOLD,15);
	    	
	    	la1.setFont(sty1);
	    	b1.setFont(sty2);
	    	b2.setFont(sty2);
	    	b3.setFont(sty2);
	    	b4.setFont(sty2);
    	
	    	
	    	la1.setForeground(Color.WHITE);
	    	b1.setForeground(Color.DARK_GRAY);
        b2.setForeground(Color.DARK_GRAY);
        b3.setForeground(Color.DARK_GRAY);
        b4.setForeground(Color.DARK_GRAY);
        
        
	    	la1.setBounds(162,75,300,50);
	    	b1.setBounds(72,165,150,50); 
	    	b2.setBounds(395,165,150,50);
	    	b3.setBounds(72,260,150,50);
	    	b4.setBounds(395,260,150,50);
	    	b5.setBounds(575,0,20,20);
	    	
	    	la1.setToolTipText("Choose a Cipher Type");
	    	b1.setToolTipText("when click encryption will be in Vigenere cipher");
	    	b2.setToolTipText("when click encryption will be in Atbash cipher");
	    	b3.setToolTipText("when click encryption will be in Ceasar cipher");
	    	b4.setToolTipText("when click encryption will be in Mono Alphabatic cipher");
	    	b5.setToolTipText("HELP");
	    	
	
	    	add(bg);
        bg.add(la1);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        bg.add(b5);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
	}
	
	 public void actionPerformed(ActionEvent ae)
	    {
	    	String s = ae.getActionCommand();
	    	if(s.equals("Vigenere"))
	    		{v.setVisible(true);
		    	v.setTitle("Vigenere");
		    	v.setSize(500,400);}
	    	
	    	else if (s.equals("Atbash"))
	    		{a.setVisible(true);
		    	a.setTitle("Atbash");
		    	a.setSize(500,400);}
	    	
	    		else if (s.equals("Ceasar"))
	    			{c.setVisible(true);
			    	c.setTitle("Ceasar");
			    	c.setSize(500,400);}
	    	
	    		else if (s.equals("Mono-Alpha"))
	    			{m.setVisible(true);
			    	m.setTitle("Mono Alphabatic");
			    	m.setSize(500,400);}
	    			else 
	    				System.exit(0);	
	    	}
	 
	 public static void main (String[] args)
	 {
	    	mainFrame f = new mainFrame();
	    	f.setVisible(true);
	    	f.setTitle("CRYPTOGRAPHY");
	    	f.setSize(600,400);}

}
