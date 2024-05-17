package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("reader.txt");
			
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i == -1) {
					break;
				} 
				System.out.print(i + " ");
			}
			System.out.println();
			
			// 보조스트림 생성
			FileInputStream fis1 = new FileInputStream("reader.txt");
			InputStreamReader isr1 = new InputStreamReader(fis1); // 인자로 기반스트림 넣기
			
			while (true) {
				int i = isr1.read(); // 내용을 문자(2byte)로 변환하여 가지고옴
				if (i == -1) {                           
					break;
				} 
				System.out.print(i + " "); // 50504 45397 54616 49464 50836
			}
			System.out.println();
			
			FileInputStream fis2 = new FileInputStream("reader.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			
			while (true) {
				int i = isr2.read(); 
				if (i == -1) {
					break;
				} 
				System.out.print((char) i);
			}
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
