package chapter03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList2 {
	// PhoneList01의 코딩을 Scanner를 통해서 개선
	public static void main(String[] args) {
		Scanner scanner = null;
		
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
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String name = scanner.next(); // \t이건 spacebar건 String 단위로 끊어줌
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();
				
//				int num01 = scanner.nextInt();
//				int num02 = scanner.nextInt();
//				int num03 = scanner.nextInt();

				System.out.println(name + ": " + phone01 + " - " + phone02 + " - " + phone03);
//				System.out.println(name + ": " + num01 + " - " + num02 + " - " + num03);
			}

		} catch (IOException ex) {
			System.out.println("오류 : " + ex);
		} finally {
			scanner.close();
		}
	}
}
