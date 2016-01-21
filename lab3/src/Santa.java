import java.lang.Thread;

/**
 * Skyler Layne © MIT 2016
 */
public class Santa extends Thread {

  public static synchronized void wake(){
    System.out.println("Okay, Okay I'm up!");
  }
}
