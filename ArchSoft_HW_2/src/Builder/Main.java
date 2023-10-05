package Builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .topping1("Сыр")
                .topping2("Сыр2")
                .ingredient2("ЕЩЕ СЫР!")
                .build();

        Pizza pizza1 = new Pizza.Builder()
                .topping1("Ананас")
                .ingredient1("Ананас2!")
                .build();

        System.out.println(pizza.topping1);
        System.out.println(pizza.topping2);
        System.out.println(pizza.ingredient2);
        System.out.println();
        System.out.println(pizza1.topping1);
        System.out.println(pizza1.ingredient1);
        //Теперь мы можем создавать любые конструкции, без использования Builder нам бы пришлось создавать для каждой возможной вариации
        //нашей пиццы отдельный конструктор.
    }
}
