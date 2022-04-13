import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		// Si es que todo v[i]
		// 0<=v[i]<=10000
		int occ[] = new int[10001];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			occ[v[i]] = occ[v[i]] + 1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
		int p = 0;
		for (int i = 0; i <= 10000; i++) {
			while (occ[i] > 0) {
				v[p] = i;
				occ[i] = occ[i] - 1;
				p=p+1;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(v[i]+" ");
		}
		
		
	}

}
