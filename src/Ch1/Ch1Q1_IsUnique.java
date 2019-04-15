package Ch1;

public class Ch1Q1_IsUnique {
    public boolean isUnique(String str){
        if(str.length() > 128) return false;
        boolean[] charArr = new boolean[128];
        for(int i=0;i<str.length();i++){
            int value = str.charAt(i);
            System.out.println(value);
            if(charArr[value]){
                return false;
            }else{
                charArr[value] = true;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Ch1Q1_IsUnique obj = new Ch1Q1_IsUnique();
        String s1 = "satish";
        String s2 = "algorithm$$";
        System.out.println(obj.isUnique(s1));
        System.out.println(obj.isUnique(s2));
    }
}
