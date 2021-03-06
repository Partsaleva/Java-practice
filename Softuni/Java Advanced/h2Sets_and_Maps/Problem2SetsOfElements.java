package h2Sets_and_Maps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2SetsOfElements {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String[] sizes = str.nextLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);
        Set<Integer> nSet = new HashSet<Integer>();
        Set<Integer> mSet = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int nPart = num.nextInt();
            nSet.add(nPart);
        }
        for (int i = 0; i < m; i++) {
            int mPart = num.nextInt();
            mSet.add(mPart);
        }
        str.close();
        num.close();
        
        nSet.retainAll(mSet);
        System.out.println(nSet);
    }
}
