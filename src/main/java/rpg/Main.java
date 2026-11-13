package rpg;

public class Main {

  public static void main(String[] args) {
    System.out.println("=== Java RPG ===");

    // Gdy skończysz klasę Hero, odkomentuj kod poniżej (Ctrl + / w IntelliJ)
    // i uruchom program. Powinna odbyć się walka do śmierci jednego z bohaterów.

    Hero aragorn = new Hero("Aragorn", 100, 12);
    Hero gimli = new Hero("Gimli", 120, 9);


    int round = 1;
    while (aragorn.isAlive() && gimli.isAlive()) {
      System.out.println("\n--- Runda " + round + " ---");
      aragorn.attack(gimli);
      if (gimli.isAlive()) {
        gimli.attack(aragorn);
      }
      System.out.println(aragorn);
      System.out.println(gimli);

      round++;
    }

    Hero winner = aragorn.isAlive() ? aragorn : gimli;
    System.out.println("\nZwycięzca: " + winner.getName() + "!");
  }
}
