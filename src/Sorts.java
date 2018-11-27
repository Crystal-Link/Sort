import java.util.ArrayList;
import java.util.List;

public class Sorts
{
    public static void ascendingSort(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int lowPosition = i;

            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[lowPosition])
                    lowPosition = j;
            }
            swap(i, lowPosition, arr);
        }
    }
    public static void ascendingSort(List<String> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            int lowPosition = i;
            for (int j = i+1; j < list.size(); j++)
            {
                if(list.get(j).compareTo(list.get(lowPosition)) < 0)
                    lowPosition = j;
            }
            list.set(i, list.set(lowPosition, list.get(i)));
        }
    }

    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArr(int[] arr)
    {
        for (int num: arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void printStringArr(String[] arr)
    {
        for (String str: arr)
            System.out.print(str + " ");
        System.out.println();
    }

    public static List<String> removeLongerThan (int maxLen, List<String> list)
    {
       /* for(int i = list.size()-1; i >= 0; i--)
            if (list.get(i).length() > maxLen)
                list.remove(i); */
       ArrayList<String> removedNames = new ArrayList<String>();
       int i = 0;
       while (i < list.size())
       {
           if (list.get(i).length() > maxLen)
           {
                removedNames.add(list.remove(i));
           }
           else i++;
       }
       return removedNames;
    }
}
