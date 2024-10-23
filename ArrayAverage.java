public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum / arr.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
