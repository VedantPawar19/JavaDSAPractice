package Day09;

public class HCFandLCM {
    public static void main(String[] args) {
        int a = 24;
        int b = 12;
        System.out.println(hcf(a, b));
    }

    static int hcf(int a, int b) {
        if (a == 0 || b == 0) {
            return -1;  // HCF is undefined for zero or one of the numbers is zero
        }

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
        if (hcf == -1) {
            return -1;
        }
        return (a * b) / hcf;  // LCM is undefined if HCF is undefined
    }
}
