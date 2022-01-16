package Basic_Projects;
import java.awt.*;
import javax.swing.*;
import javax.script.*;
import java.awt.event.*;
public class Democalculator extends JFrame implements ActionListener {
	
	JTextField txt;  
	JButton b[]=new JButton[20];
	int x=0;
	int y=100;
	int w=100;
	int h=100;
	Democalculator()
	{
	setLayout(null);
	Font f=new Font("Arial",Font.BOLD,30);
	int k=0;
	txt=new JTextField();
	txt.setSize(400,100);
	txt.setLocation(0,0);
	txt.setHorizontalAlignment(JTextField.RIGHT);
	txt.setFont(f);
	add(txt);
	for(int i=1; i<=5; i++)
	{
	for(int j=1; j<=4; j++)
	{
	b[k]=new JButton();
	b[k].setSize(w,h);
	b[k].setLocation(x,y);
	b[k].setFont(f);
	b[k].addActionListener(this);
	add(b[k]);
	k++;
	x=x+100;
	}
	x=0;
	y=y+100;
	}
	b[0].setLabel("B");
	b[1].setLabel("C");
	b[2].setLabel("1/X");
	b[3].setLabel("Squrt");
	b[4].setLabel("7");
	b[5].setLabel("8");
	b[6].setLabel("9");
	b[7].setLabel("/");
	b[8].setLabel("4");
	b[9].setLabel("5");
	b[10].setLabel("6");
	b[11].setLabel("*");
	b[12].setLabel("1");
	b[13].setLabel("2");
	b[14].setLabel("3");
	b[15].setLabel("-");
	b[16].setLabel("0");
	b[17].setLabel(".");
	b[18].setLabel("=");
	b[19].setLabel("+");
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b[0])
	{
	String s1=txt.getText();
	txt.setText(s1.substring(0,s1.length()-1));
	}
	else if(e.getSource()==b[1])
	{
	txt.setText("0");
	}
	else if(e.getSource()==b[2])
	{
	String s2=txt.getText();
	double d1=Double.parseDouble(s2);
	d1=1/d1;
	txt.setText(""+d1);
	}else if(e.getSource()==b[3])
	{
	String s=txt.getText();
	double d=Double.parseDouble(s);
	txt.setText(""+Math.sqrt(d)); 
	}else if(e.getSource()==b[18])
	{
	String s1=txt.getText();
	ScriptEngineManager sem= new ScriptEngineManager();
	ScriptEngine se=sem.getEngineByName("js");
	try{
	txt.setText(""+se.eval(s1));
	}catch(Exception e1)
	{}
	}
	else
	{
	JButton b1=(JButton)e.getSource();
	String s1=txt.getText()+b1.getLabel();
	txt.setText(s1);
	}
	}

}
