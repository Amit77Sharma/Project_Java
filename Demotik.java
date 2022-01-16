package Basic_Projects;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Demotik extends Frame implements ActionListener{
	
	Button b[]=new Button[9];
	int x=100;
	int y=100;
	int w=100;
	int h=100;
	int k=0;
	Demotik()
	{
	setLayout(null);
	for(int i=0; i<3; i++)
	{
	for(int j=0; j<3; j++)
	{
	b[k]=new Button("");
	b[k].setSize(w,h);
	b[k].setLocation(x,y);
	b[k].setBackground(Color.white);
	add(b[k]);
	b[k].addActionListener(this);
	k++;
	x=x+100;
	}
	x=100;
	y=y+100;
	}
	}
	int c=0;
	int PLAYER1;
	int PLAYER2;
	public void actionPerformed(ActionEvent e)
	{
	Button b1=(Button)e.getSource();
	if(c%2==0)
	{
	b1.setLabel("X");
	}
	else
	{
	b1.setLabel("0");
	}
	b1.removeActionListener(this);
	c++;
	if(
	(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X") ||
	(b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X") ||
	(b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X") ||
	(b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X") ||
	(b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X") ||
	(b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X") ||
	(b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X") ||
	(b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X") 
	)
	{
	System.out.print("Score Player1");
	PLAYER1=1;
	System.out.print(":=="+PLAYER1);
	}
	else if(
	(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0") ||
	(b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0") ||
	(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0") ||
	(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0") ||
	(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0") ||
	(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0") ||
	(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0") ||
	(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0") 
	)
	{
	System.out.print("Score Player 2");
	PLAYER2=1;
	System.out.print(":=="+PLAYER2);
	}
	}
	public void paint(Graphics g)
	{
	g.drawString("Welcome to tik tac toe Game",50,500);
	g.drawString("Score",500,100);
	g.drawString("PLAYER 1:="+PLAYER1,500,200);
	g.drawString("PLAYER 2:="+PLAYER2,500,300);
	}

}
