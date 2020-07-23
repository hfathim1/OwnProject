import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class palindrome {
@Test
public void shouldRecognizeNonPalindrome() {
	Assert.assertTrue(true, palindrome.isPalindrome("popppi"));
}

@Test
public void shouldevennot() {
	Assert.assertEquals(true, palindrome.isevennot(60));
}

public static String isPalindrome(String str1) {
	
    String rev="";

    int length = str1.length();

    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + str1.charAt(i);

    if (str1.equals(rev))
       System.out.println("palidrome");
    else
    	System.out.println("not palindrome");
	
    return rev;
      

}
public static boolean isevennot(int i) {
//	int num;
//    System.out.println("Enter an Integer number:");
//
//    //The input provided by user is stored in num
//    Scanner input = new Scanner(System.in);
//    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( i % 2 == 0 ) {
    	System.out.println("even number");
        return true;
    }
        else {
        	System.out.println("odd number");
        	return false;
        }
        	
   
  }
}

