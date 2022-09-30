package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s= {1,2,3,4,5,6,7,};
		System.out.println(s.length);
		System.out.println(s[6]);
		int[] s2=new int[5];
		System.out.println(s2[3]);
		//배열은 많은 양의 데이터를 쓸 때, 편하게 쓰라고 만들어 놓은 특별한 부품
		//빈 공간을 여러개 만들 때, 자동으로 초기화!
		//int->0 double->0.0 boolean->false
		String[] s3= new String[3];
		System.out.println(s3[2]);
		
		// 배열의 각 인덱스에 값 대입!
		s2[0]=100;
		s2[1]=200;
	}

}
