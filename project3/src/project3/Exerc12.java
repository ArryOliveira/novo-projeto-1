package project3;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
	  String frase;
	  Scanner ler=new Scanner(System.in);
	  System.out.println("digite uma frase para ser criptografada");
	   frase=ler.nextLine();
	 criptografa(frase);
	}

	public static void criptografa(String misterio) {
	   String[] criptografado=new String[misterio.length()];
		    for(int i=0;i<misterio.length();i++) {
		    	if(misterio.charAt(i)=='a') {
		    		criptografado[i]="%";
	
		    	}
		    	else if(misterio.charAt(i)=='b'){
		    		criptografado[i]="*";
		    	}
		    	else if(misterio.charAt(i)=='c'){
		    		criptografado[i]="(";
		    	}
		    	else if(misterio.charAt(i)=='d'){
		    		criptografado[i]="-";
		    	}
		    	else if(misterio.charAt(i)=='e'){
		    		criptografado[i]="+";
		    	}
		    	else if(misterio.charAt(i)=='f'){
		    		criptografado[i]="@";
		    	}
		    	else if(misterio.charAt(i)=='g'){
		    		criptografado[i]="#";
		    	}
		    	else if(misterio.charAt(i)=='h'){
		    		criptografado[i]="1";
		    	}
		    	else if(misterio.charAt(i)=='i'){
		    		criptografado[i]="2";
		    	}
		    	else if(misterio.charAt(i)=='j'){
		    		criptografado[i]="3";
		    	}
		    	else if(misterio.charAt(i)=='l'){
		    		criptografado[i]="4";
		    	}
		    	else if(misterio.charAt(i)=='m'){
		    		criptografado[i]="5";
		    	}
		    	else if(misterio.charAt(i)=='n'){
		    		criptografado[i]="6";
		    	}
		    	else if(misterio.charAt(i)=='o'){
		    		criptografado[i]="7";
		    	}
		    	else if(misterio.charAt(i)=='p'){
		    		criptografado[i]="8";
		    	}
		    	else if(misterio.charAt(i)=='q'){
		    		criptografado[i]="9";
		    	}
		    	else if(misterio.charAt(i)=='r'){
		    		criptografado[i]="{";
		    	}
		    	else if(misterio.charAt(i)=='s'){
		    		criptografado[i]="}";
		    	}
		    	else if(misterio.charAt(i)=='t'){
		    		criptografado[i]="!";
		    	}
		    	else if(misterio.charAt(i)=='u'){
		    		criptografado[i]="&";
		    	}
		    	else if(misterio.charAt(i)=='v'){
		    		criptografado[i]="$";
		    	}
		    	else if(misterio.charAt(i)=='x'){
		    		criptografado[i]="?";
		    	}
		    	else if(misterio.charAt(i)=='z'){
		    		criptografado[i]=":";
		    	}
		    	else if(misterio.charAt(i)==' '){
		    		criptografado[i]="0";
		    	}
		    }
		    for(int i=0;i<criptografado.length;i++) {
		    	System.out.print(criptografado[i]);
		    }
		    
            

	   
}
}