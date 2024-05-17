package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("Quiz5.txt");

			for (int i = 1; i <= 10; i++) {

				if (i % 2 == 0) {

//					fw.write(i); 숫자로 인식
					fw.write(i + " "); // 문자로 인식
				}
				
			}
			// 버퍼 비우기 안하면 출력 안됨~ 반복문 밖에 써라잉
			fw.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
