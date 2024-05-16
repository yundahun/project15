package main;

import java.io.FileOutputStream;

public class Quiz4 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("output3.txt");
			
//			fos.write(65); fos.write(66); fos.write(67);
//			fos.write(68); fos.write(69); fos.write(70);
//			fos.write(71); fos.write(72); fos.write(73);
//			fos.write(74); fos.write(75); fos.write(76);
//			fos.write(77); fos.write(78); fos.write(79);
//			fos.write(80); fos.write(81); fos.write(82);
//			fos.write(83); fos.write(84); fos.write(85);
//			fos.write(86); fos.write(87); fos.write(88);
//			fos.write(89); fos.write(90);
			
			for (int i = 65; i < 91; i++) {
				fos.write(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
