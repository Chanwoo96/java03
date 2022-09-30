package 배열기본;

import java.util.Iterator;

public class 배열만들기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		System.out.println("num의 주소"+num);
		
		num[0]=100;
		num[1]=200;
		//i는 int역할,
		for (int j = 0; j < 5; j++) {
			
			System.out.println(num[j]);
		}
		//for each: 하나씩 처음부터 뒤로가면서 꺼내오는 반복
		//출력용
		for (int x : num) {
			System.out.println(x);
		}
	}

}
