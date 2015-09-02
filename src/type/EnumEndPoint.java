package type;

/**
 * List de endpoint à interroger
 */
public enum EnumEndPoint {
	DBPEDIA("http://dbpedia.org/sparql");

	private String url;

	EnumEndPoint(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String toString() {
		return getUrl();
	}
}
