package challenge;

import java.sql.Array;
import java.util.Arrays;

public class ProblemTwo {
    /*
    Problem 2: Write java Program to Find Smallest and Largest Element in an Array.
    Note: Number can not be repeated in the array.

    For example:
            1
            2
            3
            4
            5
            6

    int[] arr1={7,5,6,1,4,2};
    Missing number : 3
    int[] arr2={5,3,1,2};
    Missing number : 4
*/
    public static void main(String[] args) {
        int myArr[] = {7,5,6,1,4,2};
        System.out.println("Missing Element: (not implemented): "+getMissingElement(myArr));
        int[] answerArray = printElements(myArr);
        System.out.println(answerArray[0]);
        System.out.println(answerArray[1]);

    }
    public static int[] printElements(int arr[]){ //will not handle empty arrays.
        //print largest and smallest element in array
        //or should I return this?
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (arr[i]<smallest){
                smallest= arr[i];
            }
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Lowest Element: "+ smallest);
        System.out.println("Greatest Element: "+ largest);
        //could refactor this to return an array of ints...
        int[] ans = {smallest, largest};
        return ans;
    }
    public static int getMissingElement(int arr[]){
        int answer = 0;
        //sort, iterate over array,
        //set answer to i where arr[i] not exist... wait...
        Arrays.sort(arr);
        for (int i = 0; i< arr.length-1;i++){
            //should iterate over the array
            System.out.println(arr[i]);
            //if first or last missing, there is no way to know - unless array starts at 0 every time.
            //but I received no instructions for that
            //so for now I will assume that first and last elements are not missing
            if (arr[i]+1 !=arr[i+1]){
                answer = i+2; //+1 to bring index from 0 to 1, +1 to return the next element
                //... because first element should exist... right?
            }
        }





        return answer; //fixme
    }
}
