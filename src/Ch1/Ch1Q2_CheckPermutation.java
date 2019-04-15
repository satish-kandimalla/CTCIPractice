//https://algorithms.tutorialhorizon.com/find-whether-two-strings-are-permutation-of-each-other/
//http://fatihkabakci.com/article-Check_Permutation_Two_Strings
//https://www.geeksforgeeks.org/determine-string-unique-characters/

//Time Comp - O(n)
package Ch1;
import java.util.*;

public class Ch1Q2_CheckPermutation {

    public boolean checkIsPermutation(String s1, String s2){
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(ht.containsKey(c)){
                int val = ht.get(c);
                ht.put(c,val+1);
            }else{
                ht.put(c,1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(ht.containsKey(c)){
                int val = ht.get(c);
                ht.put(c,val-1);
            }else{
                ht.put(c,1);
            }
        }
        Set<Character> keys = ht.keySet();
        for(Character c: keys){
            if(ht.get(c)!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s1 = "dogdds";
        String s2 = "godsdd";
        Ch1Q2_CheckPermutation obj = new Ch1Q2_CheckPermutation();
        System.out.println(obj.checkIsPermutation(s1,s2));
    }
}


// ----Other Approach----Uses Array.sort O(n2) complexity
//    public boolean checkIsPermutation(String s1, String s2){
//        if(s1.length() != s2.length()){
//            return false;
//        }
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        for(int i=0; i<ch1.length;i++){
//            if(ch1[i] != ch2[i]){
//                return false;
//            }
//        }
//        return true;
//    }
