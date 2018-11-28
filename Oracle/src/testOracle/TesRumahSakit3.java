/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOracle;

import model_RS.Dokter;
import model_RS.RumahSakit;

/**
 *
 * @author admin
 */
public class TesRumahSakit3 {
    public static void main(String[] args) {
        Dokter dr1 = new Dokter("004","asda");
        RumahSakit rs = new RumahSakit("Panti Rapih", "Yogyakarta");
        
        System.out.println(rs.isDokterExist(dr1));
    }
}
