import java.util.Scanner;
import java.text.DecimalFormat;

//int IsWithinRange(float X,float min,float max);

public class prak32{
	
	public static boolean IsWithinRange(float X,float min,float max){
	if (X >=min && X<=max) {
		return true;
	}else{
		return false;
	}
	}

	public static void main(String args[]){
	/*kamus*/
	Scanner baca=new Scanner(System.in);
	float IP,sumIP;
	int nMhs,nLulus;
	
	/*algoritma*/
	nMhs=0;
	nLulus=0;
	sumIP=0;
	IP=0;
	DecimalFormat pembulatan = new DecimalFormat("#.##");
	
	
	while (IP!=-999){
		IP=baca.nextFloat();
		if (IsWithinRange(IP,(float)0,(float)4)){
			if (IsWithinRange(IP,(float)2.75,(float)4)){
				nLulus++;
			}
			nMhs++;
			sumIP+=IP;
		}
	}
	if (nMhs==0){
		System.out.println("Tidak ada data");
	}
	else {
		System.out.println(nMhs);
		System.out.println(nLulus);
		System.out.println(nMhs-nLulus);
		System.out.println(Float.valueOf(pembulatan.format(sumIP/(float)nMhs))); 
	}
}}
