//Nama : Aty Rachmawati
//NIM : 23514018

import java.util.Scanner;
import java.text.DecimalFormat;

public class aty12{
	public static int IsWithinRange(float X,float min, float max){
		if (X>=min && X<=max){
			return 1;
		}else{
			return 0;

		}
	}
	
		
	public static void main(String args[]){
		Scanner baca = new Scanner(System.in);
		DecimalFormat pembulatan = new DecimalFormat("#.##");
		int range;
		int nMhs;
		int nLulus;
	
		float max=4;
		float min=0;
		float nstop=-999;
		float ip,rata2;
	
		rata2=0;
		nMhs=0;
		nLulus=0;
	
		ip=baca.nextFloat();
		if (ip==nstop){
			System.out.println("Tidak ada data");
		}else{
			do{
				range=IsWithinRange(ip,min,max);
				if (range==1){
					nMhs=nMhs+1;
					rata2=((rata2*(nMhs-1))+ip)/nMhs;
					if (ip>=2.75){
						nLulus=nLulus+1;
					}
				}
				ip=baca.nextFloat();
			}while(ip!=nstop);
		System.out.println(nMhs);
		System.out.println(nLulus);
		System.out.println(nMhs-nLulus);
		System.out.println(Float.valueOf(pembulatan.format(rata2))); 
		}
			
}	

}

