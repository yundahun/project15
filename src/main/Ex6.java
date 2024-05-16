package main;

import java.io.FileOutputStream;

public class Ex6 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			byte a = 65;
			byte b = 66;
			
			fos.write(a); // 66 -> A 문자로 변환되어 저장됨
			fos.write(b);
			fos.write('C'); // 문자 그대로 저장됨
			
			
		} catch (Exception e) {
			
			
		}

	}

}
