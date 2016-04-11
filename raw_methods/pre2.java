import java.lang.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class pre2{
	public static void main(String ... args){
		Scanner input=new Scanner(System.in);
		
		int N;
		int i; //counter
		float real,sum;
	
		sum=0;
		N=input.nextInt();
		DecimalFormat pembulatan = new DecimalFormat("#.##");

		if (N>0){
			for(i=1;i<=N;i++){
				real=input.nextInt();
				sum+=real;
			}
			//DecimalFormat pembulatan = new DecimalFormat("#.##");
			System.out.println(Float.valueOf(pembulatan.format(sum)));
			System.out.println(Float.valueOf(pembulatan.format(sum/(float)N)));			
			//System.out.println((sum/(float)N));
		}
	}
}
