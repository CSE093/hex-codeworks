public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {42, 17, 35, 8, 36};

        int n = a.length;

        for (int i = 1; i < n; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.print("Pass " + i + ": ");

            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }

            System.out.println();

            if (swapped == false) {
                break;
            }
        }

        System.out.print("Sorted Array: ");

        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}