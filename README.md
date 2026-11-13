# Java RPG ⚔️

Konsolowa gra RPG z walką turową, pisana krok po kroku, żeby nauczyć się Javy:
od pierwszej klasy aż po polimorfizm, generyki i wzorce projektowe.

## Jak uruchomić

**IntelliJ IDEA (polecane):** `File → Open` → wybierz folder projektu (ten z `pom.xml`).
IntelliJ sam wykryje projekt Maven. Potem otwórz `Main.java` i kliknij zielony ▶ obok `main`.

**Z terminala (bez Mavena):**
```bash
javac -d out src/main/java/rpg/*.java
java -cp out rpg.Main
```

Wymagana Java 21+.

## Plan nauki

| Etap | Temat | W grze |
|------|-------|--------|
| 1 | Klasy i obiekty | Klasa `Hero`, pierwsza walka |
| 2 | Enkapsulacja | `private`, gettery, walidacja |
| 3 | Dziedziczenie | `Character` → `Hero`, `Monster` |
| 4 | Kolekcje | Lista potworów, ekwipunek w `HashMap` |
| 5 | Polimorfizm | `Warrior`, `Mage`: różne ataki; overloading vs overriding |
| 6 | Klasy abstrakcyjne i interfejsy | `abstract Character`, `interface Castable` |
| 7 | Wyjątki i testy JUnit | Błędne akcje, testy obrażeń |
| 8 | Generyki | `Inventory<T extends Item>` |
| 9 | Wzorce projektowe | Strategy (AI), Factory (wrogowie), Observer (logi) |
| 10 | Nowoczesna Java | `record`, `sealed`, `switch` z pattern matchingiem |

Każdy etap kończy się commitem, np. `git commit -m "Etap 1: klasa Hero"`.
Dzięki temu w historii widać, jak projekt rośnie.

---

## Etap 1: Klasy i obiekty

### Trochę teorii

- **Klasa** to szablon, a **obiekt** to konkretna rzecz zrobiona z tego szablonu.
  `Hero` to klasa. `new Hero("Aragorn", 100, 12)` tworzy obiekt.
- **Pola** to dane obiektu (imię, HP). Każdy obiekt ma *własne* kopie pól:
  gdy Aragorn traci HP, Gimli nic nie traci.
- **Konstruktor** to specjalna metoda uruchamiana przy `new`. Ma taką samą nazwę jak klasa
  i nie ma typu zwracanego.
- **`this`** oznacza "ten obiekt, na którym właśnie działam". Przydaje się, gdy parametr
  nazywa się tak samo jak pole: `this.name = name;`
- **Metody** to zachowanie obiektu. `aragorn.attack(gimli)` znaczy:
  "Aragornie, zaatakuj Gimlego".

### Zadanie

Otwórz `src/main/java/rpg/Hero.java` i zrób TODO 1–6:

1. Pola: `name`, `hp`, `strength`
2. Konstruktor `Hero(String name, int hp, int strength)`
3. `boolean isAlive()`
4. `void takeDamage(int amount)`: HP nie może zejść poniżej 0
5. `void attack(Hero target)`: wywołuje `takeDamage` na celu i wypisuje komunikat
6. `String getName()`

Potem odkomentuj kod w `Main.java` i uruchom program.

### Bonus (jeśli pójdzie gładko)

- Wypisuj po każdym ataku, ile HP zostało celowi.
- Dodaj trzeciego bohatera i zrób turniej: każdy z każdym.
- Zastanów się: co się stanie, gdy w `Main` napiszesz `aragorn.hp = 99999;`?
  Czy to dobrze? (To jest temat etapu 2.)

Gdy skończysz, wklej mi swój kod `Hero.java`. Zrobię review i przejdziemy do etapu 2.
