package cesarPOO.atividade03;


public class Main {

	public static void main(String[] args) {
		
		University un = new University("Uva");
		
		
		University un2 = new University("Uva");
		

		
		
		
		System.out.println(un);
		System.out.println(un2);
		
		
		System.out.println(un.getNome().equals(un2.getNome()));
		
		

	}
}
