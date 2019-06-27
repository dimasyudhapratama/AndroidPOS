package com.dyp.androidpos.Model;

public class ShopCartModel {
    private String id_produk,nama_produk;
    private int harga,qty,subtotal;
    int takeaway_type;

    public ShopCartModel() {
    }

    public ShopCartModel(String id_produk,String nama_produk, int harga, int qty, int subtotal,int takeaway_type) {
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
        this.subtotal = subtotal;
        this.takeaway_type = takeaway_type;
    }

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    public int getTakeaway_type() {
        return takeaway_type;
    }

    public void setTakeaway_type(int takeaway_type) {
        this.takeaway_type = takeaway_type;
    }
}
