/**
 * 
 */
package org.jlb.plongee.datamodel;

import org.jlb.plongee.datamodel.types.NiveauType;
import org.jlb.plongee.datamodel.types.OrganisationType;
import org.jlb.tools.metamodel.Entity;
import org.jlb.tools.metamodel.attributes.impl.IntegerAttribute;
import org.jlb.tools.metamodel.attributes.impl.StringAttribute;

/**
 * Classe abstraite décrivant un plongeur.
 * 
 * @author JLuc
 *
 */
public abstract class APlongeur extends Entity {

    public static final String NOM_ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.aplongeur.attribut.name");
    public static final String PRENOM_ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.aplongeur.attribut.firstname");
    public static final String CLUB_ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.aplongeur.attribut.club");
    public static final String NIVEAU_ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.aplongeur.attribut.niveau");
    public static final String ORGANISATION_ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.aplongeur.attribut.organisation");

    /**
     * 
     */
    public APlongeur(String nom, String prenom, String club, NiveauType niveau, OrganisationType organisation) {
        // Les type de fils autorisés

        // Les attributs
        StringAttribute nomAttr = new StringAttribute(NOM_ATTRIBUTE_NAME, nom);
        StringAttribute prenomAttr = new StringAttribute(PRENOM_ATTRIBUTE_NAME, prenom);
        StringAttribute clubAttr = new StringAttribute(CLUB_ATTRIBUTE_NAME, club);
        IntegerAttribute niveauAttr = new IntegerAttribute(NIVEAU_ATTRIBUTE_NAME, niveau.ordinal());
        IntegerAttribute orgaAttr = new IntegerAttribute(ORGANISATION_ATTRIBUTE_NAME, organisation.ordinal());
        mAttributes.add(nomAttr);
        mAttributes.add(prenomAttr);
        mAttributes.add(clubAttr);
        mAttributes.add(niveauAttr);
        mAttributes.add(orgaAttr);
    }

}
