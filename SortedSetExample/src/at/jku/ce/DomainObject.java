package at.jku.ce;

public class DomainObject {


	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

	public DomainObject(String name, String comment){
		super();
		this.comment = comment;
		this.name = name;
	}

	/**
	* Default-Constructor
	*/
	protected DomainObject() {
		super();
	}

	protected String getUuid(){
		return uuid;
	}

	protected String getComment(){
		return comment;
	}
	protected void setComment(final String commend){
		this.comment = comment;
	}

	protected String getName(){
		return name;
	}
	pprotected ublic void setName(final String name){
		this.name = name;
	}

}
