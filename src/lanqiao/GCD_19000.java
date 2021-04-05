package lanqiao;

public class GCD_19000 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1;i<=19000;i++){
            boolean flag = false;
            Integer gcd = gcd(i, 19000);

            if(gcd==1){

                flag = true;
            }
            if(flag){
                count++;
            }
        }

        System.out.println(count);
    }

    private static Integer gcd(int n, int m) {


        if(m==0){
            return n;
        }

        return gcd(m,n%m);
    }
}
