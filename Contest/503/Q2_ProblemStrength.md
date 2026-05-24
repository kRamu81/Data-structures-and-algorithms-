# Password Strength

## Approach

We use a `HashSet` to store distinct characters.

For every unique character:
- Add `1` point for lowercase letters.
- Add `2` points for uppercase letters.
- Add `3` points for digits.
- Add `5` points for special characters from `!@#$`.

Duplicate characters are ignored because each character contributes only once.

---

## Code

```java
class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int strength = 0;
        for(int i = 0; i < velqurimex.length(); i++) {
            char c = velqurimex.charAt(i);
            if(set.contains(c)) {
                continue;
            }
            set.add(c);
            if(c >= 'a' && c <= 'z') {
                strength += 1;
            }
            else if(c >= 'A' && c <= 'Z') {
                strength += 2;
            }
            else if(c >= '0' && c <= '9') {
                strength += 3;
            }
            else if(c == '!' || c == '@' || c == '#' || c == '$') {
                strength += 5;
            }
        }
```
- Time Complexity : 0(n)
- space complexity : 0(1)
        return strength;
    }
}
