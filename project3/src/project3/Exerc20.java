package project3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Exerc20 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int A[]=new int[4];
		int B[]=new int[4];
		System.out.println("digite os elementos do vetor B");
        for(int i=0;i<B.length;i++) {
        	B[i]=ler.nextInt();
        }
        System.out.println("\n");
        System.out.println("digite os elementos do vetor A");
        for(int i=0;i<A.length;i++) {
        	A[i]=ler.nextInt();
        }
        diferença(A,B);
	}

	public static void diferença(int m[],int n[]) { 
			for(int j=0;j<n.length;j++) {
				if(contains(m,n[j])==false) {
					System.out.println(n[j]);
			}
		
}
		}
	public static boolean contains(int vet[],int num) {
		boolean resultado=false;
		for(int i=0;i<vet.length;i++) {
			if(vet[i]==num) {
				resultado=true;
				break;
			}
		}
		return resultado;
	}
				}
