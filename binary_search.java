import java.util.Scanner;
import java.lang.Thread;
public class binary_search
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        /* Taking the limit of the array */
        System.out.println();
        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();

        /* Declaring the array */
        int arr[] = new int[lmt];

        /* Taking the input in the array */
        System.out.println();
        System.out.println("Enter the value in the array.....");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        /* Appling the sorting technique to display the sorted array */

        /* Applying Bubble sorting technique */
        int temp = 0;
        for(int i = 0; i < lmt - 1; i++){
            for(int j = 0; j < lmt - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        /* Displaying the array */
        System.out.println();
        System.out.println("Your array is displayed.....");
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        /* Searching element */
        System.out.println();
        System.out.println("Enter the element you want to find: ");
        int find = sc.nextInt();

        /* Calling the static method Engine */
        if(Engine(arr, lmt, find) != -1){
            System.out.println("Element found in the above array !");
        } else {
            System.out.println("element not found");
        }
    }

    public static int Engine(int arr[], int lmt, int find)
    {
        int low = 0;
        int high = lmt - 1;

        for(int i = 0; i < lmt - 1; i++){
            int mid = (low + high) / 2;
            if(arr[mid] == find){
                return mid;
            } else if(arr[mid] < find){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
