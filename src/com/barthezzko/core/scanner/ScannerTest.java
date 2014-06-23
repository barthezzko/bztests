package com.barthezzko.core.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;


public class ScannerTest {

	public static void main(String ... args) throws IOException{
		Scanner scanner = new Scanner(new File("data/scanner_data.txt"));
		while (scanner.hasNext()){
			System.out.println(scanner.next());
		}
		scanner.close();
	}
	
	@Test
	public void scanInts() throws IOException{
		Scanner scanner = new Scanner(new File("data/scanner_data_int.txt"));
		scanner.useDelimiter("'");
		while (scanner.hasNextInt()){
			System.out.println(scanner.nextInt());
		}
		scanner.close();
	}
}
