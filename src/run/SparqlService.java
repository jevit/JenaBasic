package run;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;

import query.Build;
import type.EnumEndPoint;

/**
 * Classe éxécution des requete via service endpoint
 * 
 * @author jv
 *
 */
public class SparqlService {
	String queryString = "select distinct * where {?s rdfs:label ?l} LIMIT 100 ";

	public SparqlService(String queryString) {
		this.queryString = queryString;
	}

	public SparqlService() {
	}

	public void run() {
		Build buildQuery = new Build(queryString);
		Query query = QueryFactory.create(buildQuery.getFullQuery());
		QueryExecution qexec = QueryExecutionFactory.sparqlService(EnumEndPoint.DBPEDIA.getUrl(), query);
		try {
			ResultSet results = qexec.execSelect();
			while (results.hasNext()) {
				ResultSetFormatter.out(System.out, results);
			}
		} finally {
			qexec.close();
		}
	}
}
