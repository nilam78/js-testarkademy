public class Main {
  public static void main(String[] args) {
    for(int i = 1; i <= 1000; i++) {
      if (((i % 3) == 0) && ((i % 7) == 0)) 
        System.out.print("Arkademy");
      else if ((i % 3) == 0) System.out.print("Arka");     
      else if ((i % 7) == 0) System.out.print("Demy");
      else System.out.print(i);
      System.out.print(" ");
    }
    System.out.println();
  }
}