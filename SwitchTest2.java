package chapter;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("월을 입력하세요");
			int month = stdin.nextInt();
			String MtoS;
			switch (month)
			{
			case 12:
			case 1:
			case 2:
				MtoS = "겨울입니다.";
			    break;
			case3:
			case4:
			case5:
				MtoS = "봄입니다.";
				break;
			case6:
			case7:
			case8:
				MtoS = "여름입니다.";
				break;
			case 9:
				System.out.print("멋진 9월과 ");
			case10:
				System.out.print("아름다운 10월과 ");
			case11:
				System.out.print("낙엽의 11월은");
			MtoS = "기을입니다.";
					break;
			default:
				MtoS = "1~12월을 벗어난 달입니디.";
				break;
			}
			System.out.println(MtoS);
		}
	}
}
}
}