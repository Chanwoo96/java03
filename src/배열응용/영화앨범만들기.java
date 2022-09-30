package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	static int start = 2;

	public static void main(String[] args) {
		// 영화
		String[] title = { "탑건:매버릭", "인생은 뷰티풀: 비타돌체", "아바타 리마스터링", "명탐정 코난: 할로윈의 신부", "인생은 아름다워" };
		String[] img = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
		double[] scr = {9.5,9.4,9.3,9.2,9.1};

		JFrame f = new JFrame();
		f.setSize(500, 500);

		JLabel top = new JLabel("아바타 리마스터링");
		top.setFont(new Font("굴림", Font.BOLD, 30));
		top.setBackground(Color.YELLOW);
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon=  new ImageIcon(img[start]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("8.88");
		under.setFont(new Font("굴림", Font.BOLD, 24));
		under.setBackground(Color.YELLOW);
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start--;
		if(start<0) {
			JOptionPane.showMessageDialog(null, "첫번째 영화입니다."); 
			start++;
			}else {
				
		
				top.setText(title[start]);
				under.setText(scr[start]+"");
				ImageIcon icon=  new ImageIcon(img[start]);
				center.setIcon(icon);
			}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setForeground(Color.BLACK);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++;
				if (start>4) {start--;
					JOptionPane.showMessageDialog(null, "마지막 영화입니다.");
				}else {
					
				
				top.setText(title[start]);
				under.setText(scr[start]+"");
				ImageIcon icon=  new ImageIcon(img[start]);
				center.setIcon(icon);
				}
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setForeground(Color.BLACK);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}

}
