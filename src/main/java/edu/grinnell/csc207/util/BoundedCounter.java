package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter{
    int bound;
    public BoundedCounter(int start, int upperBound) {
        super(start);
        this.bound = upperBound;

    }
    public void increment() throws Exception {
        if (count + 1 > bound) {
            throw new Exception("Count is over the bound");
        }
        super.increment();
    }
    
}
