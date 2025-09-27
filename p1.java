import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		int n=5;
        int a=65;
		for(int i=1; i<=5; i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j =5; j>=i; j--) {
				System.out.print((char)a +" ");
                a=a+1;    
			}
            a=65;
			System.out.println();
		}
		
    }
}

/*
 A-65
 B-66
 C-67
 D-68
 E-69

 
 */





/*
 * 
 * 1
 *** 3
 ***** 5
 ******* 7
 ********* 9
 * 
 * 
 */

/*
 * 

1
 2
   3
     4
       5




 * 
 */
