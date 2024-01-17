public class StringBasics {
    public static void main(String[] args){
        String a = "Vedant";
        String b = "Vedant";
        // In above case both a and b are refering to the same string object in stringpool. It is not creating new objects
        // We can compare a and b with == and it will give true since == checks if value is same and also if object is same
        System.out.println(a==b); // true

        String c = new String("Vedant"); //new keyword is used to create another object outside String pool but in the heap
        String d = new String("Vedant");
        System.out.println(a==c); // false
        System.out.println(c==d); // false

        // If we only want to compare value and not if it is same object then use .equals()
        System.out.println(a.equals(c) && c.equals(d)); // true since both true


        String name = "afsdjoieodmlfm";
        System.out.println(name.charAt(2)); // .charAt(index) will return character at index
        System.out.println(name.indexOf('s')); // returns index of asked charater or even variable
    }
}
