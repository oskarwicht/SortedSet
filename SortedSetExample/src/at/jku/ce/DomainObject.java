package at.jku.ce;

public class DomainObject implements Comparable<DomainObject> {


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
	
	public boolean equals(Object obj) { 
		if (!(obj instanceof DomainObject)) {
			return false; 
		}
		DomainObject domainObj = (DomainObject) obj; 
		return uuid.equals(domainObj.getUuid()); 
	}

	public int compareTo(DomainObject o) { 
		DomainObject domainObj = (DomainObject) o; 
		int domObjeComp = name.compareTo(domainObj.getName());
		return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : domObjeComp);
	}
}
