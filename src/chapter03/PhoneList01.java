package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			File file = new File("phone.txt"); // File 클래스가 정보를 좀 더 준다고 한다

			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다");
				return;
			}

			System.out.println("************ 파일정보 ************");
			System.out.println(file.getAbsolutePath()); // file의 full path를 출력
			System.out.println(file.length() + "Byte"); // file의 사이즈 출력

			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			System.out.println(sdf.format(date));

			System.out.println("************ 전화번호 목록 ************");

			// 기반 스트림(Byte기반으로 해보자)
			FileInputStream fis = new FileInputStream(file);

			// 보조 스트림(byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

			// 보조 스트림 (버퍼를 가지고 있어서 Line단위로 입력할 수 있게 해줌)
			br = new BufferedReader(isr);

			String line = null;

			while ((line = br.readLine()) != null) {
				// line에 들어온 String을 \t과 spacebar로 분리하겠다는 의미, 순서 상관x
				StringTokenizer st = new StringTokenizer(line, " \t");
				int index = 0;
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (index == 0) { // 이름
						System.out.print(token + ": ");
					} else if (index == 3) {
						System.out.print(token);
					} else {
						System.out.print(token + " - ");
					}
					index++;
				}
				System.out.println();
			}
		} catch (IOException ex) {
			System.out.println("오류 : " + ex);
		} finally {
			try{
				if(br != null){
					br.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
