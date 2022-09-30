package 배열응용;

public class 참조형복사 {

	public static void main(String[] args) {
		int[] n1 = { 100, 200, 300 };
		int[]n2=n1;
		int[]n3=n1.clone();
		
		for(int x:n1) {
		System.out.println("n1:"+x);
		}
		for (int x:n2) {
				System.out.println("n2:"+y);
		}
		for (int x:n3) {
			System.out.println("n3:"+y);
		}
		n2[0]=550;

		for(int x:n1) {
		System.out.println("n1:"+x);
		}
		for (int x:n2) {
				System.out.println("n2:"+y);
		}
		
		for (int x:n3) {
			System.out.println("n3:"+y);
		}
	}

}
