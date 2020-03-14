package P3;

import java.util.HashSet;
import java.util.Set;

public class Person 
{
	private String Name;
	public int Distance;
	public  boolean Visit;
	public Set<Person> Friend;
	public int index;
	public Person(String name) 
	{
		this.Name = name;
		this.Distance = 0;
		this.Visit = false;
		this.Friend = new HashSet<>();
	}
	public String getName()
	{
		return this.Name;
	}
}