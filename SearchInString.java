import java.util.Arrays;
public class SearchInString{
    public static void main(String []args){
        String name="Dhana";
        char target='a';
        System.out.println(linearsearch(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean linearsearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}