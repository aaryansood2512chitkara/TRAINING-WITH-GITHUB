//Code : Character Pattern


//ANSWER: 


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+(k++)-1));
            }
            System.out.println();
        }

		
	}

}




