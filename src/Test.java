import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main (String[] args)
    {
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
