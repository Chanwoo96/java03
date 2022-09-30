package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String head[]= {"a","b","c","d"};
		String cont[][]= {
				{"1","2","3","4"},
				{"1","2","3","4"},
				{"1","2","3","4"},
				{"1","2","3","4"}
				};
	JTable table = new JTable(cont,head);//테이블 만들기
	JScrollPane scroll = new JScrollPane(table);//테이블에 스크롤바 넣어주기
		f.add(scroll);
	f.setVisible(true);// 맨끝에 넣어야함
	}

}
