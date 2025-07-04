import java.util.Scanner;
public class Pattern38{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Rows");
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){
        int count=1;

        for(int j=1;j<2*i;j++){
            if(j%2!=0){
                System.out.print(count++);
            }
            else{
                System.out.print("*");
            }


        }System.out.println();



      
            

       
    }
}
}
