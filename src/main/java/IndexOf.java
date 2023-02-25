
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        int indexN = 0;
        int noSuchValue = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                indexN = i;
                return indexN;
            }
            else if(arr[i] != n){
                indexN = noSuchValue;
            }
        }

        return indexN; // Returns -1 if there are no matching values
        
    }
}
