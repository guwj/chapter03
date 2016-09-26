package chapter03;

import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		
		try {
			// 기반 스트림(Byte단위 기반 스트림)
			FileInputStream fis = new FileInputStream("ms949.txt");

			// 보조 스트림(ms949 -> UTF-8)
			 isr = new InputStreamReader(fis, "MS949"); // MS949를 UTF-8로 바꾸라는 소리
			
			int data = -1;
			while( (data = isr.read()) != -1){
				System.out.print( (char)data);
			}
		} catch (IOException ex) {
			System.out.println("오류 : " + ex);
		}finally{
			try{
				if(isr != null){
				isr.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}

	}

}
