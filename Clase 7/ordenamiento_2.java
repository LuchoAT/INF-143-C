
import java.util.Scanner;

class iss {
	private int primero;
	private String segundo, tercero;

	public int getPrimero() {
		return primero;
	}

	public void setPrimero(int primero) {
		this.primero = primero;
	}

	public String getSegundo() {
		return segundo;
	}

	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}

	public String getTercero() {
		return tercero;
	}

	public void setTercero(String tercero) {
		this.tercero = tercero;
	}

	iss() {
		primero = 0;
		segundo = tercero = "";
	}

}

public class Main {
	static void quickSort(iss[] x) {
		qsort(x, 0, x.length - 1);
	}

	static void qsort(iss[] x, int l, int u) {
		if (l >= u)
			return;
		int m = l;
		iss temp = new iss();
		for (int i = l + 1; i <= u; i++) {
			if (x[i].getPrimero() == x[l].getPrimero() && x[i].getSegundo().equals(x[l].getSegundo())
					&& x[i].getTercero().compareTo(x[l].getTercero()) < 0) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			} else if (x[i].getPrimero() == x[l].getPrimero() && x[i].getSegundo().compareTo(x[l].getSegundo()) > 0) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			} else if (x[i].getPrimero() < x[l].getPrimero()) {
				temp = x[++m];
				x[m] = x[i];
				x[i] = temp;
			}
		}
		temp = x[l];
		x[l] = x[m];
		x[m] = temp;
		qsort(x, l, m - 1);
		qsort(x, m + 1, u);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		iss v[] = new iss[n];
		for (int i = 0; i < n; i++) {
			iss x = new iss();
			int num = sc.nextInt();
			x.setPrimero(num);
			String cad = sc.next();
			x.setSegundo(cad.substring(1, 2));
			x.setTercero(cad.substring(2, 3));
			v[i] = x;
		}
		quickSort(v);
		for(int i=0;i<n;i++) {
			System.out.println(v[i].getPrimero()+" $"+v[i].getSegundo()+v[i].getTercero());
		}
	}

}
