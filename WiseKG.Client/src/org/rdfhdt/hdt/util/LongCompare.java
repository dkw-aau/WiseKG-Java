package org.rdfhdt.hdt.util;

/**
 * Compare Longs, now available as Long.compare in Java 7, but not on <=Java6
 *
 * @author mario.arias
 *
 */
public class LongCompare {

    /**
     * Compares two {@code long} values numerically.
     * The value returned is identical to what would be returned by:
     * <pre>
     *    Long.valueOf(first).compareTo(Long.valueOf(second))
     * </pre>
     *
     * @param  x the first {@code long} to compare
     * @param  y the second {@code long} to compare
     * @return the value {@code 0} if {@code first == second};
     *         a value less than {@code 0} if {@code first < second}; and
     *         a value greater than {@code 0} if {@code first > second}
     * @since 1.7
     */
    public static int compare(long x, long y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

}
