//Daily Coding Problem 03 Aug 2023
//   Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
import java.util.*;
import static org.junit.Assert.*;

class Main {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(10, 15, 3, 7);
    assertTrue( solution( list1, 17 ) );
    List<Integer> list2 = Arrays.asList(-2, 7, 13, 29);
    assertTrue( solution( list2, 5 ) );
    
    assertFalse( solution( list1, 30 ) );
    assertFalse( solution( list2, 30 ) );
  }

  public static boolean solution( List<Integer> numbers, int k ){

    int target = k;
    Set<Integer> foundNumbers = new HashSet<>();
    for( int i = 0; i < numbers.size(); i ++ ){
      int currentNumber = numbers.get( i );
      int partialSum = target - currentNumber;
      if( foundNumbers.contains( partialSum ) ){
        return true;
      }
      foundNumbers.add( currentNumber );
    }
    return false;
    
  }
  
}