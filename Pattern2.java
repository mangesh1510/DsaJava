import java.util.*;
class Patter2{
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

	System.out.println("Enter number of rows");
	int rows=sc.nextInt();

	for(int i=0;i<rows;i++){
		for(int j=1;j<=rows-i;j++){
			System.out.print(j+" ");
		}System.out.println();
	}
	}
}
      
