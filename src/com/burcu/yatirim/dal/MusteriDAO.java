/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.dal;

import com.burcu.yatirim.models.Musteri;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burcu
 */
public class MusteriDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    private final String url = "jdbc:postgresql://localhost:5432/yatirim";
    private final String username = "postgres";
    private final String password = "burcu";

    // Veritabanı için oturum açma
    public void openSession() {
        try {
            Driver.class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    // Veritabanı için oturum kapatma
    public void closeSession() {
        try {
            conn.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
    }
    // Müşteri objesini veritabanına kayıt ediyoruz.
    public void Save(Musteri mst) {
        openSession();
        try {
            String query = "INSERT INTO musteri(ad, soyad, telefon, adres) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            String ad = mst.getAd();
            String soyad = mst.getSoyad();
            String telefon = mst.getTelefon();
            String adres = mst.getAdres();
            
            ps.setString(1, ad);
            ps.setString(2, soyad);
            ps.setString(3, telefon);
            ps.setString(4, adres);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }
    
    public int getLastId() {
        openSession();
        int getLastId = 0;
        String query = "SELECT MAX(ID) FROM MUSTERI";
        try {
            ps = conn.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                getLastId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getLastId;
    }

    public void UpdatePuanYas(Musteri mst) {
        openSession();
        try {
            String query = "UPDATE musteri SET puanyas='" + mst.getPuanyas() + "' WHERE id= '" + getLastId() + "'";
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }

    public void UpdatePuanEgitim(Musteri mst) {
        openSession();
        try {
            String query = "UPDATE musteri SET puanegitim='" + mst.getPuanegitim() + "' WHERE id= '" + getLastId() + "'";
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }

    public void UpdatePuanMeslek(Musteri mst) {
        openSession();
        try {
            String query = "UPDATE musteri SET meslek='" + mst.getMeslek() + "' WHERE id= '" + getLastId() + "'";
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }

    public void UpdatePuanYatirim(Musteri mst) {
        openSession();
        try {
            String query = "UPDATE musteri SET puanyatirim='" + mst.getPuanyatirim() + "' WHERE id= '" + getLastId() + "'";
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }

    public void UpdatePuanGetiri(Musteri mst) {
        openSession();
        try {
            String query = "UPDATE musteri SET puangetiri='" + mst.getPuangetiri() + "' WHERE id= '" + getLastId() + "'";
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        closeSession();
    }

    public int getToplam() {
        openSession();
        int getToplam = 0;
        String query = "SELECT "
                + "COALESCE(puanyas,0) "
                + "+ COALESCE(puanegitim,0) "
                + "+ COALESCE(puanyatirim,0) "
                + "+ COALESCE(puangetiri,0)"
                + "FROM musteri where id = '" + getLastId() + "'";
        try {
            ps = conn.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                getToplam = (int) rs.getLong(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MusteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getToplam;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getUrl() {
        return url;
    }

}
