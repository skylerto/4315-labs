import java.util.concurrent.Semaphore;

public class Main {


 public static void main(String[] args){
  Reindeer r = new Reindeer();
  Elf e = new Elf();
  r.start();
  e.start();
 } 
}
