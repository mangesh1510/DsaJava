import java.util.Scanner;
public class Pattern37 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Rows");
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){

        for(int j=1;j<=2*i-1;j++){
            if(j%2!=0){
                System.out.print(j);
         }else{
                System.out.print("*");
            }
            

            
        }System.out.println();
    }
}
}
