import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main (String[] args)
    {
        int[] arr1 = Sorts.buildArray(100000);
        int[] arr2 = arr1.clone();

        long start1 = System.currentTimeMillis();
        Sorts.selectionSort(arr1);
        long end1 = System.currentTimeMillis();
        long selectionTime = end1 - start1;
        System.out.println("Selection sort on unsorted data: " + selectionTime);

        long start1a = System.currentTimeMillis();
        Sorts.selectionSort(arr1);
        long end1a = System.currentTimeMillis();
        long selectionTime1a = end1a - start1a;
        System.out.println("Selection sort on sorted data: " + selectionTime1a);


        long start2 = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end2 = System.currentTimeMillis();
        long insertionTime = end2 - start2;
        System.out.println("Insertion sort on unsorted data: " + insertionTime);


        long start2a = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end2a = System.currentTimeMillis();
        long insertionTimea = end2a - start2a;
        System.out.println("Insertion sort on sorted data: " + insertionTimea);


        int[] arr1 = { 923, 516, 669, 7852, 964, 6354, 9643, 219, 785, 102};
        Sorts.printArr(arr1);
        System.out.println();

        Sorts.ascendingSort(arr1);
        Sorts.printArr(arr1);
        System.out.println();

        String[] arr2 = { "Andrew" , "Sandra", "Linda", "Calvin", "Jordan"};
        Sorts.printStringArr(arr2);
        System.out.println();

        String[] names = {"Andrew" , "Sandra", "Linda", "Calvin", "Jordan", "Mattia", "Daniel"};
        List<String> namesList = new ArrayList<String>();
        for(int i = 0; i<names.length; i++)
            namesList.add(names[i]);
        System.out.println(namesList);
        System.out.println();

        Sorts.ascendingSort(namesList);
        System.out.println(namesList);
        System.out.println();

        Sorts.removeLongerThan(5, namesList);
        System.out.println(namesList);
        System.out.println();
    }
}
