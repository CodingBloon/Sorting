package de.bloon.util.time;

public class ProcessTimer {

    private static final double MILLISECONDS = Math.pow(10, 6);
    private static final double SECONDS = Math.pow(10, 9);

    private long start;
    private long end;

    public ProcessTimer() {}

    public void start() {
        start = System.nanoTime();
    }
    public void stop() {
        end = System.nanoTime();
    }

    public long getNanoseconds() {
        return end - start;
    }

    public double getMilliseconds() {
        return getNanoseconds() / MILLISECONDS;
    }

    public double getSeconds() {
        return getNanoseconds() / SECONDS;
    }

    public void printNanoseconds() {
        System.out.println("Took: " + getNanoseconds() + "ns");
    }
    public void printMilliseconds() {
        System.out.println("Took: " + getMilliseconds() + "ms");
    }
    public void printSeconds() {
        System.out.println("Took: " + getSeconds() + "s");
    }
}
