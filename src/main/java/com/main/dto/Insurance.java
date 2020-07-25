package com.main.dto;

import java.math.BigDecimal;

public class Insurance {
    private String insuranceCompany;
    private BigDecimal price;

    public Insurance() {
    }

    public Insurance(String insuranceCompany, BigDecimal price) {
        this.insuranceCompany = insuranceCompany;
        this.price = price;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
