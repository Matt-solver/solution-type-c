package problem04;

import java.util.Scanner;

public class Main {
	
	static int level = 0;
	static int multi = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("구구단 게임을 시작합니다.");

		while(true) {
			System.out.print(level+" x "+ multi + " = ");
			int answer = scan.nextInt();
			
			boolean result = checkAnswer( answer );
			if ( result ) {
				break;
			}
		}

	}
	
	public static boolean checkAnswer(int answer) {
		if(answer == level*multi) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		
		}
		return false;
		
	}
}