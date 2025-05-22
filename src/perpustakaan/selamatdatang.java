/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import javax.swing.JOptionPane;
/**
 *
 * @author ipit
 */
public class selamatdatang {

public static void main(String[]args) {
    JOptionPane.showMessageDialog (null, "Selamat Datang Di Perpustakaan SMK Bina Informatika");
    new login().setVisible(true);
}    
}
