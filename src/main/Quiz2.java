package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력 받은 수");
		int num = scanner.nextInt();
		
		int sum = (num / 10) + (num % 10);
		System.out.println("수의 합: " + sum);

	}

}
