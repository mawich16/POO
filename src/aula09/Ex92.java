package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex92 {
    public static void main(String[] args) {
            final int[] DIMS_TO_TEST = {1000, 5000, 10000, 20000, 40000, 100000};

            System.out.println("ArrayList      Add   Search   Remove");

            for (final int DIM : DIMS_TO_TEST) {
                Collection<Integer> col = new ArrayList<>();
                final double[] times = checkPerformance(col, DIM);
                System.out.printf("%9d %8.2f %8.2f %8.2f\n", DIM, times[0], times[1], times[2]);
            }

            System.out.println();
            System.out.println("LinkedList      Add   Search   Remove");

            for (final int DIM : DIMS_TO_TEST) {
                Collection<Integer> col = new LinkedList<>();
                final double[] times = checkPerformance(col, DIM);
                System.out.printf("%9d %8.2f %8.2f %8.2f\n", DIM, times[0], times[1], times[2]);
            }

            System.out.println();
            System.out.println("HashSet      Add   Search   Remove");

            for (final int DIM : DIMS_TO_TEST) {
                Collection<Integer> col = new HashSet<>();
                final double[] times = checkPerformance(col, DIM);
                System.out.printf("%9d %8.2f %8.2f %8.2f\n", DIM, times[0], times[1], times[2]);
            }

            System.out.println();
            System.out.println("TreeSet      Add   Search   Remove");

            for (final int DIM : DIMS_TO_TEST) {
                Collection<Integer> col = new TreeSet<>();
                final double[] times = checkPerformance(col, DIM);
                System.out.printf("%9d %8.2f %8.2f %8.2f\n", DIM, times[0], times[1], times[2]);
            }
        }
        
        private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, add, search, remove;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
        col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        add = (stop-start)/1e6; // convert to milliseconds
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        search = (stop-start)/1e6; // convert nanoseconds to milliseconds

        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        remove = (stop-start)/1e6; // convert nanoseconds to milliseconds
        return new double[]{add, search, remove};
    }
}
