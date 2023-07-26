package cesarPOO.atividadesAula11.ex02;

public class Eletronico {	
	
	private String nome;
	private int codigo;
	
	public Eletronico() {
		
	}
	
	public Eletronico(String nome) {
		this.nome = nome;
	}
	
	public Eletronico(String nome, int codigo) {
		this(nome);
		this.codigo = codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
