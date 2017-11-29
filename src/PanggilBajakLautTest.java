
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PanggilBajakLautTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan;
        try {
            scan = new Scanner(new File("C:/Java/dataSoalBajakLaut.txt"));
            List<WordModel> model = new ArrayList<>();

            while (scan.hasNextLine()) {
                String namaDanHint = scan.nextLine();
                String[] data = namaDanHint.split(",");
                String namaKru = data[0];
                String hint = data[1];

                WordModel p = new WordModel();
                p.setBasicWord(namaKru);
                p.setHint(hint);
                model.add(p);

            }
            System.out.println("Banyak data pada ArraList " + model.size());
            for (WordModel wordModel : model) {
                System.out.println(wordModel);

            }
            
           
        }
        
        catch (FileNotFoundException ex) {

        }
    }
    
}
