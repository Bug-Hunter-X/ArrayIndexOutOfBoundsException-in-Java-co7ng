public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2; //Valid Index
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]); // This will now print arr[2] which is 0
        } else {
            System.out.println("Index out of bounds");
        }
    }
}