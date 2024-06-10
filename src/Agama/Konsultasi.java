/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agama;

/**
 *
 * @author munn
 */
public class Konsultasi {
    private String idKonsultasi;
    private String namaNarasumber;
    private String email;
    private String telp;
    private String pertanyaan;
    private String jawaban;
    private String tgl;

    public Konsultasi(String idKonsultasi, String namaNarasumber, String email, String telp, String pertanyaan, String jawaban, String tgl) {
        this.idKonsultasi = idKonsultasi;
        this.namaNarasumber = namaNarasumber;
        this.email = email;
        this.telp = telp;
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.tgl = tgl;
    }

    // Getter dan Setter
    public String getIdKonsultasi() {
        return idKonsultasi;
    }

    public void setIdKonsultasi(String idKonsultasi) {
        this.idKonsultasi = idKonsultasi;
    }

    public String getNamaNarasumber() {
        return namaNarasumber;
    }

    public void setNamaNarasumber(String namaNarasumber) {
        this.namaNarasumber = namaNarasumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    @Override
    public String toString() {
        return "Konsultasi{" +
                "idKonsultasi='" + idKonsultasi + '\'' +
                ", namaNarasumber='" + namaNarasumber + '\'' +
                ", email='" + email + '\'' +
                ", telp='" + telp + '\'' +
                ", pertanyaan='" + pertanyaan + '\'' +
                ", jawaban='" + jawaban + '\'' +
                ", tgl='" + tgl + '\'' +
                '}';
    }
}
