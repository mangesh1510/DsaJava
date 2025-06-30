import java.util.Scanner;
class Pattern21 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){ 
            
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

            
        }
        
    }
    
}
