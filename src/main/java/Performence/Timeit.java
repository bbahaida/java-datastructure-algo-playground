package Performence;

public class Timeit {

    /**
     *
     * @param block
     * @return Time of execution
     */
    public static double code(final Runnable block){
        long start = System.nanoTime();
        try{
            block.run();
        }finally {
            long end = System.nanoTime();
            return (end-start)/1.0e9;
        }
    }

}
