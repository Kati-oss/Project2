//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        //int bonus = replenishment > 1000 ? replenishment / 100 : 0;

        int finalBalanse = startingScore + replenishment + bonus;
        System.out.println("Итоговый счет: " + finalBalanse);
        System.out.println("Бонус: " + bonus);
    }


}
