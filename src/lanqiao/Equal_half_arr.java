package lanqiao;

public class Equal_half_arr {

    /**
     * 求一个数组中等于数组中一半长度的数字
     * @param args
     */

    public static void main(String[] args) {

        int a[] = {1,3,2,3,4,3,3,5};

        int count = 0;

        int Lastcount = 0;

        int x = a[0];
        for (int i = 0; i < a.length; i++) {

            if(a[i]==a[a.length-1]){
                Lastcount++;
            }
            if(count==0){
                x = a[i];
                count++;
            }else if(x==a[i]){

                count++;
            }else {

                count--;
            }
        }

        if(Lastcount==a.length/2){
            System.out.println(a[a.length-1]);
        }else {
            System.out.println(x);
        }
    }
}
