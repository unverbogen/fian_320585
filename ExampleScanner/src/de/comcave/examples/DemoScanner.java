package de.comcave.examples;

import java.util.Scanner;

/**
 * Prinzipien der Programmierung
 * 
 * KISS - Keep it Short & Simple
 * 
 * <code>
 * SOLID - 5 OOP Prinzipien
 * 
 * “Single Responsibility Prinzip”
 * “Open-Closed Prinzip”
 * “Liskovsches Substitutionsprinzip”
 * “Interface Segregation Prinzip”
 * “Dependency Inversion Prinzip”
 * </code>
 * 
 * DRY - Don´t repeat yourself
 * 
 * Pattern:
 * 
 * MVC - Model View Control
 *
 */
public class DemoScanner {

	private Scanner scanner;

	public DemoScanner() {
		scanner = new Scanner(System.in);
	}

	public void leseID() {
		System.out.println("Bitte geben Sie eine Zahl ein.");
		int zahl = scanner.nextInt();// 12345CRLF -> LF
		scanner.nextLine();// LF aus dem Scanner entfernen.
		System.out.println("Die gewählte Zahl lautet :" + zahl);
	}

	public void leseName() {
		System.out.println("Bitte geben Sie einen Text ein.");
		String text = scanner.nextLine();// Hallo WeltCRLF -> ENTFERNT CR und LF
		System.out.println("Ihr Text lautet :" + text);
	}

//	/**
//	 * Achtung kann zu java.util.NoSuchElementException führen
//	 */
//	public void leseID() {
//		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.println("Bitte geben Sie eine Zahl ein.");
//			int zahl = scanner.nextInt();
//
//			System.out.println("Die gewählte Zahl lautet :" + zahl);
//		}
//		/**
//		 * Alle geöffneten Resourcen werden vom ResourcenManager geschlossen sobald das
//		 * try durchgelaufen oder abgebrochen wurde.
//		 */
//
//	}

//	/**
//	 * Achtung kann zu java.util.NoSuchElementException führen
//	 */
//	public void leseName() {
//		try (Scanner scanner = new Scanner(System.in)) {
//			System.out.println("Bitte geben Sie einen Text ein.");
//			String text = scanner.nextLine();// java.util.NoSuchElementException: No line found
//
//			System.out.println("Ihr Text lautet :" + text);
//		}
//	}
}
