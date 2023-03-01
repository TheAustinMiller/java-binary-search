import java.util.Scanner;
public class Main {
  private static int search(int[] arr, int left, int right, int key){
    if (right >= left) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] > key) {
        return search(arr, left, mid - 1, key);
      }
      return search(arr, mid + 1, right, key);
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] list = {2, 10, 13, 15, 21, 30, 41, 57};
    System.out.println("Please enter the integer you would like to find: ");
    int x = in.nextInt();
    int ans = search(list, 0, list.length - 1, x);
    if (ans != -1) {
      System.out.println("Your integer (" + x + ") is at index " + ans);
    } else{
      System.out.println("Your integer does not appear in this list.");
    }
  }
}
