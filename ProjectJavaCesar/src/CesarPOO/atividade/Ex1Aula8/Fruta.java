package atividade.Ex1Aula8;

public class Fruta {
	private int casca;
	private int caroco;
	
	public Fruta() {
		
	}
	
	public Fruta(int casca, int caroco){
		this.casca = casca;
		this.caroco = caroco;
	}

	public int getCasca() {
		return casca;
	}

	public void setCasca(int casca) {
		this.casca = casca;
	}

	public int getCaroco() {
		return caroco;
	}

	public void setCaroco(int caroco) {
		this.caroco = caroco;
	}

	public void retirarCaroco(){
		if (this.caroco == 1) {
			setCaroco(0);
		}else{}
	}


}
