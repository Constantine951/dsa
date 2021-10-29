public class CollectionsSearch {
    public static void main(String[] args) {
        int[] integers = {3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
        int elementToSearch = 67;
        int index = java.util.Arrays.binarySearch(integers, elementToSearch);
        System.out.println(index);
    }
}
