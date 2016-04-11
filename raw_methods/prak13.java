import java.lang.*;
import java.util.Scanner;
//import java.util.Arrays;

public class prak13{
	public static void main(String ... args){
		Scanner input=new Scanner(System.in);
		
		int i,N;
		int max;
		int min;
		int angka;
		char kar;

		max=0;
		min=0;
		N=input.nextInt();
		kar=input.next().charAt(0);
		
		for(i=1;i<=N;i++){
			angka=input.nextInt();
			if (i==1){
				max=angka;
				min=angka;
			}else{
				if(kar=='B'){
					if (angka>=max){
						max=angka;
					}
				}else{
					if (angka<=min){
						min=angka;
					}
				}
			}
		}
		
		if(kar=='A'){
			System.out.println(min);
			//System.out.println(nmin);
		}else{
			System.out.println(max);
			//System.out.println(nmax);
		}
	}
}
