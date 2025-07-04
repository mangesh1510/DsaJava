import java.util.Scanner;
public class Pattern39 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Rows");
    int rows=sc.nextInt();
   char ch='A';
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=rows-i;j>=1;j--){
            System.out.print(ch);
        }
        ch++;
        System.out.println();
       



      
            

       
    }
}
}
