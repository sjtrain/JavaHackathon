//Write a function to find out longest palindrome in a given string
package learn;
public class Question30 {
	public static String longestPalindrome(String s) {   
		int len = s.length();
		//if string has only one character, then return that character 
        if(len==1) 
        	return s;  

        int bigLen = 0;
        int bigLeft = 0;
        int bigRight = 0;
        int left=0, right=0;
 //assuming each character as middle and expanding towards left and write       
        for(int i=0; i<s.length(); i++){
//to check for odd
            left = i;
            right = i;
            
            while(left>=0 && right<len && s.charAt(left)==s.charAt(right)){
            	int palLen = right - left + 1;
                if(palLen > bigLen){
                	bigLen = palLen;
                	bigLeft = left;
                	bigRight = right;
                }
                left--; right++;
            }
//to check for even
            left = i;
            right = i+1;
            while(left>=0 && right<len && s.charAt(left)==s.charAt(right)){
            	int palLen = right - left + 1;
                if(palLen > bigLen){
                	bigLen = palLen;
                	bigLeft = left;
                	bigRight = right;
                }
                left--; right++;
            }
        }
        return s.substring(bigLeft, bigRight+1);
    }
	public static void main(String args[]) { 
		String str = "malayalamisalanguage"; 		
		String longestPali = longestPalindrome(str); 		
		System.out.println("Original string: " + str+'\n'); 
		System.out.println("Longest Palindrome: "+ longestPali); 
		}  
}
    






