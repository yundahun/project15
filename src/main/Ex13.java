package main;

import java.io.File;

public class Ex13 {

	public static void main(String[] args) {
		
		
		//File: 파일 정보를 담는 클래스 (활용도가 제일 높음!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		
		// newFIle.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\YunDaHunback\\newFile.txt"); // 본인 파일 경로를 작성
			
//		try {
			// 실제 파일 생성
//			file.createNewFile();
			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 파일 속성 보기
//		System.out.println(file.isFile()); // 파일인지?
//		System.out.println(file.isDirectory()); // 폴더인지
//		System.out.println(file.getName()); // 파일이름
//		System.out.println(file.getAbsolutePath()); // 파일경로
//		System.out.println(file.getPath()); // 파일경로
//		System.out.println(file.canRead()); // 읽을 수 있는지?
//		System.out.println(file.canWrite()); // 쓸 수 있는지?
		
		// 파일 삭제
//		file.delete();
		
		File dir = new File("C:\\YunDaHunback");
		
		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for (File f : files) {
			System.out.println(f.toString()); 
		}
	}
}
