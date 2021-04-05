package recursion;

public class Main01 {
    private static boolean huzhi(int n, int m) {
        int t = 0;
        while (m > 0) {
            t = n % m;
            n = m;
            m = t;//当=0说明两个数之间存在倍数关系
            if (n == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 0;
        for (int i = 1; i <= 19000; i++) {
            if (huzhi(i, 19000)) count++;
        }
        System.out.println(count);
    }
}