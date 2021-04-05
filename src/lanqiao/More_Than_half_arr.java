package lanqiao;

public class More_Than_half_arr {

    /**
     *数组中一定有超过数组一半长度的数字,不然该算法就有漏洞
     * @param args
     */

    public static void main(String[] args) {

        int a[] = {1,2,1,3,3,3,4,1,3,3};

        int count = 0;

        int x = a[0];

        for (int i = 1; i < a.length; i++) {

            if(count==0){
                x = a[i];
                count++;
            }else if(x==a[i]){ ;
                count++;
            }else {
                count--;
            }
        }

        if(count>0){
            System.out.println(x);
        }
    }
}
