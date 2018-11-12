import junit.framework.TestCase;

public class Test extends TestCase {

  public void testFactorialNegativeNumberIs1() {
    assertEquals(Factorial.factorial(-1), 1);
    assertEquals(Factorial.factorial(-10), 1);
    assertEquals(Factorial.factorial(-37), 1);
    assertEquals(Factorial.factorial(-42), 1);
  }

  public void testFactorial0Is1() {
    assertEquals(Factorial.factorial(0), 1);
  }

  public void testFactorial1Is1() {
    assertEquals(Factorial.factorial(1), 1);
  }

  public void testFactorial2Is2() {
    assertEquals(Factorial.factorial(2), 2);
  }

  public void testFactorialMorePositiveIntegers() {
    assertEquals(Factorial.factorial(3), 6);
    assertEquals(Factorial.factorial(5), 120);
    assertEquals(Factorial.factorial(10), 3628800);
  }
}
