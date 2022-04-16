
import java.util.Scanner;

class paresIntString {
	private int F;
	private String S;

	public int getF() {
		return F;
	}

	public void setF(int f) {
		F = f;
	}

	public String getS() {
		return S;
	}

	public void setS(String s) {
		S = s;
	}

	paresIntString() {
		F = 0;
		S = "";
	}
}

public class Main {
	static void quickSort(paresIntString[] x) {
		qsort(x, 0, x.length - 1);
	}

	static void qsort(paresIntString[] x, int l, int u) {
		if (l >= u)
			return;
		int m = l;
		paresIntString temp = new paresIntString();
		for (int i = l + 1; i <= u; i++) {
			if (x[i].getF() == x[l].getF() && x[i].getS().compareTo(x[l].getS()) > 0) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			} else if (x[i].getF() < x[l].getF()) {
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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		paresIntString v[] = new paresIntString[n];
		for (int i = 0; i < n; i++) {
			paresIntString x = new paresIntString();
			int num = sc.nextInt();
			String cad = sc.next();
			x.setF(num);
			x.setS(cad.substring(1, 2));
			v[i] = x;
		}
		quickSort(v);
		for (int i = 0; i < n; i++) {
			System.out.println(v[i].getF() + " $" + v[i].getS());
		}

	}
}
