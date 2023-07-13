package vetoreseMatrizes;

public class Exercicio03 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		int c[] = new int[10];
		
		for(int con=0; con<a.length; con++) {
			c[con] = a[con] + b[con];
			System.out.println(c[con]);
		}
	}

}
