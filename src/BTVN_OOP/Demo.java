package BTVN_OOP;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,4};
        show(arr);
        System.out.println(Arrays.toString(arr));;
    }

    public static void show(int[] arr){
        arr[0] = 11;
        arr[1] = 15;
        arr[2] = 19;
    }
}
