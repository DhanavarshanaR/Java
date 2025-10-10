import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int [][] arr={
            {-2,4,5},
            {23,1,67},
            {12,35,89}
        };
        System.out.println(Arrays.toString(search(arr)));
    }
        
    static int[] search(int[][] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
                if(arr[row][col]<min){
                    min=arr[row][col];
                }            
            }
        }
        return new int[] {min,max};
                
    }
}
