package project3;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		int vet[]=new int[4];
		Scanner ler=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			vet[i]=ler.nextInt();
		}
		explodir(vet);
	}
	public static void explodir(int exemplo[]) {
       int soma=0;
       int j=0;
       int x;
       int indice=0;
       for(x=0;x<exemplo.length;x++) {
    	   soma=soma+exemplo[x];
       }
		int explosao[]=new int[soma];
		
		for(j=0;j<exemplo.length;j++) {
			for(x=0;x<exemplo[j];x++,indice++) {
				explosao[indice]=exemplo[j];
			
			}
	   }
	   for(indice=0;indice<explosao.length;indice++) {
		   System.out.println(explosao[indice]);
	   }
	}
}

