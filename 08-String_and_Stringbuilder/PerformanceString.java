public class PerformanceString {
    public static void main(String[] args){
        String str = "";
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('a' + i));
            str = str + (char)('A' + i);
        }
        System.out.println();
        System.out.println(str);


        // Problem with this is, it's creating new strings with every loop iteration which will be stored in memory and not used. thats why this is inefficient
        // Thats why StringBuilder class can be used to make changes in string (not string actually it's stringbildet type) values instead of creating new ones. check SBStringbuilder.java file
    }
}
