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
<<<<<<< HEAD
	protected void setComment(final String commend){
=======
	public void setComment(final String commend){
>>>>>>> 26bdd2371b7982bfe680fc1108b5f79b2a67ceb9
		this.comment = comment;
	}

	protected String getName(){
		return name;
	}
<<<<<<< HEAD
	protected void setName(final String name){
=======
	public void setName(final String name){
>>>>>>> 26bdd2371b7982bfe680fc1108b5f79b2a67ceb9
		this.name = name;
	}


}
