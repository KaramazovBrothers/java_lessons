package my.example;

public class ArraysDemo {
    public static void main(String[] args) {
        //Среднее арифметическое
        int[] nums = new int[55];
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            a += i;
        }
        System.out.println(a / 55);

        //Поиск максимального
        int[] maximum = {1,2,3,4,5,6,7,8,9};
        int max = maximum[0];
        for (int i = 0; i < maximum.length; i++) {
            if (max < maximum[i]) {
                max = maximum[i];
            }
        }
        System.out.println(max);
    }
}

