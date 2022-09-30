package 배열기본;

public class 배열타입연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tour = {"괌","유럽","미국","하와이","베트남"};
		for(String s:tour) {
			System.out.println(s);
		}
		for (int i = 0; i < tour.length; i++) {
			System.out.println(tour[i]);
			
		}	
		char[] color= {'r','g','b','y','b'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
			
		}	
		double[] height = {22.3,24.2,21.2,12.4};
		for(double h:height) {
			System.out.println(h);
		}
		
		
	}

}
