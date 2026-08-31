public class PalindromePermutation {
    public static boolean isPalindromePermutation(String s){
        char[] freq=new char[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0)c++;
            if(c>1){
                return false;
            }
        }
        return true;

    }
    public static boolean canFormPalindrome(String s)
    {
        int mask = 0;

        // toggle bits
        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - 'a';
            mask ^= (1 << bit);
        }

        // check at most one bit set
        return (mask == 0) || ((mask & (mask - 1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("muuuu"));
        System.out.println(canFormPalindrome("muuuu"));
    }
}
