package org.jlb.plongee.database;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jlb.plongee.datamodel.exercices.E_TYPE_EXERCICE;
import org.jlb.plongee.datamodel.exercices.E_TYPE_PLONGEE_EXERCICE;
import org.jlb.plongee.datamodel.exercices.Exercice;
import org.jlb.plongee.datamodel.logbook.E_NIVEAU;
import org.jlb.plongee.datamodel.logbook.E_TYPE_ENVIRONNEMENT;
import org.jlb.plongee.datamodel.logbook.E_TYPE_LIEU;
import org.jlb.plongee.datamodel.logbook.E_TYPE_THEME;
import org.jlb.plongee.datamodel.logbook.LogBook;
import org.jlb.plongee.datamodel.logbook.Participant;
import org.jlb.plongee.datamodel.logbook.Plongee;
import org.jlb.plongee.datamodel.logbook.Site;
import org.jlb.plongee.datamodel.plongees.PlongeeExercice;
import org.jlb.plongee.datamodel.tools.Localisation;
import org.jlb.tools.database.impl.DatabaseServiceSQLite;
import org.jlb.tools.logging.LogTracer;
import org.jlb.tools.metamodel.DataProcessorServices;
import org.jlb.tools.metamodel.Entity;

/**
 * Classe decrivant le modele de donnees du logiciel MN90 sur une base de
 * donnees SQLite.
 * 
 * @author JLuc
 *
 */
public class MN90DataProcessorServices extends DataProcessorServices {

    /** Identifant de la colonne Id. */
    private static final String ID = "Id";

    static {
        addClass(Plongeur.class);
        addClass(Participant.class);
        addClass(Site.class);
    }

    /**
     * Ctor.
     * 
     * @param databasePath
     *            Chemin de la base de donnees.
     * @param logger
     *            Logger.
     */
    public MN90DataProcessorServices(String databasePath) {
        super();
        try {
            setDatabaseServices(new DatabaseServiceSQLite(databasePath));
        } catch (SQLException | ClassNotFoundException | IOException e) {
            LogTracer.getLogger().error("Erreur lors de la connexion a la base de donnees " + databasePath, e);
        }
    }

    @Override
    protected Entity createEntity(String className, ResultSet rs) throws SQLException {
        Entity entity = null;
        LogTracer.getLogger().debug("Creation de l'objet de type " + className);
        if (className.equals(Plongeur.class.getName())) {
            entity = new Plongeur(rs.getString(ID), rs.getString(Plongeur.ATTRIBUTE_NAME));
        } else if (className.equals(Exercice.class.getName())) {
            entity = new Exercice(rs.getString(ID), rs.getString(Exercice.ATTRIBUTE_NAME), E_TYPE_EXERCICE.values()[rs.getInt(Exercice.ATTRIBUTE_TYPE)]);
        } else if (className.equals(LogBook.class.getName())) {
            entity = new LogBook(rs.getString(ID));
        } else if (className.equals(Plongee.class.getName())) {
            entity = new Plongee(rs.getString(ID), rs.getString(Plongee.ATTRIBUTE_NAME), rs.getInt(Plongee.ATTRIBUTE_PROFONDEUR), rs.getInt(Plongee.ATTRIBUTE_TEMPS_PLONGEES),
                    E_TYPE_THEME.values()[rs.getInt(Plongee.ATTRIBUT_THEME)], E_TYPE_ENVIRONNEMENT.values()[rs.getInt(Plongee.ATTRIBUT_ENVIRONNEMENT)],
                    E_TYPE_LIEU.values()[rs.getInt(Plongee.ATTRIBUT_LIEU)]);
        } else if (className.equals(PlongeeExercice.class.getName())) {
            entity = new PlongeeExercice(rs.getString(ID), rs.getString(PlongeeExercice.ATTRIBUTE_NAME), rs.getInt(PlongeeExercice.ATTRIBUTE_PROFONDEUR),
                    rs.getInt(PlongeeExercice.ATTRIBUTE_TEMPS_PLONGEES), E_TYPE_PLONGEE_EXERCICE.values()[rs.getInt(PlongeeExercice.ATTRIBUT_TYPE)]);
        } else if (className.equals(Site.class.getName())) {
            entity = new Site(rs.getString(ID), rs.getString(Site.ATTRIBUT_NAME),
                    new Localisation(rs.getDouble(Site.ATTRIBUT_LOCALISATION_LATITUDE), rs.getDouble(Site.ATTRIBUT_LOCALISATION_LONGITUDE)));
        } else if (className.equals(Participant.class.getName())) {
            entity = new Participant(rs.getString(ID), rs.getString(Participant.ATTRIBUT_NAME), E_NIVEAU.values()[rs.getInt(Participant.ATTRIBUT_NIVEAU)]);
        } else {
            LogTracer.getLogger().info("Le type d'entite " + className + " n'est pas pris en charge !!! ");
        }
        return entity;
    }

}
