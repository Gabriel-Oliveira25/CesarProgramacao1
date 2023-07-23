package cesarPOO.atividadesAula10.ex02;

public class Transacao {
	private double valor;



	public Transacao() {
		
	}
	
	
	public Transacao(double valor, Cliente cliente) {

		this.valor = valor;

	}




	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
