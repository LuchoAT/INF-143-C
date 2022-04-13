import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (v[i] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(v[i]+" ");
		}

	}

}
