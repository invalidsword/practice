package comparable;

public class Planet implements Comparable<Planet> 
{
	
	private int distance; //in km
	private int radius; //in km
	private String atmosphere; //dominant gas
	private static int planetCount = 0;
	
	public Planet(int pDistance, int pRadius, String pAtmosphere)
	{
		distance = pDistance;
		radius = pRadius;
		atmosphere = pAtmosphere;
		planetCount++;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getRadius()
	{
		return this.radius;
	}
	
	public String getAtmosphere()
	{
		return atmosphere;
	}
	
	public static int getPlanetCount()
	{
		return Planet.planetCount;
	}
	
	@Override
	public boolean equals(Object pObject)
	{
		if( pObject == null ) return false;
		if( pObject == this ) return true;
		if( pObject.getClass() != getClass() ) return false;
		return this.distance == ((Planet) pObject).distance;
	}
	
	@Override
	public int compareTo(Planet rivalPlanet)
	{
		return rivalPlanet.getRadius() - this.getRadius();
	}
	
	

}
