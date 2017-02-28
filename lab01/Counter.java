/**
 * A simple integer counter 
 *
 * @Eitan Simler
 * @version Lab 01
 * @version CPE102-03
 */


/**
 * A simple integer counter.
 */
public class Counter {
  
  private int count; // current count
  private int modulus;
  private int lastSave;
  // Constructors:
  
  /**
   * Create a new Counter, with the count initialized
   * to 0.
   */
  public Counter (int modulus) {
    count = 0;
    this.modulus = modulus;
  }
  public Counter () {
    count = 0;
    modulus = 5;
  }

  // Queries (Accessors):
  
  /**
   * The number of items counted.
   */
  public int currentCount () {
    return count;
  }
  
  // Commands (Mutators):
  
  /**
   * Increment the count by 1.
   */
  public void incrementCount () {
    count = count + 1; // == count++ == count += 1 
    if (count == modulus) {
       count = 0;
    }
  }
  
  /**
   * Reset the count to 0.
   */
  public void reset () {
    lastSave = count;
    count = 0;
  }

  /**
   * Reset count to the last reset
   */
  public void unReset () {
    count = lastSave;
  }
}
