package day2;

import utls.IOUtil;

import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = IOUtil.readFile("src/resources/day2_input");
        String[] arr = list.getFirst().split(",");
        HashSet<Long> invalidIDs = new HashSet<>();
        long total;

        for (String s : arr) {
            long start = Long.parseLong(s.substring(0, s.indexOf('-')));
            long end = Long.parseLong(s.substring(s.indexOf('-') + 1));

            for (long i = start; i <= end; i++) {
                if (isDigitRepeating(i)) {
                    invalidIDs.add(i);
                }
            }
        }
        total = invalidIDs.stream().mapToLong(Long::valueOf).sum();
        System.out.println("\nTotal is: " + total);
    }

    public static boolean isDigitRepeating(long n) {
        String s = String.valueOf(n);
        int len = s.length();
        String unit;
        boolean ok;

        for (int block = 1; block <= len / 2; block++) {
            if (len % block != 0) continue;

            unit = s.substring(0, block);
            ok = true;

            for (int i = block; i < len; i += block) {
                if (!s.startsWith(unit, i)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return true;
        }
        return false;
    }
}
