import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class atbash extends JFrame implements ActionListener {
	
	
	JTextArea a1,a2;
	public atbash(){
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JLabel la1 = new JLabel("WELCOME TO ATBASH CIPHER");
		JLabel la2 = new JLabel("ENTER TEXT:");
		JLabel la3 = new JLabel("ENCRYPTED TEXT:");
		JLabel bg = new JLabel(new ImageIcon("cyber.jpg"));
		
		
		JButton b1 = new JButton("ENCRYPT!");
	    JButton b2 = new JButton("BACK");
		JButton b3 = new JButton("CLEAR");
		JButton b4 = new JButton("?");
		
    	Font sty1 = new Font("Phosphate",Font.PLAIN,20);
    	Font sty2 = new Font("Futura",Font.BOLD,12);
    	Font sty3 = new Font("Futura",Font.BOLD,17);
    	
    	la1.setFont(sty1);
    	la2.setFont(sty3);
    	la3.setFont(sty3);
  //  	la4.setFont(sty3);
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
        la2.setBackground(Color.BLACK);
    //    la4.setForeground(Color.WHITE);
		
	    a1 = new JTextArea(1,10);
		a2 = new JTextArea(1,10);
		a1.setLineWrap(false);
        a1.setWrapStyleWord(true);
        a2.setLineWrap(false);
        a2.setWrapStyleWord(true);
		
		la1.setBounds(130,40,300,30); //perfect 
		la2.setBounds(3,150,150,30); 
		a1.setBounds(130,110,250,100);
		b1.setBounds(390,150,100,30);
		la3.setBounds(3,210,200,30); 
		a2.setBounds(130,240,250,110);
		b3.setBounds(150,350,100,30);
		b2.setBounds(260,350,100,30);
		b4.setBounds(485,0,15,15);
		
    	add(bg);
        bg.add(la1);
        bg.add(la2);
      //  bg.add(t1);
        bg.add(b1);
        bg.add(la3);
        bg.add(a1);
        bg.add(b2);
       // bg.add(la4);
        bg.add(a2);
        bg.add(b3);
        bg.add(b4);
      //  bg.add(b5);
     
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae)
    {
		String text;
    	String s = ae.getActionCommand();
    	String fine="";
    	
	     if (s.equals("ENCRYPT!"))
	    {  text = a1.getText();
	       text.replaceAll("\\s","");
	       
	       for(int i = 0 ; i < text.length() ; i++)
			{   
				char encryp= text.charAt(i);
				 int shift =(('z' - encryp) + 'a');
				 encryp =(char) shift;
				StringBuilder sb = new StringBuilder();
				sb.append(encryp);
				String enc = sb.toString();
				fine=fine+encryp;
				a2.setText(fine);
			}}
	        	
		else if (s.equals("CLEAR"))
		{a1.setText(" ");
		a2.setText(" ");}
		else if (s.equals("BACK"))
		{setVisible(false);}	
		else if (s.equals("?"))
		{}	
		else
			System.exit(0);	
    
    }
}
