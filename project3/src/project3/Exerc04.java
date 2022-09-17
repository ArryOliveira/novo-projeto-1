package project3;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int vetor[]=new int[5];
		int i;
		for(i=0;i<5;i++) {
			vetor[i]=ler.nextInt();
		}
    System.out.println(somatorio(vetor,vetor.length));
	}
    public static int somatorio(int vet[],int tam) {
    	int x,soma=0;
    	for(x=0;x<tam;x++) {
    		soma=soma+vet[x];
    	}
    	return soma;
    }
}
