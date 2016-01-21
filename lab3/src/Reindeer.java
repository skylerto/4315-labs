import java.util.concurrent.Semaphore;
import java.lang.Thread;

/**
 * Skyler Layne © MIT 2016
 */
public class Reindeer extends Thread {

	public static Semaphore reinSema = new Semaphore(9);
 
  @Override
  public void run(){
    boolean rein = true;
    while(rein){
      if(reinSema.availablePermits() > 0) {
        try {
          reinSema.acquire();
          //System.out.println("got it " + reinSema.availablePermits());
        } catch(Exception e){
          e.printStackTrace();
        }
      } else {
        Santa.wake("lets go my beautiful reindeer!");
        reinSema.release(9);
        break;
      }
    }
    System.out.println("Let's go deliver toys Santa!");
  }
}
