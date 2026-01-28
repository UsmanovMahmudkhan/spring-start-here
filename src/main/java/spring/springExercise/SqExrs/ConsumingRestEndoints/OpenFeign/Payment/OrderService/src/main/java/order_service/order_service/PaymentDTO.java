package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.OrderService.src.main.java.order_service.order_service;

public class PaymentDTO {
    float money;
    String productName;

    public PaymentDTO(float money, String productName) {
        this.money = money;
        this.productName = productName;
    }

    public PaymentDTO() {
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
