//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int startingScore = 200; // начальный счет
        int replenishment = 1000; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 200;
        } else {
            bonus = 0;
            System.out.println(replenishment / 200);
        }
    }

}
