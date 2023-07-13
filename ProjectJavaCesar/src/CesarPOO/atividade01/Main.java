package CesarPOO.atividade01;

public class Main {
	public static void main(String[] args) {
		
		Pessoa albertEinstein = new Pessoa();
		Pessoa isaacNewton = new Pessoa();
		
		albertEinstein.ajustarDataDeNascimento(14, 3, 1879);
		albertEinstein.calcularIdade();
		
		isaacNewton.ajustarDataDeNascimento(4, 1, 1643);
		isaacNewton.calcularIdade();
		
		System.out.println("CASO ESTIVESSE VIVO, ALBERT EINSTEIN TERIA: " + albertEinstein.getIdade() 
							+ " ANOS DE IDADE E ISAAC NEWTON TERIA " + isaacNewton.getIdade() + " ANOS DE IDADE");
	}
}
