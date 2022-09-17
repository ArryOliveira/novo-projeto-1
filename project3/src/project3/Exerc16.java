package project3;

import java.util.Random;
import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		Random num=new Random();
		int vetor[]=new int[5];
		int i;
		for(i=0;i<5;i++) {
			vetor[i]=num.nextInt(10);
		}
		for(i=0;i<5;i++) {
			System.out.print(vetor[i]);
		}
		System.out.println();
		ParImpar(vetor);

	}

	public static void ParImpar(int v[]) {
		int x,aux,i;
		for(i=0;i<v.length;i++) {
			for(x=i+1;x<v.length;x++) {
				if(v[i]%2==0) {
					aux=v[i];
					v[i]=v[x];
					v[x]=aux;
				}
			}
		}
		for(x=0;x<v.length;x++) {
			System.out.print(v[x]);
		}
		
	
}
	
	
	
}
