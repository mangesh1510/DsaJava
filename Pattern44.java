import java.util.Scanner;
class Patter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows"); //9
        int rows=sc.nextInt();

        for(int i=rows;i>=1;i--){

              for(int j=i-1;j>=1;j--){
                System.out.print(" ");
            } 


            for(int j=rows-i+1;j<=1;j++){
                System.out.print("*"+" ");
            } System.out.println();
        }

      







    }
}
