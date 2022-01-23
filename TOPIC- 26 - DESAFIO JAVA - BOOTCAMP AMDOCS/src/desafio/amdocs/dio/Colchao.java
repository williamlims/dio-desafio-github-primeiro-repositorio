package desafio.amdocs.dio;
import java.io.IOException;
import java.util.Scanner;

public class Colchao{
	
    public static void main(String[] args) throws IOException {
  		Scanner leitor = new Scanner(System.in);
  		int A = leitor.nextInt();
  		int B = leitor.nextInt();
  		int C = leitor.nextInt();
  		int H = leitor.nextInt();
  		int L = leitor.nextInt();
  		
  		if(H < L) {
  			int a = H;
  			int b = L;
  			H = b;
  			L = a;
  		}
		
  		int X = Math.min(A, Math.min(B, C));
  		int Y = Math.min(Math.max(A, B), Math.min(Math.max(A, C), Math.max(B, C)));
  		
  		if(X <= L && Y <= H) {
  			System.out.println("S");
  		} else {
  			System.out.println("N");
  		}
		
    }
    
}
