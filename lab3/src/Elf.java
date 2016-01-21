import java.util.concurrent.Semaphore;
import java.lang.Thread;

/**
 * Skyler Layne © MIT 2016
 */
public class Elf extends Thread {

  private static Semaphore elfSema = new Semaphore(3);

  @Override
  public void run(){
    boolean elf = true;
    while(elf){
      if(Reindeer.reinSema.availablePermits() < 1){
        //System.out.println("awww: " + Reindeer.reinSema.availablePermits());
        elfSema.release(3);
        elf = false;
        break;
      } else {
        if(elfSema.availablePermits() > 0){
          try {
            elfSema.acquire();
          } catch(Exception e){
            e.printStackTrace();
          }
        } else {
          Santa.wake();
          elfSema.release(3);
        }
      }
    }
    System.out.println("Guess I'll have to wait till next year!");
  }
}
