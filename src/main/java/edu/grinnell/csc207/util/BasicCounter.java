package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
    int count;
    int start;

    public BasicCounter(int initialCount1) {
        this.count = initialCount1;
        this.start = initialCount1;
    } // BasicCounter(int)

    public BasicCounter() {
        this(0);
    } // BasicCounter()

    public int get() {
        return this.count;
    } // get()

    public void increment() throws Exception {
        if (this.count == Integer.MAX_VALUE) {
            throw new Exception("Counter too large");
        }
        this.count++;
    } // increment()

    public void reset() {
        this.count = this.start;
    } // reset()

    public String toString() {
        return "[" + this.count + "]";
    } // toString()
}
