package chapter03;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반 스트림
			FileReader fr = new FileReader("./src/chapter03/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			String line = null;
			int index = 0;
			
			while ((line = br.readLine()) != null) { // 객체가 null되기 전까지 출력
				System.out.print(index++);
				System.out.print(" : ");
				System.out.println(line);
				
			}
		} catch (IOException ex) {

			System.out.println("오류 : " + ex);

		} finally {

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {

				ex.printStackTrace();
			}

		}

	}
}