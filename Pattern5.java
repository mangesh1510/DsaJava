import java.io.*;
class Pattern5{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows:");
		int rows=Integer.parseInt(br.readLine());

		for(int i=rows ;i>=1;i--){
			for(int j=rows;j>=i;j--){
				System.out.print(j+" ");
			}System.out.println();
		}
	}
}

