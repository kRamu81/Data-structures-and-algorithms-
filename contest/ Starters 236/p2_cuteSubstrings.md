### Find the length of the longest odd-length substring where odd positions = 'u' or 'o' and even positions = 'w'.

input : 
T = 5
3  -> uwu
5  -> powor
6  -> muwowu
4  -> owpo
6  -> winter

output :
3
3
5
1
0

Approach :
Approach (Simple & Clear)
We check all possible substrings.
Only consider odd length substrings.
For each substring:
Odd index → must be 'u' or 'o'
Even index → must be 'w'
Track the maximum valid length.
Steps:
Loop over all start indices l
Loop over all end indices r
Check if (r-l+1) is odd
Validate pattern using helper function
Update maxLen

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            int n = s.nextInt();
            String str = s.next();
            int maxlen = 0;

            for (int l = 0; l < n; l++) {
                for (int r = l; r < n; r++) {
                    int len = r - l + 1;

                    if (len % 2 != 0) {
                        if (isCute(str, l, r)) {
                            maxlen = Math.max(maxlen, len);
                        }
                    }
                }
            }
            System.out.println(maxlen);
        }

    }

    static boolean isCute(String s, int l, int r) {
        for (int i = 0; i <= (r - l); i++) {
            char c = s.charAt(l + i);
            int pos = i + 1;

            if (pos % 2 != 0) {
                if (c != 'u' && c != 'o') return false;
            } else {
                if (c != 'w') return false;
            }
        }
        return true;
    }
}
```
