package gui;

import obj.Schuljahr;

import javax.swing.*;
import java.util.*;

public class WindowManager {
    public static void window() {
        List<Schuljahr> schuljahre = new ArrayList<>();

        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);

        JMenu add = new JMenu("Hinzufügen");
        JMenu file = new JMenu("Datei");

        JMenuItem fileopen = new JMenuItem("Öffnen");
        JMenuItem filesave = new JMenuItem("Speichern");
        JMenuItem filesaveas = new JMenuItem("Speichern Als");
        JMenuItem fileclose = new JMenuItem("Schließen");

        JMenuItem schuljahradd = new JMenuItem("Schuljahr");
        JMenuItem fachadd = new JMenuItem("Fach");
        JMenuItem noteadd = new JMenuItem("Note");

        frame.setTitle("Schoolcijfers");

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

        frame.add(scrollPane);

        frame.setSize(800, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        filesaveas.addActionListener(e -> {
            fileaction.saveas(frame, schuljahre);
        });

        schuljahradd.addActionListener(e -> {
            Schuljahr schuljahr = interaction.schuljahr(schuljahre);
            JLabel label = new JLabel(schuljahr.getnamefromschoolyear()+ " | "+schuljahr.getschuljahr()+ " | "+ schuljahr.getschule());
            panel.add(label);

            panel.revalidate();
            panel.repaint();
        });
    }
}
