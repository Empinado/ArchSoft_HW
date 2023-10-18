# Bridge

---

    Паттерн Bridge (Мост) — структурный шаблон проектирования. 
То есть, его основная задача — создание полноценной структуры из классов и объектов. Bridge решает эту задачу путем разделения одного или нескольких классов на отдельные иерархии — абстракцию и реализацию. Изменение функционала в одной иерархии не влечет за собой изменения в другой.
___
# Пример
___
[Источник](https://javarush.com/groups/posts/2570-znakomstvo-s-patternom-proektirovanija-bridge)

У нас есть абстрактный класс Shape, который обобщенно описывает геометрическую фигуру:
    
Shape.java
   
     public abstract class Shape {
        public abstract void draw();
    }   

Когда мы решим добавить фигуры треугольника и прямоугольника, мы унаследуемся от класса Shape:

Rectangle.java:

    public class Rectangle extends Shape {
        @Override
        public void draw() {
        System.out.println("Drawing rectangle");
        }
    }
    
Triangle.java:

    public class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing triangle");
        }
    }

Выглядит все просто до того момента, пока мы не вводим понятие “цвета”. То есть, у каждой фигуры будет свой цвет, от которого будет зависеть функционал метода draw(). Чтобы иметь различные реализации метода draw(), нам необходимо создать класс для каждой фигуры, соответствующий цвету. Если три цвета, то шесть классов: TriangleBlack, TriangleGreen, TriangleRed, RectangleBlack, RectangleGreen и RectangleRed.

Шесть классов — не такая уж и большая проблема. Но! Если нам нужно будет добавить новую фигуру или цвет, количество классов будет расти в геометрической прогрессии.

Как выйти из сложившейся ситуации? Хранение цвета в поле и перебор вариантов через условные конструкции — не лучший выход. Хорошее решение — вывести цвет в отдельный интерфейс.

Сказано — сделано: давай создадим интерфейс Color и три его имплементации — BlackColor, GreenColor и RedColor:

Color.java:

    public interface Color {
        void fillColor();
    }
    
BlackColor.java:

    public class BlackColor implements Color {
        @Override
        public void fillColor() {
            System.out.println("Filling in black color");
        }
    }
GreenColor.java

    public class GreenColor implements Color {
        @Override
        public void fillColor() {
            System.out.println("Filling in green color");
        }
    }
RedColor.java

    public class RedColor implements Color {
        @Override
        public void fillColor() {
            System.out.println("Filling in red color");
        }
    }
Теперь добавим поле типа Color в класс Shape — его значение будем получать в конструкторе.

Shape.java:

    public abstract class Shape {
    protected Color color;
    
    public Shape(Color color) {
        this.color = color;
    }
    
    public abstract void draw();
    }
Переменную color мы будем использовать в реализациях Shape. А это значит, что фигуры теперь могут использовать функционал интерфейса Color.

Rectangle.java

    public class Rectangle extends Shape {
    
        public Rectangle(Color color) {
            super(color);
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing rectangle");
            color.fillColor();
        }
    }
Ну вот! Теперь мы можем плодить различные цвета и геометрические фигуры хоть до бесконечности, увеличивая количество классов в арифметической прогрессии. Поле Color color и является мостом (bridge), который взаимосвязывает две отдельные иерархии классов.