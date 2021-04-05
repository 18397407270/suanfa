package sort;

public class BinarySearch {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7};

        int t = 10;

        int low = 0;

        int height = a.length-1;

        int re = binarysearch(a,t,low,height);

        System.out.println(re);


    }

    private static int binarysearch(int[] a, int key, int low, int height) {

        while (low<=height){

            int mid = (low+height)/2;

            if(a[mid]<key){
                low = mid+1;
            }else if(a[mid]>key){
                height = mid -1;
            }else if(a[mid]==key){
                return key;
            }
        }

        return -1;
    }

}
