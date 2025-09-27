public class AutomorphicNo {
  public static void main(String[] args) {
    int number = 625;

    if (isAutomorphic(number, number * number)) {
      System.out.println("Automorphic Number");
    } else {
      System.out.println("Not an Automorphic Number");
    }
  }

    
  public static boolean isAutomorphic(int num, int square) {
    if (num == 0)
      return true;

    if (num % 10 != square % 10)
      return false;

    return isAutomorphic(num / 10, square / 10);
  }
}