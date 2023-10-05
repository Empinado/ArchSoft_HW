package Builder;

public class Pizza {
//Пытаемся воспроизвести паттерн Builder. Создаем поля. В данном случае, ингридиенты пиццы.
    String topping1;
    String topping2;
    String ingredient1;
    String ingredient2;

//Создаем внутрений класс Builder
public static class Builder{
//Инстанс — экземпляр класса в объектно-ориентированном программировании.
    private final Pizza pizza;
//Конструктор
    Builder() {
        pizza = new Pizza();
    }
//Методы, которые будут заполнять наши параметры. Публичные методы, которые будут возвращаться объект Bulder и содержать наш параметр.
    public Builder topping1(String topping1){
        pizza.topping1 = topping1;
        return this;
    }
    public Builder topping2(String topping2){
        pizza.topping2 = topping2;
        return this;
    }
    public Builder ingredient1(String ingredient1){
        pizza.ingredient1 = ingredient1;
        return this;
    }
    public Builder ingredient2(String ingredient2){
        pizza.ingredient2 = ingredient2;
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}


}
