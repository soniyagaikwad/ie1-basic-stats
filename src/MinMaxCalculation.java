import java.util.*;

public class MinMaxCalculation {
    
    public static double[] findMinMax(double[] numbers) {
        BasicStats.bubbleSort(numbers);

        double min = numbers[0];
        double max = numbers[numbers.length - 1];

        return new double[] {min, max};
    }

}