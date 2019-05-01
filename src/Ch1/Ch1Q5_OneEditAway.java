package Ch1;

public class Ch1Q5_OneEditAway {
    public boolean oneEditAway(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(Math.abs(s1.length() - s2.length())>1){
            return false;
        }
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(s1.substring(i+1,s1.length()).equals(s2.substring(i+1,s2.length()))){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }else if(s1.length() < s2.length()){
            for(int i=0; i<s2.length();i++){
                if(s2.charAt(i)!=s1.charAt(i)){
                    if(s2.substring(i+1,s2.length()).equals(s1.substring(i,s1.length()))){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }else{
            for(int i=0; i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    if(s1.substring(i+1,s1.length()).equals(s2.substring(i,s2.length()))){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s1 = "pae";
        String s2 = "pale";
        Ch1Q5_OneEditAway obj = new Ch1Q5_OneEditAway();
        //System.out.println(s2.substring(1,s2.length()));
        System.out.println(obj.oneEditAway(s1,s2));
    }
}
