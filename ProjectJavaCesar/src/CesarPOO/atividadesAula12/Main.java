package cesarPOO.atividadesAula12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cargo cargo;
		RelatorioCargos relatorio = new RelatorioCargos();
		ArrayList<Cargo> cargos = new ArrayList<Cargo>();
		
		
		cargo = new Gerente("Gabriel", 4000.0, 35);
		cargos.add(cargo);
		
		cargo = new Diretor("Zé", 10000.0, 1500);
		cargos.add(cargo);

		cargo = new DiretorEstatutario("Oliveira", 5000.0, 50.0, 50);
		cargos.add(cargo);
		
		cargos.stream().forEach(lambda -> {
			relatorio.relatorio(lambda);
			System.out.println("-----------------");
		});
	}
}
