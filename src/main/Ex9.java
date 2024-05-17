package main;

import java.io.FileWriter;
import java.io.IOException;

public class Ex9 {

	public static void main(String[] args) {
		
		try {
			
			// 문자 출력 스트림 생성
			FileWriter fw = new FileWriter ("writer.txt");
			
			fw.write('A'); // 문자 출력
			
			fw.write("안녕하세요"); // 문자열 출력
			
			fw.write('\n'); // 특수기호 출력
			
			char[] arr = {'a', 'b', 'c'};
			fw.write(arr) ; // 배열 출력
			
			// filewriter는 버퍼를 사용하여, 데이터를 모았다가 한번에 출력함
			// 버퍼: 데이터를 임시로 저장하는 공간
			
			fw.flush(); // 버퍼에 남아있는 데이터 강제로 출력
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
