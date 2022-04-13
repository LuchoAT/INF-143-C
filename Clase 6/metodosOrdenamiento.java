import java.util.BitSet;
import java.util.Scanner;

public class MetodosOrdenamiento {

	static void mostrar(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		System.out.println(" ");
	}

	static void Burbuja(int[] x) {
		int i, j, temp;
		int n = x.length;
		for (i = (n - 1); i >= 0; i--) {
			for (j = 1; j <= i; j++) {
				if (x[j - 1] > x[j]) {
					temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
	}

	static void Insercion(int[] x) {
		int i, j, temp;
		int n = x.length;
		for (i = 1; i < n; i++) {
			for (j = i; j > 0 && x[j - 1] > x[j]; j--) {
				temp = x[j - 1];
				x[j - 1] = x[j];
				x[j] = temp;
			}
		}
	}

	static void Seleccion(int[] x) {
		int i, j;
		int min, temp;
		int n = x.length;
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (x[j] < x[min])
					min = j;
			}
			temp = x[i];
			x[i] = x[min];
			x[min] = temp;
		}
	}

	static void quickSort(int[] x) {
		qsort(x, 0, x.length - 1);
	}

	static void qsort(int[] x, int l, int u) {
		if (l >= u)
			return;
		int m = l, temp;
		// invariante los valores entre x[m] y x[i] son menores al pivote x[l]
		for (int i = l + 1; i <= u; i++) {
			if (x[i] < x[l]) {
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

	static void bitSort(int[] x) {
		int max = 0, j = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max)
				max = x[i];
		}
		BitSet a = new BitSet(max + 1);
		// Hasta aqui todos los valores de
		// a estan en cero
		for (int i = 0; i < x.length; i++)
			a.set(x[i]);
		for (int i = 0; i <= max; i++) {
			if (a.get(i))
				x[j++] = i;
		}
	}

	static void MergeSort(int[] x) {
		if (x.length < 2)
			return; // No requiere Ordenar
		int mitad = x.length / 2;
		int left[] = new int[mitad];
		int right[] = new int[x.length - mitad];
		for (int i = 0; i < mitad; i++) { // copiar la mitad izquierda
			left[i] = x[i];
		}
		for (int i = 0; i < x.length - mitad; i++) { // copiar la mitad derecha
			right[i] = x[mitad + i];
		}
		MergeSort(left);
		MergeSort(right);
		merge(left, right, x);
	}

	static void merge(int[] a, int[] b, int[] intercalado) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) { // merge back
			if (a[i] < b[j]) {
				intercalado[k] = a[i];
				i++;
			} else {
				intercalado[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < a.length) { // Sobrante izquierdo
			intercalado[k++] = a[i++];
		}
		while (j < b.length) { // Sobrante derecho
			intercalado[k++] = b[j++];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			double x=(Math.random()*10000)+0;
			A[i]=(int)x;
		}
		mostrar(A);
		//Ordenamiento burbuja
		//Burbuja(A);
		//mostrar(A);
		//Ordenamiento por insercion
		//Insercion(A);
		//mostrar(A);
		//Ordenamiento por seleccion
		//Seleccion(A);
		//mostrar(A);
		//Ordenamiento quickSort
		//quickSort(A);
		//mostrar(A);
		//Ordenamiento bitSort
		//bitSort(A);
		//mostrar(A);
		//Ordenamiento MergeSort
		MergeSort(A);
		mostrar(A);		
	}
	
}
