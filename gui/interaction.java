package gui;

import obj.Schuljahr;

import javax.swing.*;
import java.util.List;

public class interaction {
    /** put the Schuljahr Obj from addaction.schuljahraddaction() in a array list
     * @param schuljahre
     * @return a schuljahr obj
     */
    protected static Schuljahr schuljahr(List<Schuljahr> schuljahre) {
        String [] erg = addaction.schuljahraddaction();
        if (erg[0].equals("leer")) {
            return null;
        }
        Schuljahr schuljahr = new Schuljahr(erg[0],erg[1],erg[2]);
        schuljahre.add(schuljahr);
        return schuljahr;
    }
}
