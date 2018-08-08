package performence;

/**
 * @author Brahim Bahaida
 */
public final class Timeit {

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
            return (end-start)/1.0e9;
        }
    }

    /**
     * private constructor.
     */

    private Timeit() {

    }

}
