package recursion;

/*利用递归求数组里面的数字之和*/
public class Query_Sum {

    public static void main(String[] args) {

        int a[] = {1,2,3,4};

        int i = 0;

        int sum = Query_sum(a,i);

        System.out.println(sum);
    }

    private static int Query_sum(int[] a,int i) {


        if(i>a.length-1){
            return 0;
        }

        return a[i]+Query_sum(a,i+1);
    }
}
