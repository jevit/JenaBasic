package query;

import type.EnumPrefix;

/**
 * Classe pour construire les requetes avec les prefix et la selection
 * 
 * @author jv
 *
 */
public class Build {

	private StringBuilder builderPrefix = new StringBuilder();
	private StringBuilder builderQuery = new StringBuilder();

	/**
	 * Retourne les prefix définies dans les enums
	 * 
	 * @return
	 */
	public String getPrefix() {
		builderPrefix.append(EnumPrefix.DBPEDIA.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.GEO.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.P.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.RDFS.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.SKOS.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.CATEGORY.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.DCTERMS.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.DBPEDIAFR.getUrl());
		builderPrefix.append(" ");
		builderPrefix.append(EnumPrefix.CATEGORYFR.getUrl());
		builderPrefix.append(" ");
		return builderPrefix.toString();
	}

	/**
	 * Ajout d'un prefix
	 * 
	 * @param object
	 * @return
	 */
	public String appendPrefix(Object object) {
		return builderPrefix.append(object).toString();
	}

	/**
	 * Retourne la requete de selection sans préfix
	 * 
	 * @return
	 */
	public String getQuery() {
		return builderQuery.toString();
	}

	/**
	 * Requete de selection avec le préfix
	 * 
	 * @return
	 */
	public String getFullQuery() {
		StringBuilder builderFullQuery = new StringBuilder();
		builderFullQuery.append(this.getPrefix());
		builderFullQuery.append(this.getQuery());
		return builderFullQuery.toString();
	}

	/**
	 * Construit la requete en séparant la requete de selection et les prefix (
	 * aucun controle cependant )
	 * 
	 * @param query
	 *            : requete de selection
	 * 
	 */
	public Build(String query) {
		builderQuery.append(query);
	}
}
