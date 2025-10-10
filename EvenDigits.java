public class EvenDigits {
    public static void main(String[] args) {
        int arr[]={122,345,6,43,65};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int []arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int arr){
        int NumberOfDigits=digits(arr);
        return NumberOfDigits % 2==0;
    }
    static int digits(int arr){
        int count=0;
        while(arr>0){
            count++;
            arr/=10;
        }
        return count;
    }
}
