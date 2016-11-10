package com.freeland.util.effective;

/**
 * Created by chenhao on 2016/11/10.
 */
public class SubBase extends Base {

    @Override
    public void print() {
        super.print();
        System.out.println("print subclass");
    }

    @Override
    public void printBefore() {
        System.out.println("subclass before");
    }

    @Override
    public void printAfter() {
        System.out.println("subclass after");
    }

    /**
     * this is a test class which i want to test the context of the reference from subclass
     * to superclass
     * result is that
     * when the subclass override the subclass some method
     * and the subclass invoke the superclass override method before or after
     * explicitly
     * and the superclass method invoke some other method which the
     * subclass override too
     * <p>
     * first the as this class show
     * when subclass invoke print
     * first  invoke the super class
     * and the super class invoke before method
     * because the subclass also override the before method too
     * and the context environment was at subclass
     * so the before method will linked to the subclass
     * so ..... this is important
     * today i read the effective java
     * chapter four
     * and take place this
     * subclass invoke the override method
     */
    public static void main(String[] args) {
        SubBase s = new SubBase();
        s.print();
    }
    
}
