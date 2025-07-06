import java.util.Scanner;
class pattern42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows"); //9
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            } System.out.println();
        }

      







    }
}
