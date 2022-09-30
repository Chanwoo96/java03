package 배열하드응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame	f =	new	JFrame();
		f.setSize(550,750);
		//레이아웃 부품 지정
		//왼쪽부터 순서대로 배치 해주는 부품
		FlowLayout flow= new	FlowLayout();
		f.setLayout(flow);
//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");
//		JButton b4 = new JButton("좌석4");
//		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);
//		f.add(b4);
		int[] seat = new int[500];
		
		
		
		
		
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i+1+"");
			f.add(b);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s= e.getActionCommand();
					JOptionPane.showMessageDialog(f,s+"번 예약완료");
				b.setEnabled(false);
				b.setBackground(Color.red);
				int index = Integer.parseInt(s);
				seat[index-1]=1;
				int count=0;
				for (int j : seat) {
					if (j==1) {
						count++;
						
						
						
					}
				}
			
				
					
				
				// 한자리당 금액이 13000원, 결제 금액을 표시해주세요.
				JOptionPane.showMessageDialog(f,"예약된 좌석 갯수는 "+count+"입니다.");
				JOptionPane.showMessageDialog(f,"결제금액은 "+count*13000+"원 입니다.");
				}
			});
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
