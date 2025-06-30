import java.io.*;
public class Pattern16 {
    public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter Rows");
    int rows=Integer.parseInt(br.readLine());

    for(int i=1;i<=rows;i++){

        for(int j=1;j<i;j++){
            System.out.print(" ");
        }

        for(int j=i;j<=rows;j++){
            System.out.print(j);

        }
        System.out.println();


    }

     for(int i=rows-1;i>=1;i--){
        for(int j=i-1;j>=1;j--){
            System.out.print(" ");
        }
        for(int j=i;j<=rows;j++){
            System.out.print(j);
        }
        System.out.println();
     }
    
    }
}
