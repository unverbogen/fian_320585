package de.comcave.examples;

public class DemoArraySortieren {

	public static void main(String[] args) {
//		char[] zeichen = {'a','d','f','g','h','j','x','l','p'};

		int[] zahlen = { 42, 44, 54, 458, 41, 1, 5, 4, 6, 9, 0, 7, 8, 3, 2, 22, 1, 2, 4, 5, 9, 7, 4, 11, 1121, 43 };

		for (int i : zahlen) {
			System.out.print(i + ", ");
		}
		System.out.println();
		/**
		 * Aufgabe: Das Array zahlen soll eigenständig, ohne Hilfsklassen, sortiert
		 * werden.
		 */
		for (int j = 0; j < zahlen.length; j++) {
			for (int i = 0; i < zahlen.length - j - 1; i++) {
				/**
				 * Vergleichen nach größe von i und i+1
				 */
				if (zahlen[i] > zahlen[i + 1]) {
					/**
					 * Wenn zahl[i] größer als zahl[i+1] dann tausche beide zahlen aus.
					 */
					int tmp = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = tmp;
				}
			}
		}
		for (int i : zahlen) {
			System.out.print(i + ", ");
		}

//		for (int i : zahlen) {
//			System.out.print(i + ", ");
//		}
//		System.out.println();
//		Arrays.sort(zahlen);
//		for (int i : zahlen) {
//			System.out.print(i + ", ");
//		}

	}

}
