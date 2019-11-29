import javax.swing.*;

public class Tutorial_3 {

    public static void main(String[] args) {
        boolean moistSkin = false;
        boolean feathers = false;
        boolean fins = false;
        int bloodTemperatureQ = JOptionPane.showConfirmDialog(null,"Is the animal warm blooded?");
        boolean warmBlood = (bloodTemperatureQ == JOptionPane.YES_OPTION);
        if (warmBlood == true) {
            int covering = JOptionPane.showConfirmDialog(null, "Does the animal have feathers?");
            feathers = (covering == JOptionPane.YES_OPTION);
        }
        else {
            int covering = JOptionPane.showConfirmDialog(null, "Does the animal have moist skin?");
            moistSkin = (covering == JOptionPane.YES_OPTION);
            int finQ = JOptionPane.showConfirmDialog(null, "Does the animal have fins?");
            fins = (finQ == JOptionPane.YES_OPTION);
        }

        if(warmBlood && feathers) {
            JOptionPane.showMessageDialog(null, "The animal class is Bird");
        }
        else if (warmBlood && !feathers) {
            JOptionPane.showMessageDialog(null, "The animal class is Mammal");
        }
        else if (!warmBlood && moistSkin) {
            JOptionPane.showMessageDialog(null, "The animal class is Amphibian");
        }
        else if (!warmBlood && !moistSkin && !fins) {
            JOptionPane.showMessageDialog(null, "The animal class is Reptile");
        }
        else {
            JOptionPane.showMessageDialog(null, "The animal class is Fish");
        }

    }
}
