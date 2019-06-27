package com.dyp.androidpos.Model;

public class KategoriProdukModel  {
    private String id_kategori_produk,nama_kategori;

    public KategoriProdukModel() {
    }

    public KategoriProdukModel(String id_kategori_produk, String nama_kategori) {
        this.id_kategori_produk = id_kategori_produk;
        this.nama_kategori = nama_kategori;
    }

    public String getId_kategori_produk() {
        return id_kategori_produk;
    }

    public void setId_kategori_produk(String id_kategori_produk) {
        this.id_kategori_produk = id_kategori_produk;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
}
