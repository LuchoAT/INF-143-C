
import java.util.Scanner;

class ii {
	private int primero, segundo;

	public int getPrimero() {
		return primero;
	}

	public void setPrimero(int primero) {
		this.primero = primero;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	ii() {
		primero = segundo = 0;
	}

}

public class Main {
	static void quickSort(ii[] x) {
		qsort(x, 0, x.length - 1);
	}

	static void qsort(ii[] x, int l, int u) {
		if (l >= u)
			return;
		int m = l;
		ii temp = new ii();
		for (int i = l + 1; i <= u; i++) {
			if (x[i].getSegundo() == x[l].getSegundo() && x[i].getPrimero() < x[l].getPrimero()) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			} else if (x[i].getSegundo() < x[l].getSegundo()) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			}
		}
		// swap(l, m);
		temp = x[l];
		x[l] = x[m];
		x[m] = temp;
		qsort(x, l, m - 1);
		qsort(x, m + 1, u);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int j = 0; j < k; j++) {
			int n = sc.nextInt();
			ii v[] = new ii[n];
			for (int i = 0; i < n; i++) {
				ii x = new ii();
				x.setPrimero(sc.nextInt());
				x.setSegundo(sc.nextInt());
				v[i] = x;
			}
			quickSort(v);
			for (int i = 0; i < n; i++) {
				System.out.print(v[i].getPrimero()+" ");
			}
			System.out.println();
		}

	}
}
