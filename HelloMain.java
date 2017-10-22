/*
 * TCSS 305 - Autumn 2017
 * Assignment 0 - Orientation
 */

/**
 * This program will print out the UW logo by having the main method
 * in this HelloMain class call an instance method from the Hello class. 
 * 
 * @author Andrew Joshua Loria
 * @version October 1, 2017
 */
public final class HelloMain
{    
    /**
     * Private constructor that inhibits instantiation.
     */
    private HelloMain() 
    {
      //do nothing  
    }

    /**
     * This is the main method that will call an instance method, 
     * which will print out the UW logo, from the Hello class.
     * @param args1 command line arguments - ignore in this program.
     */
    public static void main(final String[] args1)
    {
        final Hello w = new Hello();
        w.makeLogo();      
    }
}
