import java.util.concurrent.Semaphore;

/**
 * Skyler Layne © MIT 2016
 */
public class Main {


 public static void main(String[] args){
  Reindeer r = new Reindeer();
  Elf e = new Elf();
  r.start();
  e.start();
 } 
}
