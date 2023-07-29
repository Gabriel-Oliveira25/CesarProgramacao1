package CodigoDiscord.classesAbstratas;

public abstract class MeioDeTransporte extends Object {
	
	private String nome;
	private int velocidade;
	
	public MeioDeTransporte() {
		
	}
	
	public MeioDeTransporte(String nome, int velocidade) {
		this.nome = nome;
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	public abstract void andar();
	
	public abstract void relatorio();
	
}
