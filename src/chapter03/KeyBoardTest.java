package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// 기반 스트림은 표준 입력 System.in(바이트 기반) -> 키보드와 연결하는 기반 스트림을 자바가
			// System.in 이라고 해놓았으므로 따로 new 할 필요가 없다

			// 보조 스트림(byte -> char)
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			// 보조 스트림( 라인단위로 읽음)
			br = new BufferedReader(isr);

			String inputLine = null;
			while ((inputLine = br.readLine()) != null) {
				if ("exit".equals(inputLine) == true) {
					return;
				}

				System.out.println(">>" + inputLine);
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
