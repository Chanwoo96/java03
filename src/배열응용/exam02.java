package 배열응용;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class exam02 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		String[] sub = {"컴퓨터","영어","수학","체육"};
		String[][] scr= {
				{"100","30","20","80"},
				{"90","80","20","80"},
				{"10","20","20","80"},
				{"70","30","20","80"},
				{"20","36","20","80"},
				{"100","30","20","80"},
				{"40","36","20","80"},
				{"70","30","20","80"},
				{"20","60","20","80"},
				{"10","30","20","80"},
				{"19","30","20","80"},
				{"10","30","20","80"},
				{"90","30","20","80"},
				{"10","30","20","80"},
				{"80","30","20","80"}
		};
		JTable table = new JTable(scr,sub);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		for (int i = 0; i < scr.length; i++) {
//			for(String x: scr[i]) {
//				System.out.print(x+" ");
//			}
//			System.out.println("");
			for (int j = 0; j < scr[i].length; j++) {
				System.out.print(scr[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
