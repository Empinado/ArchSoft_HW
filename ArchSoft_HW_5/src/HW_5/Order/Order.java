package HW_5.Order;

import HW_5.Model.IndividualOrder;
import HW_5.View.ConsoleInput;
import HW_5.View.SaveToFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public abstract class Order implements SaveToFile, ConsoleInput {


    protected String clientName;
    protected String product;
    protected int qnt;
    protected double price;

    static int counter = 0;

    public static int id = 0;
//Счетчик для определения номера заказа
    {
        id = ++counter;
    }

//Конструктор
    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;

    }


//геттер id
    public int getId() {
        return id;
    }

    /**
     * Сохранение Json
     * <p>
     * Метод позволяет сохранять заказ в формате Json.
     * </p>
     *@pre User должен оформить заказ введя параметры: clientName, product, qnt, price.
     *@post создание файла с данными заказа.
     *@throw Пустое поле. Ошибка типа введенных данных.
     */
    @Override
    public void saveToJson() {

        String fileName = " Oreder #" + getId() + ".json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /**
     * Сохранение txt
     * <p>
     * Метод позволяет сохранять заказ в формате txt.
     * </p>
     * @pre User должен оформить заказ введя параметры: clientName, product, qnt, price.
     * @post создание файла с данными заказа.
     * @throw Пустое поле. Ошибка типа введенных данных.
     */
    @Override
    public void saveToTxt() {

        String fileName = " Oreder #" + getId() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /**
     * Сохранение Json и txt.
     * <p>
     * Метод позволяет сохранять заказ в формате Json и txt одновременно.
     * </p>
     * @pre User должен оформить заказ введя параметры: clientName, product, qnt, price.
     *@post создание файла с данными заказа.
     *@throw Пустое поле. Ошибка типа введенных данных.
     */
    @Override
    public void saveToAllFormat() {

        String fileName = " Oreder #" + getId() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String fileName1 = fileName;
        fileName1 = " Oreder #" + getId() + ".json";
        try (FileWriter writer = new FileWriter(fileName1, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.clientName + "\",\n");
            writer.write("\"product\":\""+ this.product+"\",\n");
            writer.write("\"qnt\":"+ this.qnt +",\n");
            writer.write("\"price\":"+ this.price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    Scanner scanner = new Scanner(System.in, "Cp866");

    /**Вывод в консоль
     * <p>
     * Данный метод позволяет вывести в консоль заказ user. Имеет в себе два варианта вывода, один для физ и юр лиц.
     * </p>
     * @pre заказ User должен быть сформирован, после чего на экземпляре класса можно вызвать данный метод.
     * @post Вывод заказа в терминале.
     * @throw Заказ не существует.
     */
    @Override
    public void inputFromConsole(){

        double discount = 0.1;

        if(this instanceof IndividualOrder){
            this.clientName = prompt("Имя клиента: ");
            this.product = prompt("Продукт: ");
            this.qnt = Integer.parseInt(prompt("Кол-во: "));
            this.price = Integer.parseInt(prompt("Цена: "));

        }
        else{
            this.clientName = prompt("Название организации: ");
            this.product = prompt("Продукт: ");
            this.qnt = Integer.parseInt(prompt("Кол-во: "));
            this.price = Integer.parseInt(prompt("Цена: "));
            this.price = this.price - (this.price * discount);
            System.out.println("Ваша скидка составила: " + (this.price * discount));

        }
    }

    /**
     * Захват ввода User
     * <p>
     *  Данный метод позволяет захватывать и выводить в консоль данные о заказе User.
     * <p>
     * @param message сообщение/ввод.
     * @return Ввод User с клавиатуры.
     */
    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }





}