package at.jku.ce;

public class DomainObject {


	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

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

	public String getComment(){
		return comment;
	}
	public void setComment(String commend){
		this.comment = comment;
	}


}
