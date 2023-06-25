import java.util.Scanner;

class Container
{
    static int findMax(int[] arr, int s)
    {
        int max = 0;
        for (int i = 0; i<s-1; i++) {
            for(int j=i+1; j<s; j++)
            {
                int min = (arr[i] < arr[j]) ? arr[i] : arr[j];
                int area = min * (j-i);
                if(area > max)
                {
                    max = area;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Possible area: " + findMax(arr, size));
    }
}

/*
for(int i = 0; i < a.length; i++)
    {
        for(int j = i + 1; j < a.length; j++)
        {
            Area = Math.max(Area, Math.min(a[i], a[j]) *(j - i));
        }
    }
    return Area;
}
*/
