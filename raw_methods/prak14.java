import java.lang.*;
import java.util.Scanner;

public class prak14{
	public static int cekKar(char kar){
		int value;
		if((kar>='a' && kar<='z') || (kar>='A' && kar<='Z')){
			if(kar=='a' || kar=='A' || kar=='i' || kar=='I' || kar=='u' || kar=='U' || kar=='e' || kar=='E' || kar=='o' || kar=='O'){
				value=1;
			}else{
				value=2;
			}
		}else if((kar>='0' && kar<='9')){
			value=3;
		}else{
			value=4;
		}
		return value;
	}
	
	public static void main(String ... args){
		Scanner input=new Scanner(System.in);
		
		int i,N;
		int voc,cons,numb,chara;
		char kar;
		voc=0;
		cons=0;
		numb=0;
		chara=0;
		
		do{
			N=input.nextInt();
			if (N<=0){
				System.out.println("Masukan salah");
			}
		}while (N<=0);
					
		if (N>0){
			for (i=1;i<=N;i++){
				kar=input.next().charAt(0);
				switch(cekKar(kar)){
					case 1 : voc++;break;
					case 2 : cons++;break;
					case 3 : numb++;break;
					case 4 : chara++;break;
				}
			}
		}
		System.out.println(voc);
		System.out.println(cons);
		System.out.println(numb);
		System.out.print(chara);
	}
}

