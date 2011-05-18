package at.jku.ce;

public class Main {


	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	Set<DomainObject> objectSet = new HashSet<DomainObject>();


	public static void main(String[] args) {
	}


	objectSet.add(new DomainObject("Helga")); 
	objectSet.add(new DomainObject("Walter")); 
	objectSet.add(new DomainObject("Hannah")); 
	objectSet.add(new DomainObject("Paul")); 
	objectSet.add(new DomainObject("Claudia"));

	for (DomainObject domainObject : objectSet) { 
		LOGGER.debug(domainObject.id);

	}
}
