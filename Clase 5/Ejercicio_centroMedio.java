import java.util.Scanner;

public class Main {
	static long F(long n) {
		return (n * (n + 1)) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Para multiples casos (EOF)
		while (sc.hasNext()) {
			long n;
			n = sc.nextLong();
			// [1, n]
			long L = 1, R = n + 1;
			while (R - L > 1) {
				long mitad = (L + R) / 2;
				if (F(mitad - 1) <= F(n) - F(mitad)) {
					L = mitad;
				} else {
					R = mitad;
				}
			}
			if (F(L - 1) == F(n) - F(L)) {
				System.out.println(L);
			} else {
				System.out.println("NO");
			}
		}
	}

}
