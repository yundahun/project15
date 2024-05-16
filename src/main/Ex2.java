package main;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 표준입력을 인자로 사용하여 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.println("이름:");
		String name = scanner.nextLine();
		
		// 숫자 입력받기
		System.out.println("나이:");
		int age = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		
		// 사용한 리소스 닫기
		scanner.close();

	}

}
