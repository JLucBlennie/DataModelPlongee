/**
 * 
 */
package org.jlb.plongee.datamodel.types;

/**
 * @author JLuc
 *
 */
public enum OrganisationType {

    FFESSM("FFESSM"), CMAS("CMAS"), PADI("PADI");
    private String mNom;

    OrganisationType(String nom) {
        mNom = nom;
    }

    public String nom() {
        return mNom;
    }
}
