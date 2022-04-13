import java.util.Scanner;

public class Main {

	static int sd(int n) {
		int S = 0;
		while (n > 0) {
			S = S + (n % 10);
			n = n / 10;
		}
		return S;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (sd(v[i]) > sd(v[j])) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				} else if ((sd(v[i]) == sd(v[j])) && (v[i] > v[j])) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if(i==0) {
				System.out.print(v[i]);
			}else {
				System.out.print(" "+v[i]);
			}
		}

	}

}
