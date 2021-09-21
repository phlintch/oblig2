package obligopg;

public class O1A {
	package Oppgaver;

	public class O1A {
		// a)
				public static void skrivUt(int[] tabell) {

					for (int i = 0; i < tabell.length; i++) {
						System.out.println("tabell[" + i + "] = " + tabell[i]);
					}
				}

				// b)
				public static String tilStreng(int[] tabell) {

					String retur = "[";
					for (int i = 0; i < tabell.length; i++) {
						if (i == 0) {
							retur += tabell[i];
						} else {
							retur += "," + tabell[i];
						}
					}
					retur += "]";
					return retur;
				}

				// c)
				public static int summer(int[] tabell) {

					int retur = 0;
					for (int i = 0; i < tabell.length; i++) {
						retur += tabell[i];
					}
					return retur;
				}

				// d)
				public static boolean finnesTall(int[] tab, int t) {

					for (int i = 0; i < tab.length; i++) {
						if (tab[i] == t) {
							return true;
						} else {

						}
					}
					return false;
				}

				// e)
				public static int posisjonTall(int[] tabell, int tall) {

					int retur = -1;
					for (int i = 0; i < tabell.length; i++) {
						if (tabell[i] == tall) {
							return i;
						}

					}
					return retur;
				}

				// f)
				public static int[] reverser(int[] tabell) {

					int teller = tabell.length;
					int[] retur = new int[teller];

					for (int i = 0; i < tabell.length; i++) {
						retur[teller - 1] = tabell[i];
						teller--;
					}
					return retur;
				}

				// g)
				public static boolean erSortert(int[] tabell) {

					boolean retur = true;
					int x = 0;
					for (int i = 0; i < tabell.length; i++) {
						if (i == 0) {
							x = tabell[i];
						} else {
							if (Math.min(x, tabell[i]) == tabell[i]) {
								retur = false;
							}
						}
					}
					return retur;
				}

				// h)
				public static int[] settSammen(int[] tabell1, int[] tabell2) {

					int lengde = tabell1.length + tabell2.length;
					int teller = 0;
					int[] retur = new int[lengde];
					for (int i = 0; i < tabell1.length; i++) {
						retur[i] = tabell1[i];
						teller = i + 1;
					}
					for (int i = 0; i < tabell2.length; i++) {
						retur[teller] = tabell2[i];
						teller++;
					}
					return retur;
				}
	}

}
