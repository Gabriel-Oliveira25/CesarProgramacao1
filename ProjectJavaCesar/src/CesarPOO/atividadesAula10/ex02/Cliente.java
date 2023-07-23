package cesarPOO.atividadesAula10.ex02;

public class Cliente {
	
	private String nome;
	private String endereco;

	public Cliente() {
		
	}
	

	public Cliente(String nome, String endereco, Transacao[] transacao) {
		this.nome = nome;
		this.endereco = endereco;

		this.transacao = transacao;
	}



	public Transacao[] getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao[] transacao) {
		this.transacao = transacao;
	}
	private Transacao[] transacao;
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
