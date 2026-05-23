```
input : 195
output: 9339
Explanation:
the starting number is 195:
195 + 591 = 786
786 + 687 = 1473
1473 + 3741 = 5214
5214 + 4125 = 9339 (which is a palindrome)
```

  ```java
  
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
		Codechef obj = new Codechef();
		System.out.println(obj.makePalindrome(n));
		
	}
	// 1.reverse Number
	public int reverse(int n){
	    int rev = 0;
	    while(n>0){
	        int rem  = n%10;
	        rev = rev*10+rem;
	        n = n/10;
	    }
	    return rev;
	}
	// 2. check palindrome
	public boolean isPalindrome(int n){
	    return n==reverse(n);
	}
	//3.reverse and add palindrome
	public int makePalindrome(int num){
	    while(!isPalindrome(num)){
	        num = num+reverse(num);
	    }
	    return num;
	}
	
}```
