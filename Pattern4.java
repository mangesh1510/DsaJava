import java.util.Scanner;
class Patern4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows ");
		int rows=sc.nextInt();

		for(int i=rows;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}System.out.println();
		}
	}
}
