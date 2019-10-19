//Check if two strings are anagram or not with O(n) time and space complexity O(1)
public class IsAnagrams {
    public static void main(String args[]){
       String s1 = "aybcdt";
       String s2 ="bcdayt";
       int count1 = 0;
       int count2 = 0;
       // check two strings are same in length or not 
       if(s1.length()==s2.length()){
           //count1 and count2 will add ASCII value of letter Example ASCII value of "a" is 97 so add previous + 97
           
           for(int i=0;i<s1.length();i++){
                count1 =count1 + s1.charAt(i);
                count2  =count2+s2.charAt(i);
            }
            
            if(count1==count2){
                System.out.println(" String are anagram of each other ");
            }else{
                System.out.println(" String are not anagram of each other ");
            }
       }else{
           System.out.println(" String are not anagram of each other ");
       }
       
    }
}
