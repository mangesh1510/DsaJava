import java.util.Scanner;
class Pattern22 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j+" ");
            }
             for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
