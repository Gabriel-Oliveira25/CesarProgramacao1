package cesarPOO.atividadesAula8.ex2;

public class Lampada {
    private boolean status;
    private int watts;

    public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	public Lampada(boolean status){
        this.status = status;
    }

    public Lampada(boolean status, int watts){
        this.status = status;
        this.watts = watts;     
    }

    public Lampada(){
        this.status = false;
        this.watts = 60;
    }
    
}
