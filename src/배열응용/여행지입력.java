package 배열응용;


import java.util.Scanner;

public class 여행지입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] tour = new String[3];
		String[] tour2 = new String[3];
		for (int i = 0; i < tour2.length; i++) {
			tour[i]=sc.next();
		}
		for (int i = 0; i < tour2.length; i++) {
		tour2[i]=sc.next();
		}
		int fav=0;
		int[] ti = new int[tour.length];
		for (int i = 0; i < tour2.length; i++) {
			for (int j = 0; j < tour2.length; j++) {
			if(tour[i].equals(tour2[j])) {
				fav++;
				ti[j]=j+1;
				
			}
			}
		}
		for (int i = 0; i < ti.length; i++) {
			if(ti[i]==0) {
				
			}else {
				
				System.out.println(tour2[ti[i]-1]);
			}
		}
		System.out.println("동일한 곳은"+fav+"곳 입니다.");
		
	}

}
