package main;

import java.io.FileOutputStream;

public class Ex7 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");
			
			// 배열 생성
			byte[] arr = { 65, 66, 67 };
			
			// 배열을 사용해서 내용 쓰기. 배열의 모든 내용을 한번에 출력
			fos.write(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
