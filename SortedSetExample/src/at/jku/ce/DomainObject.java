package at.jku.ce;

public class DomainObject {


	private String uuid = UUID.randomUUID().toString();
	private String name;

	public DomainObject(String name, String comment){
		super();
		this.comment = comment;
		this.name = name;
	}

	/**
	* Default-Constructor
	*/
	public DomainObject() {
		super();
	}

	public String getUuid(){
		return uuid;
	}

}
