import java.io.*;
public class Pattern47 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rows:");
        int rows=Integer.parseInt(bf.readLine());
        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=rows-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    
}
