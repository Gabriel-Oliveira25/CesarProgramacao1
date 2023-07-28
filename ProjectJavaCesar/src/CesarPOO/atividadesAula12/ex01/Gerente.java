package cesarPOO.atividadesAula12.ex01;

public class Gerente extends Cargo {
	private double percentualBonus;

	
	public Gerente() {
		
	}
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public Gerente(String nome, double salario, double percentualBonus) {
		this(nome, salario);
		this.percentualBonus = percentualBonus;
	}
	
	
	public double getPercentualBonus() {
		return percentualBonus;
	}

	public void setPercentualBonus(double percentualBonus) {
		this.percentualBonus = percentualBonus;
	} 
	
	@Override
	public double rendimentoTotal() {
		return super.getSalarioBase() + super.getSalarioBase() * percentualBonus / 100;
	}
}