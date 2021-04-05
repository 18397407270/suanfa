package recursion;

public class ReverseArr {

    public static void main(String[] args) {

        int a[] = {1,0,1,1,1};

        int re = Findmin(a);

        System.out.println(re);
    }

    private static int Findmin(int[] a) {

        int start = 0;

        int end = a.length-1;

        while (start+1<end){

          int mid = (start+end)/2;

            /**
             * 存在中间与两端都相等的情况
             */
            if(a[mid]==a[start]&&a[mid]==a[end]){

              int min = Integer.MIN_VALUE-1;

              for (int i = start;i<=end;i++){
                  if(a[start]<=min){
                      min = a[i];
                  }
              }

              return min;
          }

            if(a[mid]>a[start]){

                start = mid;

            }else {
                end = mid;
            }
        }

        return a[end];
    }
}
