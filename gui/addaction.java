package gui;

import javax.swing.*;

/**
 * java file for add actions
 */
public class addaction {
    /**
     * creates an input window for a new school year object
     * @return a String Array with the name of the school year, the year and the name of the school
     */
    protected static String[] schuljahraddaction() {
        JTextField name = new JTextField();
        JTextField schule = new JTextField();

        String[] schuljahr = {"2024/2025","2025/2026"};
        JComboBox<String> dropdown = new JComboBox<>(schuljahr);

        Object[] inhalt = {
          "Name des Schuljahres:", name,
          "Welches Jahr:", dropdown,
          "Welche Schule:", schule
        };

        int schuljahradd = JOptionPane.showConfirmDialog(
                null,
                inhalt,
                "Schuljahr Eingabe",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (schuljahradd == JOptionPane.OK_OPTION) {
            String namestr = name.getText();
            String jahrstr = (String) dropdown.getSelectedItem();
            String schulestr = schule.getText();


            return new String[] {namestr,jahrstr,schulestr};
        }
        return new String[] {"leer"};
    }
}
