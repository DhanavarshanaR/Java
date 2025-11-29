import java.util.Arrays;

public class MergeSort {
    public static void mSort(int[]arr,int start,int mid,int end){
        int[]res=new int[arr.length];
        int i=start;
        int j=mid;
        int k=start;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                res[k]=arr[i];
                i++;
                k++;
            }
            else{
                res[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            res[k]=arr[i];
            i++;
            k++;
        }
        while(j<end){
            res[k]=arr[j];
            j++;
            k++;
        }

        for(int itr=start;itr<end;itr++){
            arr[itr]=res[itr];
        }
    }
    public static void mergeSort(int[]arr,int start,int end){
        if(end-start==1) return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        mSort(arr,start,mid,end);

    }

    public static void main(String[] args) {
        int[]arr={0,5,3,6,2,9};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
