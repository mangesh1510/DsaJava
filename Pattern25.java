import java.util.Scanner;
class Pattern25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=i;j>1;j--){
                System.out.print(" ");

            }
            for(int j=i;j<=rows;j++){
              System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=rows-1;i>=1;i--){

            for(int j=1;j<=i-1;j++){
                System.out.print(" ");

            }
            for(int j=i;j<=rows;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }


    }
}