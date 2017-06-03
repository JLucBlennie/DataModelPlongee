package com.jlb.plongee.datamodel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.jlb.plongee.datamodel.exercices.Exercice;
import com.jlb.plongee.datamodel.logbook.LogBook;
import com.jlb.plongee.datamodel.plongees.PlongeeLogBook;
import com.jlb.tools.csv.CSVReader;
import com.jlb.tools.metamodel.Entity;
import com.jlb.tools.metamodel.attributes.impl.StringAttribute;

/**
 * Classe decrivant un plongeur. Un plongeur a un carnet de plongees et aussi
 * des Exercices de Table de plongees
 * 
 * @author JLuc
 *
 */
public class Plongeur extends Entity {

	public static final String ATTRIBUTE_NAME = DICO_PROPERTIES.getString("datamodel.plongeur.attribut.name");

	private static final String COMPARTIMENT_FILENAME = "resources/mn90/compartiments.mn90";
	private static List<Compartiment> mCompartiments = new ArrayList<Compartiment>();

	static {
		// Chargement du fichiers de resources mn90/compartiments.mn90
		List<String[]> lignesCSV = CSVReader.readFile(new File(COMPARTIMENT_FILENAME));
		for (String[] ligneCSV : lignesCSV) {
			int periode = Integer.parseInt(ligneCSV[0]);
			double sc = Double.parseDouble(ligneCSV[1]);
			Compartiment comp = new Compartiment(periode, sc);
			mCompartiments.add(comp);
		}
	}

	public Plongeur() {
		super();
		// Definition des type de fils
		mAuthorizedChildrenClass.add(Exercice.class);
		mAuthorizedChildrenClass.add(LogBook.class);

		// Definition des Attributs
		StringAttribute attrName = new StringAttribute(ATTRIBUTE_NAME);
		mAttributes.add(attrName);
	}

	public Plongeur(int id, String nom) {
		this.mId = id;
		// Definition des type de fils
		mAuthorizedChildrenClass.add(Exercice.class);
		mAuthorizedChildrenClass.add(LogBook.class);

		// Definition des Attributs
		StringAttribute attrName = new StringAttribute(ATTRIBUTE_NAME, nom);
		mAttributes.add(attrName);
	}

	public void addExercice(Exercice exercice) {
		if (!mChildren.contains(exercice)) {
			exercice.setParent(this);
			mChildren.add(exercice);
		}
	}

	public void removeExercice(Exercice exercice) {
		if (mChildren.contains(exercice)) {
			mChildren.remove(exercice);
		}
	}

	public void addPlongeeToLogbook(PlongeeLogBook plongee) {
		LogBook logbook = (LogBook) getChildOfType(LogBook.class.getName(), 0);
		logbook.addPlongee(plongee);
	}

	public void removePlongeeFromLogbook(PlongeeLogBook plongee) {
		LogBook logbook = (LogBook) getChildOfType(LogBook.class.getName(), 0);
		logbook.removePlongee(plongee);
	}

	public void addLogBook(LogBook logBook) {
		boolean noLogBookFound = (getChildrenOfType(LogBook.class.getName()).size() == 0);
		if (!mChildren.contains(logBook) && noLogBookFound) {
			logBook.setParent(this);
			mChildren.add(logBook);
		}
	}

	@Override
	public String toString() {
		return "Plongeur (" + this.mId + ") " + this.getAttribute(ATTRIBUTE_NAME).getValue() + " - nb Exercices "
				+ getChildrenOfType(Exercice.class.getName()).size();
	}
}