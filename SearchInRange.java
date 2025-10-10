public class SearchInRange {
    public static void main(String[]args){
        int nums[]={34,65,12,43,56,78,90};
        int target=78;
        int start=1;
        int end=5;
        System.out.println(linearsearch(nums,target,start,end));   
    }

    static int linearsearch(int[]arr,int target,int start,int end){
        int n=arr.length;
        if(n==0) return -1;

        for(int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
