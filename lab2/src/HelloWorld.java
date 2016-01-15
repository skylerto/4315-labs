  public class HelloWorld {
  
    private String hello;
 
    public HelloWorld() {
     this.hello = "Hello, World!";
    }

    public String getHello() {
      return this.hello;
    }
  
  public static void main(String [] args) {
    HelloWorld hello = new HelloWorld();
    System.out.println(hello.getHello());
  }
}
