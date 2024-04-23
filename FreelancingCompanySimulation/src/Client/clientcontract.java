/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import java.time.LocalDate;

/**
 *
 * @author Sami Ahmed
 */
public class clientcontract {
    private LocalDate contractPosting;
    private String deliveryTime,ptojectCategory,pamentCurrency;

    public clientcontract(LocalDate contractPosting, String deliveryTime, String ptojectCategory, String pamentCurrency) {
        this.contractPosting = contractPosting;
        this.deliveryTime = deliveryTime;
        this.ptojectCategory = ptojectCategory;
        this.pamentCurrency = pamentCurrency;
    }

    public LocalDate getContractPosting() {
        return contractPosting;
    }

    public void setContractPosting(LocalDate contractPosting) {
        this.contractPosting = contractPosting;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getPtojectCategory() {
        return ptojectCategory;
    }

    public void setPtojectCategory(String ptojectCategory) {
        this.ptojectCategory = ptojectCategory;
    }

    public String getPamentCurrency() {
        return pamentCurrency;
    }

    public void setPamentCurrency(String pamentCurrency) {
        this.pamentCurrency = pamentCurrency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("clientcontract{");
        sb.append("contractPosting=").append(contractPosting);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", ptojectCategory=").append(ptojectCategory);
        sb.append(", pamentCurrency=").append(pamentCurrency);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
