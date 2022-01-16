package Basic_Projects;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Demo40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demotik d=new Demotik();
		d.setVisible(true);
		d.setSize(800,800);
		d.setLocation(500,100);
		d.setBackground(Color.black);
		d.setForeground(Color.blue);
		Font f=new Font("Arial",Font.BOLD,40);
		d.setFont(f);
		d.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});

	}

}
