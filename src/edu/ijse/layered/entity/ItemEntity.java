/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.ijse.layered.entity;

/**
 *
 * @author Anjana
 */
public class ItemEntity {
    
    private String code;
    private String desc;
    private String pack;
    private Double unitPrice;
    private Integer qoh;

    public ItemEntity() {
    }

    public ItemEntity(String code, String desc, String pack, Double unitPrice, Integer qoh) {
        this.code = code;
        this.desc = desc;
        this.pack = pack;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemEntity{" + "code=" + code + ", desc=" + desc + ", pack=" + pack + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
    
}