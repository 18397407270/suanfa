package scale;

/*一个数组除了某一个数字只有一个外,其余的数字都是成对出现的*/
public class Unique_Number {

    public static void main(String[] args) {

        Integer a[] = {6,2,3,2,3};

        Integer b = Find_Unique_Number(a);

        System.out.println(b);
    }

    private static Integer Find_Unique_Number(Integer[] a) {

        Integer b = a[0];

        for (int i=1;i<a.length;i++){

            b = b^a[i];
        }

        return b;
    }
}
