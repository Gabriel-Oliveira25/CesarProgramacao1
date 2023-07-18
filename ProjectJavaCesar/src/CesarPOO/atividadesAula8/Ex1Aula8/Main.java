package atividade.Ex1Aula8;

public class Main {

	public static void main(String[] args) {
		Fruta f1 = new Fruta(1, 1);
		Fruta f2 = new Fruta(1, 0);

		System.out.println(f1.getCaroco());
		f1.retirarCaroco();
		System.out.println(f1.getCaroco());
		f1.setCaroco(1);
		System.out.println(f1.getCaroco());
	}
}
