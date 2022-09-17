package project3;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		int vetor[] = new int[3];
		int vec[]=new int[3];
		int i;
		Scanner ler = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			vetor[i] = ler.nextInt();
		}
		for(i=0;i<3;i++) {
			vec[i]=ler.nextInt();
		}
		for(int numero:junta(vetor,vec)) {
			System.out.println(numero);
		}

	}
   public static int[] junta(int x[],int y[]) {
	   int j;
	   int tam1=x.length;
	   int tam2=y.length;
	   int total=tam1+tam2;
	   int vet[]=new int[total];
	   for(j=0;j<tam1;j++) {
		   vet[j]=x[j];
	   }
	   for(j=0;j<tam2;j++) {
		   vet[tam1]=y[j];
		    tam1++;
	   }
	   System.out.println("o novo vetor");
	   
	return vet;
	   
   }
}
