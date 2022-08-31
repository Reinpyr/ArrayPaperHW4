import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float original [] = {5,4,-7,-2,1};
        float [] reversed = new float[original.length];

        for(int i = original.length, k = 0; i > 0; i = i - 1, k = k + 1)
        {
            reversed[k]=original[i-1];
        }
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed " + Arrays.toString(reversed));
    }
}