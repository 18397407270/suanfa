package lanqiao;

public class 扩展欧几里得 {

    static long x = 0;

    static long y = 0;

    public static void main(String[] args) {

        try {
            Linear_equation(2,3,1);
            System.out.println(x);
            System.out.println(y);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static long gcd(long a,long b){

        if(b==0){

            x = 1;
            y = 0;

            return a;
        }

        long res = gcd(b,a%b);

        long x1 = x;

        x = y;

        y = x1-a/b*y;

        return res;
    }

    /*
    * 求线性方程
    * */

    public static long Linear_equation(long a,long b,long m) throws Exception {

        long d = gcd(a,b);

        if(m%d!=0){

            throw new Exception("无解");
        }

        long n = m/d;

        x *= n;

        y *= n;

        return d;
    }


}
