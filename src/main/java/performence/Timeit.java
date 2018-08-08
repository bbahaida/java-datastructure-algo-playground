package performence;

/**
 * @author Brahim Bahaida
 */
public final class Timeit {

    /**
     * JavaDoc Comment :p.
     */
    private static final double TIMER_DIVIDER = 1.0e9;

    /**
     *
     * @param block code to be executed
     * @return Time of execution
     */

    public static double code(final Runnable block) {
        long start = System.nanoTime();
        try {
            block.run();
        } finally {
            long end = System.nanoTime();
            return (end - start) / TIMER_DIVIDER;
        }
    }

    /**
     * private constructor.
     */

    private Timeit() {

    }

}
