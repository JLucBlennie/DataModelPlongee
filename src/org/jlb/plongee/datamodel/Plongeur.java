package org.jlb.plongee.datamodel;

import org.jlb.plongee.datamodel.types.NiveauType;
import org.jlb.plongee.datamodel.types.OrganisationType;

/**
 * Classe décrivant le plongeur qui tient un logbook.
 * 
 * @author JLuc
 *
 */
public class Plongeur extends APlongeur {

    /**
     * Constructeur complet.
     * 
     * @param nom
     *            le nom
     * @param prenom
     *            le prénom
     * @param club
     *            le club
     * @param niveau
     *            le niveau
     * @param organisation
     *            la fédération
     */
    public Plongeur(String nom, String prenom, String club, NiveauType niveau, OrganisationType organisation) {
        super(nom, prenom, club, niveau, organisation);
        // Les fils possibles
        mAuthorizedChildrenClass.add(LogBook.class);

        // Création du logbook.
        LogBook logbook = new LogBook();
        logbook.setParent(this);
        mChildren.add(logbook);
    }

    /**
     * Récupère le logbook.
     * 
     * @return le logbook
     */
    public LogBook getLogBook() {
        return (LogBook) getChildrenOfType(LogBook.class.getName()).get(0);
    }
}
