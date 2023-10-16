package HW_5.Model;

import HW_5.Order.Order;

public class EntityOrder extends Order {

    double discount = 0.1;

    public EntityOrder(String clientName, String product, int qnt, double price) {
        super(clientName, product, qnt, price);

    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


}