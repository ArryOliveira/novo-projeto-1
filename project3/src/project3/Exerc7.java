package project3;

import java.util.Scanner;

public class Exerc7 {

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
          trocar(vetor,vec,3,3);
	}
	public static void trocar(int a[],int b[],int tam1,int tam2) {
		int x,auxiliar;
		for(x=0;x<tam1;x++) {
			auxiliar=a[x];
			a[x]=b[x];
			b[x]=auxiliar;
		}
		System.out.println();
		for(x=0;x<tam1;x++) {
			System.out.print(a[x]);
		}
		System.out.println();
		for(x=0;x<tam2;x++) {
			System.out.print(b[x]);
		}
}}
