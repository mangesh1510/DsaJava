import java.util.*;
class Pattern9{
    public static void main(String args[]){
    System.out.println("enter rows");
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }System.out.println();
    }

    for(int i=rows-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);

        }System.out.println();
    }
}
}