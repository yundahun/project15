package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 다운로드 폴더에 있는 파일의 목록을 읽어서 텍스트 파일에 출력하세요.
		File file = new File("C:\\Users\\G201\\Downloads");
		
		File[] files = file.listFiles();
		
		try {
			FileWriter fw = new FileWriter("Quiz8.txt");

			for (int i = 0; i < files.length; i++) {
				File file2 = files[i];
				String filename = file2.getName();
				
				fw.write(filename + "\n");
			}
			
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
