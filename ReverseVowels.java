import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseVowels {
    public String reverseVowels(String s) {
        int n = s.length();
        Stack<Character> charStack = new Stack<Character>();
        List<Integer>vowelsToReplace = new ArrayList<Integer>();
        StringBuilder string = new StringBuilder(s);
        for(int i = 0; i < n; i++)
        {
            char c = string.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                charStack.add(c);
                vowelsToReplace.add(i);
            }
        }

        while(!vowelsToReplace.isEmpty())
        {
            int index = vowelsToReplace.get(0);
            vowelsToReplace.remove(0);
            char vowel = charStack.pop();
            string.setCharAt(index, vowel);
        }
        return string.toString();
    }

    /*Better Soln for effeciency
     * public String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int start = 0 ;

        int end = s.length()-1;

        while (start<end){
            while (start < end && !isVowel(chars[start])) {
                start++;
            }

            while (start < end && !isVowel(chars[end])) {
                end--;
            }

            if (start < end) {
                swap(chars, start, end);
                start++;
                end--;
            }

        }

        return new String(chars);
    }

    private void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
     * 
     */
}