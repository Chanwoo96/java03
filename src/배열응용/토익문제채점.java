package 배열응용;

import java.util.Random;

public class 토익문제채점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		Random r = new Random();
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4)+1;
			내답안[i]= r.nextInt(4)+1;
					}
		System.out.println("번호;\t답안\t내답");
		System.out.println("==================");
		
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i+1+":\t"+답안지[i]+"\t"+내답안[i]);
		}
//		for(int x : 답안지) {
//		System.out.println(x+" ");
//	}
//	
//		for(int x : 내답안) {
//			System.out.println(x+" ");
//		}
//		System.out.println("");
		int scr=0;
		for (int i = 0; i < 내답안.length; i++) {
			
			if(내답안[i]==답안지[i]) {scr++;
		}
	}
		System.out.println("나의 점수는 "+scr+"점 입니다.");
	}
	}

