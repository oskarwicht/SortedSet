package at.jku.ce;

public class Main {


	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());


	public static void main(String[] args) {
	}


	objectSet.add(DomainFactory.createDomainObject("Helga","Kommentar")); 
	objectSet.add(DomainFactory.createDomainObject("Walter","Kommentar")); 
	objectSet.add(DomainFactory.createDomainObject("Hannah","Kommentar")); 
	objectSet.add(DomainFactory.createDomainObject("Paul","Kommentar")); 
	objectSet.add(DomainFactory.createDomainObject("Claudia","Kommentar"));

	for (DomainObject domainObject : objectSet) { 
		LOGGER.debug(domainObject.toString();

	}
}
