//Aty Rachmawati (23514018)

//import java.lang.*;
import java.util.Scanner;

public class pre1b{
	public static void main (String ... args){
		Scanner input=new Scanner(System.in);
		
		int a,b,c,max;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		System.out.println((a+b+c));
		
		max=a;
		if (b>max){
			max=b;
			if (c>max){
				max=c;
			}
		}else{
			if (c>max){
				max=c;
			}
		}
		System.out.println(max);
}
}

