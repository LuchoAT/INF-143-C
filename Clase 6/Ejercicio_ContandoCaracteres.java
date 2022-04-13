import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String cad = sc.nextLine();
			int occ[] = new int[30];
			for (int i = 0; i < cad.length(); i++) {
				char c = cad.charAt(i);
				int valorNumerico = c;
				valorNumerico = valorNumerico - 65;
				occ[valorNumerico] = occ[valorNumerico] + 1;
			}
			for (int i = 0; i <= 25; i++) {
				if (occ[i] > 0) {
					char c = (char) ('A' + i);
					System.out.println(c + "=" + occ[i]);
				}
			}
			System.out.println();
		}
	}

}
