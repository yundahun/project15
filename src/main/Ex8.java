package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

   public static void main(String[] args) {
      
      try {
         // 바이트 입력 스트림 생성
         FileInputStream fis = new FileInputStream("reader.txt");
         
         while (true) {
            int i = fis.read(); // 1바이트씩 읽기
            
            if ( i == -1) {
               break;
            }
            
            System.out.print((char) i); // 한글은 1byte로 표현할 수 없어서 모두 깨짐
         }
         
         System.out.println();
         
         FileReader fr = new FileReader("reader.txt");
         
         while (true) {
            int i = fr.read(); // 2바이트씩 읽기
            if (i == -1) {
               break;
            }
            System.out.print((char)i); // 한글을 제대로 읽어옴
         }
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
   }

}