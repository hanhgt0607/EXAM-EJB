package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SlNo;
    private int SalesmanID;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ProID")
    private Product product;
    private String SalesmanName;
    private long DOS;

    public long getSlNo() {
        return SlNo;
    }

    public void setSlNo(long slNo) {
        SlNo = slNo;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public long getDOS() {
        return DOS;
    }

    public void setDOS(long DOS) {
        this.DOS = DOS;
    }
}
