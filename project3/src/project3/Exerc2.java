package project3;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		int indice;
		Scanner ler=new Scanner(System.in);
		int vetor[]=new int[5];
		int i;
		for(i=0;i<5;i++) {
			vetor[i]=ler.nextInt();
		}
       System.out.println("digite o indice que vc deseja pesquisar");
       indice=ler.nextInt();
       System.out.println(procura(vetor,indice,vetor.length));

	}
    public static int procura(int vet[],int num,int tam) {
    	if(num<tam) {
    		return vet[num];
    	}
    	else {
    		return -100;
    	}
    
    }
}
