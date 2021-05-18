package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Interview {

    public static List partition(int[] arr, int len){
        List<int[]> result = new ArrayList<>();
        int index = 0;
        while(index < arr.length) {
            if(index + len > arr.length) len = arr.length - index;
            int[] slice = Arrays.copyOfRange(arr, index, index + len);
            result.add(slice);
            index += len;
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        List<int[]> list = partition(array, 3);
        int[][] tab = list.toArray(new int[][] {});
        System.out.println(Arrays.deepToString(tab));
    }

     /*
    partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
    partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
    partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
     */

}
