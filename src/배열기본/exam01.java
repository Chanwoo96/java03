package 배열기본;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		System.out.println(num.length);
		num[0]=100;
		System.out.println(num[0]);
		num[num.length-1]=500;
		System.out.println(num[num.length-1]);
		num[2]=200;
		System.out.println(num[2]);
		for(int x:num)
		System.out.println(x);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+" : "+num[i]);
		}
	}

}
