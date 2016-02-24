package java.lang;

/**
 * A model class for the class java.lang.StrictMath class, contains an
 *implementation of SquareRoot.
 *
 * We are defining our own java.lang.StrictMath class which provides an
 *implementation of Square root which does NOT make native calls.
 * This is
 *
 * @author Skyler Layne
 */
public class StrictMath {
  /**
   * Contains the implementation of square root.
   *
   * @params - a number to be square rooted
   * @return - the square root of the passed value.
   */
  public static double sqrt(double value) {
    double a = value, result = -1, i = 0;

    if (a < 0) {
      return result;
    } else {
      while (true) {
        if ((i * i) > a) {
          break;
        }
        i++;
      }
      i      = i - 1;
      result = a / i;
      result = (result + i) / 2;
    }
    return result;
  }
}
