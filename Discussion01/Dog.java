public class Dog {
  private String name;
  private int size;

  public Dog(String name, int size){
    this.name = name;
    this.size = size;
  }

  public void bark(int size){
    if (size < 5) {
      System.out.println("wow");
    } else if (size < 30) {
      System.out.println("aha");
    } else {
      System.out.println("bark");
    }
  }

  public void play(){
    System.out.println("Dog is playing.");
  }
}
