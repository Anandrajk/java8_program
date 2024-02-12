package prog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class AscendingOrder {
public static void main(String[] args) {
	int[] numbers = {5, 2, 9, 1, 7, 3};
    
    System.out.println("Original array: " + Arrays.toString(numbers));
    
    int[] Asc_Order = Arrays.stream(numbers).sorted().toArray();
    
    System.out.println("Array sorted in Ascending order: " + Arrays.toString(Asc_Order));

    int[] Desc_Order = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

    System.out.println("Array sorted in Descending order: " + Arrays.toString(Desc_Order));

}


}
