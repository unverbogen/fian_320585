package de.comcave.examples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBufferedStream {

	public static void main(String[] args) {
		BufferedInputStream bis = new BufferedInputStream(System.in);

		InputStreamReader isr = new InputStreamReader(bis);

		BufferedReader br = new BufferedReader(isr);

		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
