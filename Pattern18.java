import java.util.Scanner;
class Pattern18 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
           
            for(int j=i;j<2*i;j++){
                System.out.print(j +" ");
            }
             for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

        
    }
    
}
