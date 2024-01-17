//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class PanagramOrNot {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    
    static boolean checkIfPangram(String sentence) {
        for (int i = 'a'; i <= 'z'; i++) {
            if(!IsFoundsearch(sentence, i)){
                return false;
            }
        }
        return true;
    }

    static boolean IsFoundsearch(String sentence, int i) {
        return sentence.indexOf(i) != -1;
    }
}