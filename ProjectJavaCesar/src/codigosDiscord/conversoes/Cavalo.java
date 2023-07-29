package codigosDiscord.conversoes;

public class Cavalo extends MeioDeTransporte{
	
	private String raça;
	
	
	public Cavalo() {
		
	}
	
	public Cavalo(String nome, int velocidade, String raça) {
		super(nome, velocidade);
		this.raça = raça;

	}
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		
		this.raça = raça;
	}
	
	
	
}
