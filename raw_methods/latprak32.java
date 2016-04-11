import java.lang.*;
import java.util.Scanner;
public class latprak32 {
	public static void main(String ... args) {
		Scanner input=new Scanner(System.in);
		float mark=-999;
		float X;
		float sum=0;
		int i=0;
		int lulus=0;
		int nolulus=0;
		X=input.nextFloat();
		if (X==mark) {
			System.out.println("Tidak ada data");
		}
		else {
			while(X!=mark)
			{
				if (IsWithinRange(X,0,4)==1)
				{
					if (IsWithinRange(X, 2.75f ,4)==1){
						lulus=lulus+1;}
					else {
						nolulus=nolulus+1;}								
					sum=sum+X;
					i++;
				}
				X=input.nextFloat();							
			}
			if (i!=0) {
			System.out.println(i);
			System.out.println(lulus);
			System.out.println(nolulus);
			double hasil=sum/i;
			System.out.println(String.format("%.2f",hasil));
			}
			else { //i=0
				System.out.println("Tidak ada data");
			}
		}
	}
	
	public static int IsWithinRange (float X, float min, float max)
	{
		if (X>=min && X<=max){
			return 1;
		}
		else {
			return 0;
		}
	}
}
	
		
			
			
