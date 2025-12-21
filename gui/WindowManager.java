package gui;

import obj.Schuljahr;

import javax.swing.*;
import java.util.*;

public class WindowManager {
    public static void window() {
        List<Schuljahr> schuljahre = new ArrayList<>();

        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu add = new JMenu("Hinzufügen");
        JMenu file = new JMenu("Datei");
        JLabel label = new JLabel("");

        JMenuItem fileopen = new JMenuItem("Öffnen");
        JMenuItem filesave = new JMenuItem("Speichern");
        JMenuItem filesaveas = new JMenuItem("Speichern Als");
        JMenuItem fileclose = new JMenuItem("Schließen");

        JMenuItem schuljahradd = new JMenuItem("Schuljahr");
        JMenuItem fachadd = new JMenuItem("Fach");
        JMenuItem noteadd = new JMenuItem("Note");

        frame.setTitle("Schoolcifers");

        frame.setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(add);

        file.add(fileopen);
        file.add(filesave);
        file.add(filesaveas);
        file.add(fileclose);

        add.add(schuljahradd);
        add.add(fachadd);
        add.add(noteadd);

        frame.add(label);

        frame.setSize(800, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        schuljahradd.addActionListener(e -> {
            String [] erg = addaction.schuljahraddaction();
            if (erg[0] == "leer") {
                return;
            }
            Schuljahr schuljahr = new Schuljahr(erg[0],erg[1],erg[2]);
            schuljahre.add(schuljahr);

            label.setText(schuljahr.getnamefromschoolyear()+ " | "+schuljahr.getschuljahr()+ " | "+ schuljahr.getschule());

            //System.out.println(schuljahr.getnamefromschoolyear());
            //System.out.println(schuljahr.getschuljahr());
            //System.out.println(schuljahr.getschule());
        });
    }
}
