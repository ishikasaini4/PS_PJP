package q2;

import java.util.Scanner;

public class Matrix {
	private int[][] m;

	public Matrix() {
		this.m = new int[3][3];
	}

	public Matrix(int x, int y) {
		this.m = new int[x][y];
	}

	public Matrix(int[][] that) {
		this.m = that;
	}

	public Matrix(Matrix ob) {
		this.m = ob.m;
	}

	public void read() {
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = scn.nextInt();
			}
		}
	}

	public void display() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public int[][] add(int[][] n) {
		if ((m.length != n.length) || (m[0].length != n[0].length))
			return null;

		int[][] addition = new int[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				addition[i][j] = m[i][j] + n[i][j];
			}
		}
		return addition;
	}

	public boolean isScalar() {
		int val = -1;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {

				if (i == j) {
					if (i == 0 && j == 0) {
						val = m[i][j];
					} else if (m[i][j] != val)
						return false;
				} else {
					if (m[i][j] != 0)
						return false;
				}
			}
		}
		return true;
	}

	public int[][] multiply(int[][] n) {
		if (m[0].length != n.length)
			return null;

		int[][] mult = new int[m.length][n[0].length];

		for (int i = 0; i < mult.length; i++) {
			for (int j = 0; j < mult[0].length; j++) {
				for (int k = 0; k < m[0].length; k++) {
					mult[i][j] += (m[i][k] * n[k][j]);
				}
			}
		}
		return mult;
	}
}
