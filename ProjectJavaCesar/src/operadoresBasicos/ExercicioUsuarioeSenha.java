package operadoresBasicos;

import java.util.Scanner;

public class ExercicioUsuarioeSenha{
	
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String login = "Gabriel";
		String senha = "Gabriel123";
		
		System.out.print("Login: ");
		String usuario = sc.nextLine();
		System.out.print("Senha: ");
		String usuarioSenha = sc.nextLine();
		
		if (usuario.equals(login) && usuarioSenha.equals(senha)) {
			System.out.println("Login validado!");
		} else {
			System.out.println("Usuário ou senha incorreto!");
		}
	}
}
