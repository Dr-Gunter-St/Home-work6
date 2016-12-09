package Home_Work6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ArrayUtils {

    public static int sum(int[] array){
        int sum = 0;
        for (int n: array){
            sum += n;
        }
        return sum;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int n:array){
            if (max < n) max = n;
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int n: array){
            if (min > n) min = n;
        }
        return min;
    }

    public static int maxPositive(int[] array){
        int max = -1;
        for (int n:array){
            if (max < n) max = n;
        }
        return max;
    }

    public static int multiplication(int[] array){
        int res = 1;
        for (int n:array){
            res *= n;
        }
        return res;
    }

    public static int modulus(int[] array){
        return array[0]%array[array.length-1];
    }

    public static int secondLargest(int[] array){
        int Largest = max(array);

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            if (Largest > array[i]) return array[i];
        }
        return -1;
    }

    public static int[] reverse(int[] array){
        for (int i = 0; i < (array.length-1)/2; i++){
            int c = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = c;
        }

        return array;
    }

    public static int[] findEvenElements(int[] array){
        List<Integer> list = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                list.add(array[i]);
                counter ++;
            }
        }

        int[] result = new int[counter];
        for (int i = 0; i < counter; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
