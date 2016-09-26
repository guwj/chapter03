package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		BufferedOutputStream bos = null;
		
		try {
			// 기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("01234.txt");
			// 보조 스트림(기반스트림과 연결)
			bos = new BufferedOutputStream(fos, 5);	//(기반스트림, 버퍼사이즈)	-> 사이즈가 다 차면 파일에 입력하는 방식
			
			for(int i = '0' ; i < '9' ; i++){
				bos.write(i);
				bos.flush(); 	// 내부 버퍼를 비움(파일에 쓰기)
			}
			// '0'과 '9'의 아스키코드 값이 사용되는 것이므로 for(int i = 48 ; i < 57 ; i++)와 같은 식이다
		}catch (FileNotFoundException ex) {
			System.out.println("오류 : " + ex);
		}catch (IOException ex){
			System.out.println("오류 : " + ex);
		}finally{
			try{
				if(bos != null){
				bos.close();		//보조 스트림만 닫으면 기반 스트림도 자동으로 닫힘
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
