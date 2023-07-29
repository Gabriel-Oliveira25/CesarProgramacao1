package codigosDiscord.classesAbstratas;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

		ArrayList<MeioDeTransporte> meioTransportes = new ArrayList<>();
		
		MeioDeTransporte meioTrans;
		
		meioTrans = new Carro("Fiesta", 150, "Ford", 30);
		meioTransportes.add(meioTrans);
		
		
		meioTrans = new Cavalo("Carpeado", 30, "Caramelo");
		meioTransportes.add(meioTrans);
		

		Relatorio relatorio = new Relatorio();
		
		relatorio.relatorio(meioTransportes);

	}
}
