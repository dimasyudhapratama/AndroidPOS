package com.dyp.androidpos.Model;

public class ProdukModel  {
    private String id_produk,nama_produk,harga_jual,tipe_stok,stok;

    public ProdukModel() {
    }

    public ProdukModel(String id_produk, String nama_produk, String harga_jual, String tipe_stok, String stok) {
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.harga_jual = harga_jual;
        this.tipe_stok = tipe_stok;
        this.stok = stok;
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

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getTipe_stok() {
        return tipe_stok;
    }

    public void setTipe_stok(String tipe_stok) {
        this.tipe_stok = tipe_stok;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}
