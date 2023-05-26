public class Fib {
  public static int fib(int n){
    if (n <= 1){
      return n;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }

  public static int fib2(int n, int k, int f0, int f1){
    if (n == k){
      return f0;
    } else {
      return fib2(n,k+1,f1, f0+f1);
    }
  }
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(fib(n));

  }
}
