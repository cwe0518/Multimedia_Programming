package cha05_exercises;

public class Minesweeper {

	public static void main(String[] args) {
		createMines(5, 8, 0.3);

	}

	public static void createMines(int m, int n, double p) {
		String[][] map = new String[m][n];
		double quantityOfMines = Math.round((m * n) * p);

		int row, col;

		while (quantityOfMines != 0) {
			row = (int) (Math.random() * m);
			col = (int) (Math.random() * n);

			if (map[row][col] != "*") {
				map[row][col] = "*";

				quantityOfMines--;
			}

		}

		printMap(m, n, map);
		countMines(m, n, map);
		printMap(m, n, map);
	}

	public static void printMap(int m, int n, String[][] map) {
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < n; k++) {
				if (map[i][k] == null) {
					System.out.print("- ");
				} else {
					System.out.print(map[i][k] + " ");
				}
			}

			System.out.println();
		}
	}

	public static void countMines(int m, int n, String[][] map) {
		int count = 0;
		System.out.println();

		/*
		 * for(int i = 0; i < m; i++) { for(int k = 0; k < n; k++) {
		 * 
		 * if(map[i][k] == null) { count = 0;
		 * 
		 * if(i > 0 && k > 0) count += map[i-1][k-1] == null ? 0 : 1;
		 * 
		 * if(i > 0) count += map[i-1][k] == null ? 0 : 1;
		 * 
		 * if(i > 0 && k+1 < n) count += map[i-1][k+1] == null ? 0 : 1;
		 * 
		 * if(k > 0) count += map[i][k-1] == null ? 0 : 1;
		 * 
		 * if(i > 0 && k+1 < n) count += map[i][k+1] == null ? 0 : 1;
		 * 
		 * if(i+1 < m && k > 0) count += map[i+1][k-1] == null ? 0 : 1;
		 * 
		 * if(i+1 < m) count += map[i+1][k] == null ? 0 : 1;
		 * 
		 * if(i+1 < m && k+1 < n) count += map[i+1][k+1] == null ? 0 : 1;
		 * 
		 * System.out.print(count + " ");
		 * 
		 * 
		 * } else { System.out.print("* "); }
		 * 
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */

		for (int i = 0; i < m; i++) {
			for (int k = 0; k < n; k++) {

				if (map[i][k] != "*") { // 지뢰(*)가 설치되지 않은 위치이면
					if (i - 1 >= 0) {
						if (k - 1 >= 0 && map[i - 1][k - 1] == "*")
							count++;
						if (k + 1 < n && map[i - 1][k + 1] == "*")
							count++;
						if (map[i - 1][k] == "*")
							count++;
					}

					if (i + 1 < m) {
						if (k - 1 >= 0 && map[i + 1][k - 1] == "*")
							count++;
						if (k + 1 < n && map[i + 1][k + 1] == "*")
							count++;
						if (map[i + 1][k] == "*")
							count++;
					}

					if (k - 1 >= 0 && map[i][k - 1] == "*")
						count++;
					if (k + 1 < n && map[i][k + 1] == "*")
						count++;

					map[i][k] = String.valueOf(count);
					count = 0; /* 카운트 초기화 */
				}
			}

		}

	}

}
