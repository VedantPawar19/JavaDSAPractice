package Day9;

public class HCFandLCM {
    public static void main(String[] args) {
        int a = 24;
        int b = 12;
        System.out.println(hcf(a, b));
    }

    static int hcf(int a, int b) {

        int minNum = Math.min(a, b);
        for (int i = minNum; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int lcm(int a, int b) {
        int hcf = hcf(a, b);
        return (a * b) / hcf;
    }
}
