public class swap {
    public static void main(String[] args){
        //Swapping two variables
        int a = 10;
        int b = 20;
        System.out.println("a = "+a+" and b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+" and b = "+b);

        {
            a = 78;
            int c = 100;
            System.out.println(c);
        /*Block Scope: values initialized in the block will stay in the block i.e. int a in block is not possible. 
        but value initialized in block cannot be used outside
        for example cannot print c outside this block but can modify value of a in block since intialized outside*/
        }
        System.out.println(a);
        //System.out.println(c);//This will give error

        //Block scope and loop scope is same
        // Anything intialized outside the block can be used in block, but anything intialized inside the block cannot be used outside
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    } 
}
