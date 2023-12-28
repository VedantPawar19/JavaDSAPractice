//Search character in string

import java.util.Arrays;

public class SearchInString{
    public static void main(String[] args){
        String name = "Vedant";
        char target = 'z';
        System.out.println(Search(name, target));

        // OR convert string in character array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));

    }

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean Search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }return false;
    }
}