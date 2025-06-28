import java.util.Scanner;
class Pattern15 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=2*i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=rows-i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();

        }
        
    }
    
}
