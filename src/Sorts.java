import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[lowPosition])
                {
                    lowPosition = j;
                }

                swap(i, lowPosition, arr);
            }
        }
    }

    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArray(int[] arr)
    {
        for (int n : arr)
        {
            System.out.print(n + ", ");
        }
        System.out.println();
    }

    public static void printArray(List<String> list)
    {
        for (String n : list)
        {
            System.out.print(n + ", ");
        }
        System.out.println();
    }

    public static void ascendingSort(List<String> list)
    {
        for (int i = 0; i < list.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < list.size(); h++)
            {
                if (list.get(h).compareTo(list.get(lowPosition)) < 0)
                    lowPosition = h;
            }
            list.set(i, list.set(lowPosition, list.get(i)));
        }
    }

    public static ArrayList<String> RemoveLongerThan(int lenMax, List<String> list)
    {
        ArrayList<String> removedList = new ArrayList<String>();
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (list.get(i).length() > lenMax)
            {
                removedList.add(list.remove(i));
            }
        }

        return removedList;
    }
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }

    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }

    private static void mergeSortHelper(int[] elements,
                                        int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements,
                              int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }

    public static int getRandomNumber (int maxPower)
    {
        return (int)(Math.random() * Math.pow(10, maxPower));
    }

    public static int[] buildArray(int length)
    {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
        {
            arr[i] = getRandomNumber(6);
        }
        return arr;
    }
}
