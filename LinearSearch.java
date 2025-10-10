public class LinearSearch{
    public static void main(String[]args){
        int nums[]={34,65,12,43,56,78,90};
        int target=90;
        System.out.println(linearsearch(nums,target));   
    }

    static int linearsearch(int[]arr,int target){
        int n=arr.length;
        if(n==0) return -1;
        //for(int i=0;i<n;i++) this is for whole array
        //for(int i=1;i<4 or 5 ;i++) this is for particular range [1,4],[1,5],[2,7]
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}