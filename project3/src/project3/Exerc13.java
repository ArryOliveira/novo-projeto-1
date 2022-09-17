package project3;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		{
			  String frase;
			  Scanner ler=new Scanner(System.in);
			  System.out.println("digite uma frase para ser descriptografada");
			   frase=ler.nextLine();
			 descriptografa(frase);
			}
	}
			public static void descriptografa(String misterio) {
			   String[] criptografado=new String[misterio.length()];
				    for(int i=0;i<misterio.length();i++) {
				    	if(misterio.charAt(i)=='%') {
				    		criptografado[i]="a";
			
				    	}
				    	else if(misterio.charAt(i)=='*'){
				    		criptografado[i]="b";
				    	}
				    	else if(misterio.charAt(i)=='('){
				    		criptografado[i]="c";
				    	}
				    	else if(misterio.charAt(i)=='-'){
				    		criptografado[i]="d";
				    	}
				    	else if(misterio.charAt(i)=='+'){
				    		criptografado[i]="e";
				    	}
				    	else if(misterio.charAt(i)=='@'){
				    		criptografado[i]="f";
				    	}
				    	else if(misterio.charAt(i)=='#'){
				    		criptografado[i]="g";
				    	}
				    	else if(misterio.charAt(i)=='1'){
				    		criptografado[i]="h";
				    	}
				    	else if(misterio.charAt(i)=='2'){
				    		criptografado[i]="i";
				    	}
				    	else if(misterio.charAt(i)=='3'){
				    		criptografado[i]="j";
				    	}
				    	else if(misterio.charAt(i)=='4'){
				    		criptografado[i]="l";
				    	}
				    	else if(misterio.charAt(i)=='5'){
				    		criptografado[i]="m";
				    	}
				    	else if(misterio.charAt(i)=='6'){
				    		criptografado[i]="n";
				    	}
				    	else if(misterio.charAt(i)=='7'){
				    		criptografado[i]="o";
				    	}
				    	else if(misterio.charAt(i)=='8'){
				    		criptografado[i]="p";
				    	}
				    	else if(misterio.charAt(i)=='9'){
				    		criptografado[i]="q";
				    	}
				    	else if(misterio.charAt(i)=='{'){
				    		criptografado[i]="r";
				    	}
				    	else if(misterio.charAt(i)=='}'){
				    		criptografado[i]="s";
				    	}
				    	else if(misterio.charAt(i)=='!'){
				    		criptografado[i]="t";
				    	}
				    	else if(misterio.charAt(i)=='&'){
				    		criptografado[i]="u";
				    	}
				    	else if(misterio.charAt(i)=='$'){
				    		criptografado[i]="v";
				    	}
				    	else if(misterio.charAt(i)=='?'){
				    		criptografado[i]="x";
				    	}
				    	else if(misterio.charAt(i)==':'){
				    		criptografado[i]="z";
				    	}
				    	else if(misterio.charAt(i)=='0'){
				    		criptografado[i]=" ";
				    	}
				    }
				    for(int i=0;i<criptografado.length;i++) {
				    	System.out.print(criptografado[i]);
				    }
				    
		            

			   
		}


}

