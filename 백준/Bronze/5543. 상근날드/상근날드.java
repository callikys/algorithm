import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] burger = new long[3];
        long[] drink = new long[2];
        for(int i = 0; i<burger.length; i++) {
            burger[i] = sc.nextLong();
        }
        for(int i = 0; i<drink.length; i++) {
            drink[i] = sc.nextLong();
        }
        long lowBurger = 2000;
        long lowDrink = 0;

        for(int i = 0; i<burger.length; i++) {
            if(lowBurger >= burger[i]) {
                lowBurger = burger[i];
            }
        }
        if(drink[0] <= drink[1]) lowDrink = drink[0];
        else lowDrink = drink[1];
        System.out.println(lowBurger + lowDrink - 50);
    }
}
