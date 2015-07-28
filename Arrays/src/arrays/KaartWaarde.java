/* 
 * KaartWaarde.java
 * werken met een 1-dim tabel
 */

package arrays;

import javax.swing.*;

public class KaartWaarde{
    public static void main(String[] args){
        int[] waarde;
        waarde = new int[13];
        String[] afbeelding = {"Aas",
                               "Twee","Drie","Vier","Vijf","Zes",
                               "Zeven","Acht","Negen","Tien",
                               "Boer","Dame","Heer"};
        //vullen van array "waarde":                       
        for(int i=0; i<afbeelding.length;i++){
            switch (i){
                case 0 : waarde[i] = 11; break;
                case 10: waarde[i] = 1 ; break;
                case 11: waarde[i] = 2 ; break;
                case 12: waarde[i] = 3 ; break;
                default: waarde[i] = i+1;
            }
        }
        //output:                       
        JOptionPane.showMessageDialog(null,"de "+ afbeelding[7] +" staat voor "
                                           + waarde[7] +" punten.");
        JOptionPane.showMessageDialog(null,"de "+ afbeelding[11] +" staat voor "
                                           + waarde[11] +" punten.");
        
        String output = "dit zijn alle afbeeldingen:\n";
        // nieuw sinds java 5.0: "for-each" lus
        // beperkingen foreach:
        
        //
        
        // alle elementen overlopen van voren naar achteren (forward only);
        // elementen die in foreach gebruikt worden,
        // zijn kopies van de originele elementen uit de tabel
        // => wijzigen van een element in de foreach wijzigt de kopie,
        // niet het origineel element uit de tabel (read only)
        for(String prentje: afbeelding){
            output += prentje + " ";
            prentje += ",";
        }
        
        output += "\nvoor tweede foreach:\n";
        for(String prentje: afbeelding){
            output += prentje + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}