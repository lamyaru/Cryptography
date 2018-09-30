import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class vig extends JFrame implements ActionListener {
	
	
	public class helpv extends JFrame {
		
		JFrame j = new JFrame();
		JLabel la1 = new JLabel("....");
		
	}
	helpv v = new helpv();
	JTextField t1;
	JTextArea a1,a2;
	public vig(){
		
		JLabel la1 = new JLabel("WELCOME TO VIGENERE CIPHER");
		JLabel la2 = new JLabel("Keyword:");
		JLabel la3 = new JLabel("Enter Text:");
		JLabel la4 = new JLabel("Encryption:");
		JLabel bg = new JLabel(new ImageIcon("cyber.jpg"));
		
		JButton b1 = new JButton("ENTER");
		JButton b2 = new JButton("ENCRYPT!");
	    JButton b3 = new JButton("BACK");
		JButton b4 = new JButton("CLEAR");
		JButton b5 = new JButton("?");
		
		
		t1 = new JTextField(10);
		
	    a1 = new JTextArea(1,10);
		a2 = new JTextArea(1,10);
		a1.setLineWrap(false);
        a1.setWrapStyleWord(true);
        a2.setLineWrap(false);
        a2.setWrapStyleWord(true);
        
        la1.setToolTipText("Vigenere Cipher");
    	b1.setToolTipText("Enter Keyword");
    	b2.setToolTipText("click to encrypt text");
    	b3.setToolTipText("go back to main menu");
    	b4.setToolTipText("clear all fields");
    	b5.setToolTipText("HELP");
    	
    	Font sty1 = new Font("Phosphate",Font.PLAIN,20);
    	Font sty2 = new Font("Futura",Font.BOLD,12);
    	Font sty3 = new Font("Futura",Font.BOLD,17);
    	
    	la1.setFont(sty1);
    	la2.setFont(sty3);
    	la3.setFont(sty3);
    	la4.setFont(sty3);
    	b1.setFont(sty2);
    	b2.setFont(sty2);
    	b3.setFont(sty2);
    	b4.setFont(sty2);
    	
    	
    		la1.setForeground(Color.WHITE);
    		b1.setForeground(Color.DARK_GRAY);
        b2.setForeground(Color.DARK_GRAY);
        b3.setForeground(Color.DARK_GRAY);
        b4.setForeground(Color.DARK_GRAY);
        la2.setForeground(Color.WHITE);
        la3.setForeground(Color.WHITE);
        la4.setForeground(Color.WHITE);
        
		
		la1.setBounds(115,10,300,30); 
		la2.setBounds(3,60,150,30); 
		t1.setBounds(110,60,275,30);
		b1.setBounds(395,60,100,30);
		la3.setBounds(3,140,150,30); 
		a1.setBounds(110,102,275,100);
		b2.setBounds(392,140,100,30);
		la4.setBounds(2,270,150,30); 
		a2.setBounds(110,216,275,110);
		b4.setBounds(130,350,100,30);
		b3.setBounds(268,350,100,30);
		b5.setBounds(480,0,15,15);
		
		
    	add(bg);
        bg.add(la1);
        bg.add(la2);
        bg.add(t1);
        bg.add(b1);
        bg.add(la3);
        bg.add(a1);
        bg.add(b2);
        bg.add(la4);
        bg.add(a2);
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
		String keyword = t1.getText(), text;
		String fine="";
    	String s = ae.getActionCommand();
    	if(s.equals("ENTER"))
		{ 
		  keyword.toLowerCase();
		  if(keyword.equals(" "))
		  {t1.setForeground(Color.RED);
		  t1.setText("\tENTER AT LEAST ONE LETTER");}
		  else
		  { t1.setForeground(Color.GREEN);
		  t1.setText(keyword+"\tVALID ENTRY");}  }
    	
	    else if (s.equals("ENCRYPT!"))
	    {  text = a1.getText();
	       text.replaceAll("\\s","");
	       text.toLowerCase();
	       for(  int i = 0 ; i < text.length(); i++)
			{if ( keyword.length() < text.length())
				keyword += keyword.charAt(i);}
			for (  int i = 0 ; i < text.length(); i++){
				int encryp =( (int)(text.charAt(i))+(int)((keyword.charAt(i))-97));
				if(encryp>122)
				{	encryp-=123;
				encryp+=97;}
				char e = (char) (encryp);
				fine= fine + e;
				
			   /*StringBuilder sb = new StringBuilder();
				sb.append(e);
				String enc = sb.toString();
				a2.setText(enc);*/
			}
			a2.setText(fine);}
	        	
		else if (s.equals("CLEAR"))
		{t1.setText(" ");
		a1.setText(" ");
		a2.setText(" ");
		t1.setForeground(Color.BLACK);}
		else if (s.equals("BACK"))
		{setVisible(false);}	
		else if (s.equals("?"))
		{v.setVisible(true);
		v.setTitle("HELP");
		v.setSize(200,50);}	
		else
			System.exit(0);	
    	
    

    
    }
}
