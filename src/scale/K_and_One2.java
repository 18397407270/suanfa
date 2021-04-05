package scale;


public class K_and_One2 {

    public static void main(String[] args) {



        int a[] = {3,3,3,6,6,6,7,7,7,8,8,8,9,9,9,4,4,4,0,0,0,5};

        int o =  Find_One(a);

        System.out.println(o);
    }

    private static int Find_One(int[] a) {

        /*假设此时k为3*/
        int k = 3;

        /*二维数组中一行最大长度*/
        int maxLen = 0;

        int len = a.length;

        char b [][] = new char[len][len];

        /*将其进制反转,实现左对齐*/
        for (int i=0;i<len;i++){

            b[i] = new StringBuilder(Integer.toString(a[i],k)).reverse().toString().toCharArray();

            if(b[i].length>maxLen){

                maxLen = b[i].length;

            }
        }

        /*将二维字符字符数组每一位对应相加然后存到整数数组中*/

        int c[] = new int[maxLen];
        for (int i = 0; i < len; i++) {

            for (int j = 0; j <maxLen; j++) {

                if(j>=b[i].length){
                    c[j]+=0;
                }else {
                    c[j]+=(b[i][j]-'0');
                }
            }
        }

        int res = 0;

        for(int i=0;i< maxLen;i++){
            res+=(int)Math.pow(k,i)*(c[i]%k);
        }

        return res;
    }
}
