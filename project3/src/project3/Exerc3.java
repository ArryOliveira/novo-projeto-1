package project3;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in) ;
			int vetor[]=new int[5];
			int i;
			for(i=0;i<5;i++) {
				vetor[i]=ler.nextInt();
			}
			 ordena(vetor);
		
	}

	public static void ordena(int vet[]) {
		int x,aux,i;
		for(i=0;i<vet.length;i++) {
			for(x=i+1;x<vet.length;x++) {
				if(vet[i]>vet[x]) {
					aux=vet[i];
					vet[i]=vet[x];
					vet[x]=aux;
				}
			}
		}
		for(x=0;x<vet.length;x++) {
			System.out.println(vet[x]);
		}
		
	
}}
