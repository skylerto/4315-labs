import java.util.concurrent.Semaphore;

public class Sema {
  public static void main(String[] args){
   Semaphore elf = new Semaphore(2);
   Semaphore rein = new Semaphore(8);
   Semaphore santa = new Semaphore(1);

       /* REIN THREAD */
   new Thread(){
    boolean bool = true;
    @Override
    public void run() {
      while(bool) {
        try {
          if(rein.availablePermits() == 0){
            bool = false;
            break;
          } else {
            rein.acquire();
          }
        } catch(Exception e){
          e.printStackTrace();
        }
      }
    }
   }.start();

   /* ELF THREAD */
   new Thread(){
    boolean reinBool = true;
    @Override
    public void run() {
      while(reinBool) {
        try {
          if(rein.availablePermits() == 1){
              reinBool = false;
              break;
          } else {
            if(elf.availablePermits() == 0){
              System.out.println("ELF: Go wake santa!");
              elf.release(2);
            } else {
              elf.acquire();
            }
          }
        } catch(Exception e){
          e.printStackTrace();
        }
      }
    }
   }.start();

   /* SANTA THREAD */
   new Thread(){
     boolean santaBool = true;
    @Override
    public void run() {
      while(santaBool) {
        if(rein.availablePermits() == 0){
          santaBool = false;
          break;
        } else if(elf.availablePermits() == 0) {
          System.out.println("You've awaken Santa!");
        }
      }
    }
   }.start();
  }
}
