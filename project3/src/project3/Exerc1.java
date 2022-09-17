package project3;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		int numero;
		int vetor[] = new int[10];
		int i;
		Scanner ler = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			vetor[i] = ler.nextInt();
		}
		System.out.println("digite o numero que quer procurar");
		numero=ler.nextInt();
        System.out.println(procurar(vetor,numero));
	}
	
	public static int procurar(int vet[],int num) {
		int x;
		for(x=0;x<vet.length;x++) {
			if(vet[x]==num) {
				return x;
			}
	                      }
		return -100;
		}
		
	}
	

