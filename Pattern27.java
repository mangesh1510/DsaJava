import java.util.*;
public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i%2!=0 && j%2!=0 || i%2==0 && j%2==0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
              
            }
            System.out.println();
        }


        
    
}
}
