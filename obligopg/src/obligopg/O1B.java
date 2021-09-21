package obligopg;

public class O1B {
	// a)
		public static void skrivUt(int[][] matrise) {
			
			for (int i = 0; i < matrise.length; i++) {
				for (int j = 0; j < matrise[i].length; j++) {
					if (j == 0) {
						System.out.print(matrise[i][j]);
					} else {
						System.out.print(", " + matrise[i][j]);
					}
				}
				System.out.print("\n");
			}

		}

		// b)
		public static String tilStreng(int[][] matrise) {

			String x = "";
			for (int j = 0; j < matrise.length; j++) {
				for (int i = 0; i < matrise[j].length; i++) {
					if (i < matrise[j].length - 1) {
						x += matrise[j][i] + " ";
					} else {
						x += matrise[j][i] + " \n";
					} 
				}
			}
			return x;
		}

		// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			
			int[][] x = new int[matrise.length][matrise[0].length];
			for (int j = 0; j < matrise.length; j++) {
				for (int i = 0; i < matrise[j].length; i++) {
					x[j][i] = matrise[j][i] * tall;

				}
			}
			return x;
		}

		// d)
		public static boolean erLik(int[][] a, int[][] b) {

			if (a.length == b.length) {
				for (int j = 0; j < a.length; j++) {
					for (int i = 0; i < a[j].length;) {
						if (a[j][i] == b[j][i]) {
							i++;
						} else {
							return false;
						}
					}
				}
			}
			return true;
		}
		
		// e)

		public static int[][] speile(int[][] matrise) {
			int[][] returTab = new int[matrise.length][matrise[0].length];
			for (int i = 0; i < matrise.length;i++) {
				for (int j = 0; j < matrise[i].length; j++) {
					returTab[i][j] = matrise[j][i];
				}
			}
			return returTab;
		}

		// f)
		public static int[][] multipliser(int[][] mat1, int[][] mat2) {

			int nyTabLengde = Math.min(mat1.length, mat2.length);
			int[][] returTab = new int[nyTabLengde][nyTabLengde];
			int x = 0;
			int y = 0;
			int teller = 0;
			for (int a = 0; a < Math.min(mat1.length, mat2.length); a++) {
				for (int a1 = 0; a1 < Math.min(mat1.length, mat2.length); a1++) {
					for (int b = 0; b < Math.max(mat1.length, mat2.length); b++) {
						teller += mat1[a][b] * mat2[b][a1];
					}

					returTab[x][y] = teller;
					y++;
					teller = 0;
				}

				y = 0;
				x++;
			}
			return returTab;
		}
}
