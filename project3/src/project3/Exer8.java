package project3;

import java.util.Scanner;

public class Exer8 {

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
       coloca(vetor,vec);
	}

	public static void coloca(int a[], int b[]) {
		int x;
		for (x = 0; x < a.length; x++) {
			if (a[x] > b[x])
				b[x] = a[x];
		}
		System.out.println("aqui esta o vetor");
		for(x=0;x<a.length;x++) {
			System.out.println(b[x]);
		}
	}
}
    	
    


