package at.jku.ce;

public class DomainObject{


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

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String toString() {
		return "DomainObject [name=" + name 
		+ ", comment=" + comment + ",
 		uuid=" + uuid + "]"; 
	}
}
