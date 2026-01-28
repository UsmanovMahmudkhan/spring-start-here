package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Payment.PaymentService.src.main.java.payment_service.payment_service;

import java.sql.Time;

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
