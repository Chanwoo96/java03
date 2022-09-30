package 배열기본;

import java.util.Scanner;

public class 배열정리 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] data=new int[5];
		for (int i = 0; i < data.length; i++) {
			System.out.print("숫자입력>> ");
			data[i]=sc.nextInt();
		}
		for(int x : data) {
			System.out.println(x);
		}
		
//				System.out.println("저장된 데이터는 "+data);
		
	}

}
