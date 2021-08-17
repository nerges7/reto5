/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionxv_g44.efren;
import controller_pkg.Conection;
import views_pkg.*;

/**
 *
 * @author SUPERFERRETERIA
 */
public class SesionXv_G44Efren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conection inst_conn = new Conection ();
        Departmens inst_frame = new Departmens ();
        inst_conn.getConnection();
        inst_frame.setVisible(true);
    }   
}
