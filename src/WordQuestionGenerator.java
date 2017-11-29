
import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class WordQuestionGenerator {

    public static List<WordModel> createQuestionInCollection() throws FileNotFoundException {
        Scanner scan;
        List<WordModel> model = new ArrayList<>();
        scan = new Scanner(new File("C:/Java/dataSoalBajakLaut.txt"));
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
        return model;
    }
}
