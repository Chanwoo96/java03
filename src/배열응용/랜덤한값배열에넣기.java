package 배열응용;

import java.util.Random;

public class 랜덤한값배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] loto = new int[6];
		
		Random r = new Random();
		for (int i = 0; i < loto.length; i++) {
			loto[i] = r.nextInt(45)+1;
		}
		for(int x : loto) {
		System.out.println(x);
		}
		}
	}


