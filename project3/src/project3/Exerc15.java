package project3;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		int vec[]=new int[5];
		int i;
		Scanner ler = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			vetor[i] = ler.nextInt();
		}
		for(i=0;i<5;i++) {
			vec[i]=ler.nextInt();
		}
        resultante(vetor,vec);
        ler.close();
	}
   public static void resultante(int a[],int b[]) {
	   int x;
	   int complemento[]=new int[5];
	   for(x=0;x<5;x++) {
		   complemento[x]=10-(a[x]+b[x]);
	   }
	   for(x=0;x<5;x++) {
		   System.out.print(complemento[x]);
	   }
	   
   }
}
