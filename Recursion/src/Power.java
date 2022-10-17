import java.util.Scanner;
public class Power {
    Scanner s = new Scanner(System.in);
    
    public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if(n==0){
            return 1;
        }
            n--;
		return power(x, n) * x;
	}
    
}
