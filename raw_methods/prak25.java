import java.util.Scanner;

public class prak25{
	public static void main (String args[]){
		Scanner baca = new Scanner(System.in);
		int N;
		int i,j,temp;
		int frek,max,min;
		float med;
		int X;
	
		N=baca.nextInt();
	
		int arrN[];
		int arrIdx[];
		
		arrN=new int[N];
		arrIdx=new int[N];
	
		for(i=0;i<N;i++){
			arrN[i]=baca.nextInt();
		}
		X=baca.nextInt();
		
		frek=0;
		for(i=0;i<N;i++){
			if(arrN[i]==X){
				arrIdx[frek]=i;
				frek++;
			}
		}
		//sorting
		for(i=0;i<N;i++){
			for(j=1;j<N;j++){
				if(arrN[j]<arrN[j-1]){
					temp=arrN[j];
					arrN[j]=arrN[j-1];
					arrN[j-1]=temp;
				}
			}
		}
		
		if(N % 2 == 0){
			med=(float)(arrN[(int)N/2-1]+arrN[(int)N/2])/2;
		}else{
			med=(float)arrN[(int)(N-1)/2];
		}
		min=arrN[0];
		max=arrN[N-1];
		
		if(frek>0){
			System.out.println(frek);
			
			for(i=0;i<frek;i++){
				if(i==frek-1){
					System.out.println(arrIdx[i]);
				}else{
					System.out.print(arrIdx[i]+",");
				}
			}
			
			if(X==max){
				System.out.println("maksimum");
			}
			if(X==min){
				System.out.println("minimum");
			}
			if((float)X==med){
				System.out.println("median");
			}
		}else{
			System.out.println(X+" tidak ada");
		}
	}
}
