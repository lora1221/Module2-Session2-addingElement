import java.util.Scanner;

public class AddingElement {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,0,0,0,0,0};
        int lengthOfArray = array.length;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter element x to add into the array: ");
        int x = keyboard.nextInt();
        System.out.print("Enter location to add x: ");
        int index = keyboard.nextInt();
        if (index < 0 || index > lengthOfArray - 1) {
            System.out.println("Can't add the element");
        } else {
            int temp1 = array[index];
            array[index] = x;
            for (int i = index + 1; i < lengthOfArray; i ++) {
                int temp2 = array[i];
                array[i] = temp1;
                temp1 = temp2;
            }
        }

        System.out.println("Arary is: ");
        for (int i = 0; i < lengthOfArray; i++){
            System.out.print(array[i] + " ");
        }

    }
}