package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {

		double a = 8;
		double b = 3;
		
		double loesung1 = ((a + b)*(a + b));
		double loesung2 = ((a * a) + (2 * a * b) + (b * b));
		
		System.out.println("Ergebnis 1 = " + loesung1);
		System.out.println("Ergebnis 2 = " + loesung2);
		
				

	}

}
