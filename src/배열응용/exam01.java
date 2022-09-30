package 배열응용;

public class exam01 {

	public static void main(String[] args) {

		String num = "011-245-1234";
		String tel = num.substring(0, 3);

		int bar = num.lastIndexOf("-");
		if (tel.equals("011")) {
			System.out.println("고객님의 휴대폰은 sk입니다.");
		} else if (tel.equals("019")) {

			System.out.println("고객님의 휴대폰은 lg입니다.");
		} else {

			System.out.println("고객님의 휴대폰은 apple입니다.");
		}
		if (bar >= 8) {
			System.out.println("고객님의 휴대폰은 최신폰입니다.");
		} else {
			System.out.println("고객님의 휴대폰은 올드폰입니다.");
		}
		if (num.length() >= 10) {
			System.out.println("고객님의 번호는 유효한 번호입니다.");
		} else {
			System.out.println("고객님의 번호는 유효하지 않은 번호입니다.");

		}
		String[] nums = num.split("-");
		if (nums[1].length() >= 4) {
			System.out.println("고객님의 휴대폰은 최신폰입니다.");
		} else {
			System.out.println("고객님의 휴대폰은 올드폰입니다.");
		}
	}

}
