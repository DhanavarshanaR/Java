public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr={69,45,34,22,12};
        int target=12;
        System.out.println(search(arr,target));
    }
    static int search(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+ (end-start)/2;

            if(arr[mid]==target) return mid;

            if(arr[start]<arr[end]){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
