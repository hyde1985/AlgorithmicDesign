import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        int digit_difference = (getFibonacciSumDigit(to) - getFibonacciSumDigit(from-1));
        if digit_difference < 0 {
            digit_difference += 10
        }
        return digit_difference
    }

    private static int getFibonacciSumDigit(long n) {
        List<Long> fibNum = new ArrayList<>();
        List<Long> mods = new ArrayList<>();
        fibNum.add(0, 0l);
        fibNum.add(1, 1l);
        mods.add(0, 0l);
        mods.add(1, 1l);
        int i = 2;
        while(true) {
            fibNum.add(i, mods.get(i - 1) + mods.get(i - 2));
            mods.add(i, fibNum.get(i) % 10);
            if(mods.get(i - 1) == 0l && mods.get(i) == 1l) {
                break;
            }
            i++;
        }
        int remainder = (int)((n + 2) % 60); // The period length is i-1
        return (fibNum.get(remainder) - 1) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}
