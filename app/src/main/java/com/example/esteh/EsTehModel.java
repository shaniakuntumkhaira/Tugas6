package com.example.esteh;

public class EsTehModel {

    private String namaEsTeh;
    private String deskripsiEsTeh;
    private int hargaEsTeh;
    private int gambarEsTeh;
    private String size;

    public EsTehModel(int gambarEsTeh, String namaEsTeh, String deskripsiEsTeh, int hargaEsTeh) {
        this.namaEsTeh = namaEsTeh;
        this.deskripsiEsTeh = deskripsiEsTeh;
        this.hargaEsTeh = hargaEsTeh;
        this.gambarEsTeh = gambarEsTeh;
    }

    public String getNamaEsTeh() {
        return namaEsTeh;
    }

    public void setNamaEsTeh(String namaEsTeh) {
        this.namaEsTeh = namaEsTeh;
    }

    public String getDeskripsiEsTeh() {
        return deskripsiEsTeh;
    }

    public void setDeskripsiEsTeh(String deskripsiEsTeh) {
        this.deskripsiEsTeh = deskripsiEsTeh;
    }

    public int getHargaEsTeh() {
        return hargaEsTeh;
    }

    public void setHargaEsTeh(int hargaEsTeh) {
        this.hargaEsTeh = hargaEsTeh;
    }

    public int getGambarEsTeh() {
        return gambarEsTeh;
    }

    public void setGambarEsTeh(int gambarEsTeh) {
        this.gambarEsTeh = gambarEsTeh;
    }
}

