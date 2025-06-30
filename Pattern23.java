import java.util.Scanner;
class Pattern23 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=rows;i>=1;i--){

            for(int j=i-1;j>=1;j--){
                System.out.print(" ");

            }
            for(int j=rows;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(" ");

            }System.out.println();
        }
        
    }
    
}
