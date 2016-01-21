import java.lang.Thread;

public class Santa extends Thread {

  public static synchronized void wake(){
    System.out.println("Okay, Okay I'm up!");
  }
}
