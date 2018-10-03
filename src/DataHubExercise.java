public class DataHubExercise
{
    public static void main(String[] args)
    {
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        printSubArray(array);
    }

    private static int findUnsortedSubArrayStart(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
            if (array[i] > array[i + 1])
                return i;
        return array.length;
    }

    private static int findUnsortedSubArrayEnd(int[] array, int start)
    {
        for (int i = start + 1; i < array.length - 1; i++)
        {
            if (array[i] > array[i - 1] && array[i] < array[i + 1])
                return i;
        }

        return array.length - 1;
    }

    private static void printSubArray(int[] array)
    {
        int subArrayStart = findUnsortedSubArrayStart(array);
        int subArrayEnd;
        if (subArrayStart == array.length)
        {
            System.out.println("Array is sorted");
        } else
        {
            subArrayEnd = findUnsortedSubArrayEnd(array, subArrayStart);
            System.out.println(String.format("Sub array lies between index %s and index %s", subArrayStart, subArrayEnd));
        }
    }
}
