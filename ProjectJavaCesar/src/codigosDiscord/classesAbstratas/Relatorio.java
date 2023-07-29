package codigosDiscord.classesAbstratas;

import java.util.ArrayList;


public class Relatorio {
	
	public void relatorio(ArrayList<MeioDeTransporte> meioTransportes) {	
		for (MeioDeTransporte meioDeTransporte : meioTransportes) {
			meioDeTransporte.relatorio();
			System.out.println("-------------------------------------------");
		}
	}
}
