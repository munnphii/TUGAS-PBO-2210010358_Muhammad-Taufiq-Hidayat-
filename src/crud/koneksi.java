/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author munn
 */
public class koneksi {
    private String database_name = "2210010358";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    
    public koneksi(){
        try {
            String lokasi = "jdbc:mysql://localhost/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {            
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan_User(String username, String password, String level){
        try {
            String sql = "INSERT INTO user (username, password, level) VALUE (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, username);
            perintah.setString(2, password);
            perintah.setString(3, level);
            
            perintah.execute();
            System.out.println("Database Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah_User(String username, String password, String level){
        try {
            String sql = "UPDATE user SET password=?, level=? where username=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, password);
            perintah.setString(2, level);
            perintah.setString(3, username);
            
            perintah.execute();
            System.out.println("Database DiUbah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus_User(String username){
        try {
            String sql = "DELETE FROM user WHERE username =? ";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, username);
            
            perintah.execute();
            System.out.println("Database DiHapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public void Simpan_Konsultasi(int id_konsultasi, String nama_narasumber, String email, String telp, String pertanyaan, String jawaban, String tgl){
        try {
            String sql = "INSERT INTO konsultasi (id_konsultasi, nama_narasumber, email, telp, pertanyaan, jawaban, tgl) VALUE (?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, id_konsultasi);
            perintah.setString(2, nama_narasumber);
            perintah.setString(3, email);
            perintah.setString(4, telp);
            perintah.setString(5, pertanyaan);
            perintah.setString(6, jawaban);
            perintah.setString(7, tgl);
            
            perintah.execute();
            System.out.println("Database Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah_Konsultasi(int id_konsultasi, String nama_narasumber, String email, String telp, String pertanyaan, String jawaban, String tgl){
        try {
            String sql = "UPDATE konsultasi SET nama_narasumber=?, email=?, telp=?, pertanyaan=?, jawaban=?, tgl=? where id_konsultasi=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, nama_narasumber);
            perintah.setString(2, email);
            perintah.setString(3, telp);
            perintah.setString(4, pertanyaan);
            perintah.setString(5, jawaban);
            perintah.setString(6, tgl);
            perintah.setInt(7, id_konsultasi);
            
            perintah.execute();
            System.out.println("Database DiUbah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus_Konsultasi(int id_konsultasi){
        try {
            String sql = "DELETE FROM konsultasi WHERE id_konsultasi =? ";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, id_konsultasi);
            
            perintah.execute();
            System.out.println("Database DiHapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public void Simpan_Majelis_Taklim(String id_majelis, String nama_mj, String alamat, String kelurahan, String tmp_kegiatan,String materi_pengajaran, int frek_keg, String pimpinan, String jum_pengurus, String jum_jamaah){
        try {
            String sql = "INSERT INTO majelis_taklim (id_majelis, nama_mj, alamat, kelurahan, tmp_kegiatan, materi_pengajaran, frek_keg, pimpinan, jum_pengurus,jum_jamaah) VALUE (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_majelis);
            perintah.setString(2, nama_mj);
            perintah.setString(3, alamat);
            perintah.setString(4, kelurahan);
            perintah.setString(5, tmp_kegiatan);
            perintah.setString(6, materi_pengajaran);
            perintah.setInt(7, frek_keg);
            perintah.setString(8, pimpinan);
            perintah.setString(9, jum_pengurus);
            perintah.setString(10, jum_jamaah);
            
            perintah.execute();
            System.out.println("Database Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah_Majelis_Taklim(String id_majelis, String nama_mj, String alamat, String kelurahan, String tmp_kegiatan,String materi_pengajaran, int frek_keg, String pimpinan, String jum_pengurus, String jum_jamaah){
        try {
            String sql = "UPDATE majelis_taklim SET nama_mj=?, alamat=?, kelurahan=?, tmp_kegiatan=?, materi_pengajaran=?, frek_keg=?, pimpinan=?, jum_pengurus=?,jum_jamaah=? where id_majelis=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, nama_mj);
            perintah.setString(2, alamat);
            perintah.setString(3, kelurahan);
            perintah.setString(4, tmp_kegiatan);
            perintah.setString(5, materi_pengajaran);
            perintah.setInt(6, frek_keg);
            perintah.setString(7, pimpinan);
            perintah.setString(8, jum_pengurus);
            perintah.setString(9, jum_jamaah);
            perintah.setString(10, id_majelis);
            
            perintah.execute();
            System.out.println("Database DiUbah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus_Majelis_Taklim(String id_majelis){
        try {
            String sql = "DELETE FROM majelis_taklim WHERE id_majelis =? ";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_majelis);
            
            perintah.execute();
            System.out.println("Database DiHapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public void Simpan_Materi(int id_materi, String id_majelis, String title, int id_jadwal, String deskripsi){
        try {
            String sql = "INSERT INTO materi ( id_materi, id_majelis, title, id_jadwal, deskripsi) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, id_materi);
            perintah.setString(2, id_majelis);
            perintah.setString(3, title);
            perintah.setInt(4, id_jadwal);
            perintah.setString(5, deskripsi);
            
            perintah.execute();
            System.out.println("Database Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah_Materi(int id_materi, String id_majelis, String title, int id_jadwal, String deskripsi){
        try {
            String sql = "UPDATE materi SET id_majelis=?, title=?, id_jadwal=?, deskripsi=? where id_materi=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id_majelis);
            perintah.setString(2, title);
            perintah.setInt(3, id_jadwal);
            perintah.setString(4, deskripsi);
            perintah.setInt(5, id_materi);
            
            perintah.execute();
            System.out.println("Database DiUbah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus_Materi(int id_materi){
        try {
            String sql = "DELETE FROM materi WHERE id_materi =? ";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, id_materi);
            
            perintah.execute();
            System.out.println("Database DiHapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}
