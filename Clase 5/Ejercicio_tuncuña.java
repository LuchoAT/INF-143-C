import java.util.Scanner;

public class Main {
	static long F(long n) {
		return (n * (n + 1)) / 2;
	}

	public static void main(String[] args) {
		// Busqueda binaria sobre una funcion
		Scanner sc = new Scanner(System.in);
		// t-casos de prueba
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			long x = sc.nextLong();
			long L = 1, R = 2000000001;
			while (R - L > 1) {
				long mitad = (L + R) / 2;
				if (F(mitad) <= x) {
					L = mitad;
				} else {
					R = mitad;
				}
			}
			if (x == F(L)) {
				System.out.println("Go On Bob " + L);
			} else {
				System.out.println("Better Luck Next Time");
			}
		}
	}

}
