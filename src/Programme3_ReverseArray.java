public class Programme3_ReverseArray {

    public static void main(String[] args) {

        int [] arr  = new int[] {10,15,18,8,9,4};
        System.out.println("original array");
        for (int i =0; i< arr.length; i++){ //condition for loop
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order:");
        for(int i = arr.length -1;i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }



}
