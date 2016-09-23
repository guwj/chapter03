package chapter03;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("배경사진.jpg");
			fos = new FileOutputStream("배경사진.back.jpg");

			int data = -1;
			while((data = fis.read()) != -1){
				fos.write(data);
				
			}
		} catch (FileNotFoundException ex) {
			System.out.println("error" + ex);
		}catch(IOException ex){
			System.out.println("error" + ex);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}

				if (fos != null) {
					fos.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
