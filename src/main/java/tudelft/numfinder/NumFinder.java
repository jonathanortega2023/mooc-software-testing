package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MIN_VALUE;
    private int largest = Integer.MAX_VALUE;

    public void find(int[] nums) {
        for(int n : nums) {

            if(n < smallest)
                smallest = n;
            else if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
