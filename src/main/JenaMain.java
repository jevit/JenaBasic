package main;

import run.SparqlService;

/**
 * Classe main
 * 
 * @author jv
 *
 */
public class JenaMain {

	public static void main(String[] args) {
		StringBuilder requete = new StringBuilder();
		requete.append(" SELECT  ?subject ?mtn ?lat ?long");
		requete.append(" WHERE {");
		requete.append(" ?subject dcterms:subject categoryfr:Abbaye .");
		requete.append(" ?subject geo:long ?long .");
		requete.append(" ?subject geo:lat ?lat .");
		requete.append(" ?subject rdfs:label ?label.");
		requete.append(" FILTER(lang(?label) = 'fr')");
		requete.append(" }LIMIT 103 ");
		SparqlService sparqlService = new SparqlService(requete.toString());
		sparqlService.run();
	}
}
