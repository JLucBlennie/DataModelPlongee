/**
 * 
 */
package org.jlb.plongee.datamodel.types;

/**
 * @author JLuc
 *
 */
public enum NiveauType {

    NIVEAU_1("Niveau 1"), NIVEAU_2("Niveau 2"), NIVEAU_3("Niveau 3"), NIVEAU_4("Niveau 4"), NIVEAU_5("Directeur de Plongee"), E1("Niveau 2/3 Initiateur"), E2("Niveau 4 Initiateur"), E3("MF1"), E4(
            "MF2");

    private String mNom;

    NiveauType(String nom) {
        mNom = nom;
    }

    public String nom() {
        return mNom;
    }
}
