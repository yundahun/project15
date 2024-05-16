package main;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("문자를 입력하세요:");
			String str = scanner.nextLine();
			
			if (str.equalsIgnoreCase("STOP")) {
				break;
			}
		}
	}

}
