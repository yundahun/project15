package main;

import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		
		// 1. 표준 출력으로 화면에 내용 출력하기
		System.out.println("안녕하세요.");
		
		// 2. 표준 입력으로 문자 입력받기
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		// 문자를 입력 받아 변수에 값을 저장
		try {
			int i = System.in.read();// a 입력
	
			// read() 메소드는 입력받는 값을 바이트로 저장함.
			System.out.println(i); // a->97
			
			// 문자로 사용하려면 형 변환 필요
			System.out.println((char) i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
