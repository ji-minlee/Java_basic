package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx13 {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("*을 출력할 라인의 수를 입력하세요 >");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp); 	//입력받은 문자열을 숫자로 변환
		
		for(int i = 0; i < num; i++) {
			for (int j = 0; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
