package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image2.png");
			byte[] arr = new byte[100];
			while (true) {
				int buf = fis.read(arr);
				if (buf == -1) {
					break;
				}

				fos.write(arr);
			}
			fos.flush();
			fos.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간 " + (end - start));
	}

	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/date2.dat");
			byte[] arr = new byte[2];
			while (true) {
				int buf = fis.read(arr); // 10, 20 ,30
				if (buf == -1) {
					break;
				}
				for (int i = 0; i < buf; i++) {
					System.out.println(arr[i]);
				}

				System.out.println();
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void write2() {
		byte[] arr = new byte[] { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/date2.dat");
			fos.write(arr);//
			fos.flush();//
			fos.close();//

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	// 바이트 기반 입력스트림
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");
			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

//바이트 기반 출력 스트림.
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");

	}
}
