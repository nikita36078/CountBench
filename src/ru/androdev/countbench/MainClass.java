package ru.androdev.countbench;

import javax.swing.JOptionPane;
 
public class MainClass {
 
  public static void main(String[] args) {
	  long before = System.currentTimeMillis();
	  for (int x = 0; x<90000; x++)
			{double	y = (float) (x * 2.54 + 1234);
		    System.out.println(y);
		}
	  long after = System.currentTimeMillis();
	  long diff = after - before;
	  String str = Long.toString(diff);
	  JOptionPane.showMessageDialog(null, "Время: "+str+"мс");
  }
 
}
