package cesarPOO.atividadesAula9.Ex1;

public class Vendedor extends Funcionario{
	
	private double venda;
	
	public Vendedor() {
	}
	
	public double getVendas() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public void novaVenda(double venda) {
		
	}
	
	public void comissao() {
		double salario = getSalario();
		setVenda(venda * 0.05);
		setSalario(venda + salario);	
	}
}
