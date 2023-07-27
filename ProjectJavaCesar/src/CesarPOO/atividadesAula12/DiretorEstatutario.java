package cesarPOO.atividadesAula12;

public class DiretorEstatutario extends Diretor {
	private double percentualLucro;
	
	public DiretorEstatutario() {
		
	}

	public DiretorEstatutario(String nome, double salario, double gratificacao) {
		super(nome, salario, gratificacao);
		
	}

	public DiretorEstatutario(String nome, double salario, double gratificacao, double percentualLucro) {
		this(nome, salario, gratificacao);
		this.percentualLucro = percentualLucro;
	}


	public double getPercentualLucro() {
		return percentualLucro;
	}

	public void setPercentualLucro(double percentualLucro) {
		this.percentualLucro = percentualLucro;
	} 
	
	@Override
	public double rendimentoTotal() {
		double rendimentoDiretor = super.rendimentoTotal();
		return rendimentoDiretor + rendimentoDiretor * percentualLucro/100;
	}
	
}