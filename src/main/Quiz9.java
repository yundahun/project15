package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) {

		// 다운로드 폴더에 있는 파일의 목록을 열어서 텍스트 파일에 출력하세요.
		// 만약 하위 폴더가 있다면, 하위폴더의 파일목록도 출력하세요.

		// 재귀함수를 활용해보세요!(예시:팩토리얼)
		try {
			FileWriter fw = new FileWriter("Quiz9.txt");		
			
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void factorial(String s) {
		File file = new File(s);
		File[] files = file.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if (files[i].isFile()) {
				
			}
			
			File file1 = files[i];
			String filename = file1.getName();
			
		}
	} 

}
