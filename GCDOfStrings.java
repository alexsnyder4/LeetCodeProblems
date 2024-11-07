
/*
    1071. Greatest Common Divisor of Strings

    For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

    

    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:

    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:

    Input: str1 = "LEET", str2 = "CODE"
    Output: ""
    

    Constraints:

    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of English uppercase letters.
*/

// We need to find the smallest string that can be in both str1 and str2
// First check if the GCD is posible because if str1 cant be found in str2 then there is no GCD such as LEET and CODE. 
// Then find the GCD of their lengths and return the characters from index 0 to where it should stop returning the smallest repeating string in str1 and str2

public class GCDOfStrings {

    public String gcdOfStrings(String str1, String str2) {

        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());

        return str1.substring(0, gcd);
    }

    // Utilize Euclidean Algorithm "(gcd(a,b) = gcd(b, a%b)" to find the greatest common divisor of 2 numbers
    // Base Case:
        // If b == 0 return a since GCD(0,a) = a  <-- we are doing this only on b because 
        // of the scenario that str2 divides str1 indicating that str2 will be the larger of the two nums.
    // Else call it recursively with b and the remainder of a/b to reduce it and check again for the GCD.

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
