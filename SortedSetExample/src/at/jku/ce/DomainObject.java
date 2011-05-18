package at.jku.ce;

public class DomainObject {


	public String uuid;
	private String name;

	public DomainObject(String id){
		super();
		this.uuid = id;
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
