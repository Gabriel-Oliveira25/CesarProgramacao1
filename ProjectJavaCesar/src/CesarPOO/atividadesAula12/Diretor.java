package cesarPOO.atividadesAula12;

public class Diretor extends Cargo {
	private double gratificacao;
	
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, double salario) {
		super(nome, salario);
	}
	
	public Diretor(String nome, double salario, double gratificacao) {
		this(nome, salario);
		this.gratificacao = gratificacao;
	}
	
	

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	} 
	
	@Override
	public double rendimentoTotal() {
		return super.getSalarioBase() + this.gratificacao;
	}
	
}