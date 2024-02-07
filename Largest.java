// Find largest element in the array
//Easy-level Question
public class Largest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 10, 20, 30, 55};
        int largest = findElement(arr);
        System.out.println(largest);

    }
    public static int findElement(int[] arr){
       int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }return largest;
    }
}

