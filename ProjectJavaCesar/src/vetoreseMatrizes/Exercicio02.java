package vetoreseMatrizes;

public class Exercicio02 {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = new int[5];
		
		for (int c=0; c<a.length;c++) {
			b[c] = a[c] * 2;
		}
		
		for (int con=0; con<b.length; con++) {
			System.out.print(b[con] + " ");
			
		}
	}
}
