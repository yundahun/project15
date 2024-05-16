package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {

		public static void main(String[] args) {
	
			try {
				//입력 스트림 생성
				FileInputStream fis = new FileInputStream("input.txt");
				
				//문자 하나씩 읽어오기
				System.out.println(fis.read()); // 65
				System.out.println(fis.read()); // 66
				System.out.println(fis.read()); // 67
				System.out.println();
				
				FileInputStream fis2 = new FileInputStream("input.txt");
				
				// 아스키코드를 문자로 변환하여 출력
				System.out.println((char) fis2.read()); // A
				System.out.println((char) fis2.read()); // B
				System.out.println((char) fis2.read()); // C
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
		
}
