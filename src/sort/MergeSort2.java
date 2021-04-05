package sort;

public class MergeSort2 {

    public static void main(String[] args) {

        int[] a = {18, 45, 36, 30, 92, 72, 25};
        mergeSort(a,0,a.length-1);
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }

    //归并
    public static void merge(int[] a, int start, int mid, int end){
        int[] temp = new int[a.length];
        int i = start, j = mid+1, k = start;
        while(i!=mid+1 && j!=end+1){
            if(a[i]<a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while(i!=mid+1){
            temp[k++] = a[i++];
        }

        while(j!=end+1){
            temp[k++] = a[j++];
        }

        for(i=start; i<=end; i++)
            a[i] = temp[i];
    }

    //归并排序
    public static void mergeSort(int[] a, int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            mergeSort(a, start, mid);//左边排序
            mergeSort(a, mid+1, end);//右边排序
            merge(a, start, mid, end);
        }
    }
}