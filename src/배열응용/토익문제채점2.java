package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		Random r = new Random();
		
		for (int i = 0; i < 내답.length; i++) {
			정답[i]=r.nextInt(4)+1;
			내답[i]=r.nextInt(4)+1;
					}
		System.out.println("문제 :\t 정답 \t내답");
		System.out.println("================");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i+1+":\t"+정답[i]+"\t"+내답[i]);
		}
		int scr=0;
		for (int i = 0; i < 내답.length; i++) {
			if (정답[i]==내답[i]) {
				scr++;
			}
		}
		System.out.println("내 점수 : "+scr);
		
	}

}
