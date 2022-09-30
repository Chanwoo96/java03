package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] num=new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
			}
		System.out.println(num[0]+num[2]);
		
		
		String[] st= {"자바","스프링","JSP"};
		System.out.println(st[0]+" 보다는 "+st[1]);
	}

}
