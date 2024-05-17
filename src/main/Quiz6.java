package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) {
			
		try {
			FileWriter fw = new FileWriter("Quiz6.txt");
			
			for (int i = 2; i < 10; i++) {
				
				for (int j = 1; j < 10; j++) {
					
					fw.write(i + "*" + j + "= " + (i*j) + '\n');
				}
				fw.write('\n');
			}
			
			fw.flush();
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
