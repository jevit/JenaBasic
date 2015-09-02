package type;

/**
 * Prefix DBPedia
 */
public enum EnumPrefix {
	/*	*/
	P("PREFIX p: <http://dbpedia.org/property/>"),
	/*	*/
	DBPEDIA("PREFIX p: <http://dbpedia.org/property/>"),
	/*	*/
	CATEGORY("PREFIX category: <http://dbpedia.org/resource/Category:>"),
	/*	*/
	RDFS("PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"),
	/*	*/
	SKOS("PREFIX skos: <http://www.w3.org/2004/02/skos/core#>"),
	/* */
	DCTERMS("PREFIX dcterms: <http://purl.org/dc/terms/>"),
	/*	*/
	GEO("PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>"),
	/* */
	DBPEDIAFR("PREFIX dbpediafr: <http://fr.dbpedia.org/resource/>"),
	/* */
	CATEGORYFR("PREFIX categoryfr: <http://fr.dbpedia.org/resource/Catégorie:>");
	private String url;

	EnumPrefix(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String toString() {
		return getUrl();
	}
}
