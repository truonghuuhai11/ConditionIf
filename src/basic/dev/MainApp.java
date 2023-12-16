package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v, n, m;
		Scanner sc = new Scanner(System.in);
		/**
		 * 9.1
		 */
		System.out.println("A = ");
		v = sc.nextInt();

		if (v > 0) {
			System.out.println(v + " Là số nguyên dương");
		} else {
			if (v == 0) {
				System.out.println(v + " Không là số nguyên dương, nguyên âm");
			} else {
				System.out.println(v + " Là số nguyên âm");
			}
		}
		/**
		 * 9.2
		 */
		System.out.println("B = ");
		n = sc.nextInt();
		if (n % 3 == 0) {
			System.out.println(n + " Là số chia hết cho 3");
		} else {
			System.out.println(n + " Không chia hết cho 3");
		}
		if (n % 5 == 0) {
			System.out.println(n + " Là số chia hết cho 5");
		} else {
			System.out.println(n + " Không chia hết cho 5");
		}
		/**
		 * 9.3
		 */
		System.out.println("Nhập vào tháng : ");
		m = sc.nextInt();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.println("Tháng " + m + " có 31 ngày");
		}
		if (m == 2) {
			System.out.println("Tháng " + m + " có 28 hoặc 29 ngày");
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("Tháng " + m + " có 30 ngày");
		} else {
			if (m > 12 || m < 1) {
				System.out.println("Không có tháng " + m);
			}
		}
		/**
		 * 9.4
		 */
		double a, b, c, x1, x2, delta;
		System.out.println("nhập vào a = ");
		a = sc.nextDouble();
		System.out.println("nhập vào b = ");
		b = sc.nextDouble();
		System.out.println("nhập vào c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}
		/**
		 * 9.5
		 */
		System.out.print("Nhập độ dài cạnh a: ");
		int u = sc.nextInt();
		System.out.print("Nhập độ dài cạnh b: ");
		int i = sc.nextInt();
		System.out.print("Nhập độ dài cạnh c: ");
		int o = sc.nextInt();

		if ((u + i > o) && (u + o > i) && (i + o > u)) {
			System.out.println("a, b, c là độ dài của ba cạnh của một tam giác.");
		} else {
			System.out.println("a, b, c không phải là độ dài của ba cạnh của một tam giác.");
		}
	}

}
