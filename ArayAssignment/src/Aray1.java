import java.util.*;
public class Aray1 {
	public static void main(String []args){

		String z="";

		Scanner sc=new Scanner(System.in);
		Scanner si=new Scanner(System.in);

		System.out.print("Nawakat chan pita ? ");
		int num=si.nextInt();

		String []Naw=new String[num];

		for(int i=0;i<Naw.length;i++){
		System.out.print( (i+1)+"m Pity nawakat bkara naw am boxa  Naw[ "+i+" ] : ");
		Naw[i]=sc.nextLine();


		z=z+Naw[i];

			}//for1

			System.out.println();
			System.out.println("Ama nawy toya : "+z);
	}
}
