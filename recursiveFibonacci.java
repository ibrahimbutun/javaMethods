public class recursiveFibonacci {
    static int isFibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return isFibonacci(number - 1) + isFibonacci(number - 2);
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(5));
    }
}
