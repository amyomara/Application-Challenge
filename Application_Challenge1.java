/*  Name:   Amy O'Mara
 *  Date:   12/10/22
 *  Title:  Find the most common integer in an array
 *  Info:   This is achieved using a method to sort the array and a method
 *          to filter through to keep track of the most common integer
 */
public class Tester{
    public static void main(String[] args){
        int []arr = {5,2,3,4,1,1,5,4,4,2,7,5,1,5};
        System.out.println("Most common int is: " + mostFrequentInt(arr));
    }
    //function to find the most frequent int in an array
    public static int mostFrequentInt(int [] arr){
        //Sort array, ascending or descending order doesn't matter
        sortArray(arr);
        //start count at 1 as all values found in the array will be there at least once
        int count = 1;
        //keep track of the number of times the most common int has occured so far
        int max = 0;
        //initialise the current int as the first element of the array
        int currentInt = arr[0];
        int mostFrequentInt = currentInt;
        
        //iterate through the array starting with the second element 
        for(int i=1; i<arr.length; i++){
            //compare both elements and increment count accordingly
            if(arr[i] == currentInt){
                count++;
            }
            else{
                //store the value of count if it is the maximum so far
                if(count > max){
                    max = count;
                    mostFrequentInt = currentInt;
                }
                //set a new current int and reset count to 1
                currentInt = arr[i];
                count = 1;
            }
        }
        return mostFrequentInt;
    }
    //bubble sort function
    public static int[] sortArray(int [] arr){
        for(int i=0; i<(arr.length)-1; i++){
            for(int j=1; j<(arr.length-i)- 1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
