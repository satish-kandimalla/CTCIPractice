package Ch1;

public class Ch1Q3_ReplaceSpaces {
    public char[] replaceSpaces(char[] arr, int trueLength){
        int spaceCount = findSpaces(arr, trueLength);
        int totalCount = trueLength+spaceCount*2;

        if(trueLength < arr.length){
            arr[trueLength] = '\0';
        }
        for(int i=trueLength-1;i>=0;i--){
            if(arr[i]==' '){
                arr[totalCount-1] = '0';
                arr[totalCount-2] = '2';
                arr[totalCount-3] = '%';
                totalCount = totalCount - 3;
            }else{
                arr[totalCount-1] = arr[i];
                totalCount--;
            }
        }
        return arr;
    }
    public int findSpaces(char[] arr, int trueLength){
        int spaceCount = 0;
        for(int i=0;i<trueLength;i++){
            if(arr[i] == ' '){
                spaceCount++;
            }
        }
        return spaceCount;
    }
    public static void main(String args[]){
        String s = "Mr John Smith      ";
        int n = 13;
        char[] c = s.toCharArray();
        Ch1Q3_ReplaceSpaces obj = new Ch1Q3_ReplaceSpaces();
        System.out.println(obj.replaceSpaces(c,n));
    }
}
