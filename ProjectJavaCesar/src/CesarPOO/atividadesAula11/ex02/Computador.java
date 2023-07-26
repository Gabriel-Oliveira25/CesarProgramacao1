package cesarPOO.atividadesAula11.ex02;

public class Computador extends Eletronico{
	
	private double cpuClock;
	
	public Computador() {
		
	}
	
	public Computador(String nome, int codigo) {
		super(nome, codigo);
	}
	
	public Computador(String nome, int codigo, double cpuClock) {
		this(nome, codigo);
		this.cpuClock = cpuClock;
	}
	
	public double getCpuClock() {
		return this.cpuClock;
	}
	
	public void setCpuClock(double cpuClock) {
		this.cpuClock = cpuClock;
	}

}
