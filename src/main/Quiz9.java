package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) throws IOException {

		// 다운로드 폴더에 있는 파일의 목록을 열어서 텍스트 파일에 출력하세요.
		// 만약 하위 폴더가 있다면, 하위폴더의 파일목록도 출력하세요.

		// 재귀함수를 활용해보세요!(예시:팩토리얼)

		// 폴더 경로
		String filepath = "C:\\Users\\G201\\Downloads";

		// 출력스트림
		FileWriter fw = new FileWriter("Quiz9.txt");

		// 메소드 호출
		printFileList(filepath, fw, 0);

	}

	public static void printFileList(String filepath, FileWriter fw, int level) throws IOException {

		File dir = new File(filepath);

		// 폴더 밑에 있는 파일 목록 꺼내기
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {

			// 배열에서 파일 꺼내기
			File file = files[i];

			// 디렉토리 여부 확인
			boolean isDirectory = file.isDirectory();

			// 파일이름꺼내기
			String filename = file.getName();

			StringBuilder builder = new StringBuilder();

			// 들여쓰기로 계층구조 표시
			for (int j = 0; j < level; j++) {
				builder.append("\t");

			}

			builder.append(filename);

			// 파일 이름 출력
			fw.write(builder.toString());

			if (isDirectory) { // 해당 파일이 폴더라면
				fw.write("\n");
				String subfilepath = file.getPath();

				printFileList(subfilepath, fw, level + 1); // 자기 자신을 호출하는 재귀함수
			}

			fw.write("\n");

		}

		fw.flush();
	}

}