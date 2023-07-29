package codigosDiscord.classesAbstratas;


public class Carro extends MeioDeTransporte implements Locomover{
	
	private String marca;
	private int capacidadeTanque;
	
	public Carro() {
		
	}
	
	public Carro(String nome, int velocidade, String marca, int capacidadeTanque) {
		super(nome, velocidade);
		this.marca = marca;
		this.capacidadeTanque = capacidadeTanque;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	@Override
	public void andar() {
		System.out.println("ANDAR COM RODAS");
	}
	
	@Override
	public void relatorio() {
		System.out.println("NOME: " + super.getNome());
		System.out.println("VELOCIDADE: " + super.getVelocidade());
		System.out.println("MARCA: " + this.marca);
		System.out.println("NOME: " + this.capacidadeTanque);

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void andando() {
		// TODO Auto-generated method stub
		
	}
	
	

}
