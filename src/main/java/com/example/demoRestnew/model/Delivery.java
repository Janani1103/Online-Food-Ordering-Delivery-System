package com.example.demoRestnew.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeliveryID")
    private int deliveryId;

    private String status;
    private Date deliveryDate;

    @OneToOne
    @JoinColumn(name = "OrderID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "DeliveryStaffID")
    private User deliveryStaff;

    public int getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public User getDeliveryStaff() {
        return deliveryStaff;
    }
    public void setDeliveryStaff(User deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }
}
