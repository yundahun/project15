package main;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		Scanner scanner = new Scanner(System.in);
		
		// 배열 출력
		System.out.println("숫자 입력.");
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();
		
		
		// 배열의 합
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("숫자의 합:" + sum);
		
	}

}
