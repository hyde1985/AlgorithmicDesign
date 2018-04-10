import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
    	List<Long> fibNum = new ArrayList<>();
        List<Long> mods = new ArrayList<>();
        fibNum.add(0, 0l);
        fibNum.add(1, 1l);
        mods.add(0, 0l);
        mods.add(1, 1l);
        int i = 2;
        while(true) {
        	fibNum.add(i, mods.get(i - 1) + mods.get(i - 2));
        	mods.add(i, fibNum.get(i) % m);
        	if(mods.get(i - 1) == 0l && mods.get(i) == 1l) {
        		break;
        	}
        	i++;
        }
        int remainder = (int)(n % (i-1)); // The period length is i-1
        return fibNum.get(remainder) % m;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}
