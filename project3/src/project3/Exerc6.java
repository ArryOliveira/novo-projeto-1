package project3;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[5];
		for (int i = 0; i < 5; i++) {
			vetor[i] = ler.nextInt();
		}
		System.out.println("o vetor original");
		for(int i=0;i<5;i++) {
			System.out.print(vetor[i]);
		}
		System.out.println();
		System.out.println("novo vetor");
		for(int numero:inverter(vetor,5)) {
			System.out.println(numero);
		}
	}
   public static int[] inverter(int vet[],int tam) {
	   int x;
	   int fim=tam-1;
	   int aux;
	   for(x=0;x<tam/2;x++) {
		   aux=vet[fim];
		   vet[fim]=vet[x];
		   vet[x]=aux;
		   fim--;
	   }
	   return vet;
	 
   }
}
