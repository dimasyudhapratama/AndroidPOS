package com.dyp.androidpos.Model;

public class CustomerModel {
    private String id_customer,nama_customer,no_hp;

    public CustomerModel() {

    }

    public CustomerModel(String id_customer, String nama_customer, String no_hp) {
        this.id_customer = id_customer;
        this.nama_customer = nama_customer;
        this.no_hp = no_hp;
    }

    public String getId_customer() {
        return id_customer;
    }

    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
}
