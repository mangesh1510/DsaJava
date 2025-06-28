import java.util.Scanner;
class Pattern10 {
    public static void main(String[] args) {
        System.out.println("Enter Rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }

        for(int i=1;i<=rows-1;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
        
    }
    
}
