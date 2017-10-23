/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periksakesehatan;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Naya
 */
public class FormController implements Initializable {

    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tinggi;
    @FXML
    private JFXTextField bb;
    @FXML
    private RadioButton L;
    @FXML
    private RadioButton P;
    @FXML
    private Button prosess;
    @FXML
    private Button resett;
    @FXML
    private TextField bideal;
    @FXML
    private TextField hasil;
    @FXML
    private TextField saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        int BB,Bideal,Tinggi;
        String Nama,Jeniskelamin,Hasil,Saran;
        
        Nama = nama.getText();
        Hasil = hasil.getText();
        Saran = saran.getText();
        BB =Integer.parseInt(bb.getText());
        Tinggi =Integer.parseInt(tinggi.getText());    
        
        if (L.isSelected()){
           Bideal = Tinggi-105;
           bideal.setText(""+Bideal);
            if(BB<Bideal){
                hasil.setText("Nama : "+Nama+", Anda Underweight");
                saran.setText("Konsumsi Kandungan Gizi untuk Meningkatkan Berat Badan Anda ");
            }
            else if(BB==Bideal){
                hasil.setText("Nama : "+Nama+", Anda Ideal");
                saran.setText("Jaga Pola Makan Anda dan Pertahankan Ideal Berat Badan Anda");
            }
            else{
                hasil.setText("Nama : "+ Nama+ ", Anda Overweight");
                saran.setText("Kurangi Porsi Makan untuk Menurunkan Berat Badan Anda");
            }
            
        }
        else if (P.isSelected()){
           Bideal=Tinggi-110;
           bideal.setText(""+Bideal);
           if(BB<Bideal){
                hasil.setText("Nama : "+Nama+", Anda Underweight");
                saran.setText("Konsumsi Kandungan Gizi untuk Meningkatkan Berat Badan Anda ");
            }
            else if(BB==Bideal){
                hasil.setText("Nama : "+Nama+", Anda Ideal");
                saran.setText("Jaga Pola Makan Anda dan Pertahankan Ideal Berat Badan Anda");
            }
            else{
                hasil.setText("Nama : "+ Nama+ ", Anda Overweight");
                saran.setText("Kurangi Porsi Makan untuk Menurunkan Berat Badan Anda");
            }
        }
        else{
            hasil.setText("Mohon Pilih Jenis Kelamin Anda");
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        bb.setText("");
        bideal.setText("");
        hasil.setText("");
        saran.setText("");
        L.setSelected(false);
        P.setSelected(false);
    }
    
}
