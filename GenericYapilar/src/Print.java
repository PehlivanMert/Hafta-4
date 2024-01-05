public class Print {

    public static <T> void printArray(T [] array) {
        for (T i : array) {
            System.out.print(i + " ");
        }
    }
}
