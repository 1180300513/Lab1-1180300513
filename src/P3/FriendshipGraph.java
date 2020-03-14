package P3;

import java.util.*;

public class FriendshipGraph 
{
	private int NOP;// Number of person
	private Set<String> nameSet = new HashSet<>();
	private List<Person> personList = new ArrayList<>();

	/**
	 * Add vertexes to graph or we can say add person into social network. If
	 * person.name has been used before, it will exit this program with return
	 * -1.
	 * 
	 * @param Person
	 *            person, an instance of class Person of "social network".
	 * @return void.
	 */
	public void addVertex(Person person) 
	{
		if (nameSet.contains(person.getName())) 
		{
			// If someone'name has been used before, it will exit with returning
			// -1
			System.out.println(person.getName() + " has been used before!");
			System.exit(-1);
		}
		nameSet.add(person.getName());
		personList.add(person);
		person.index = NOP++;
	}

	/**
	 * Add edges to graph or we can say add interaction into social network. If
	 * someone's name has not been added to the graph, it can not add the edge
	 * into social network.
	 * 
	 * @param Person
	 *            person1 one of the two points of the edge.
	 * @param Person
	 *            person2 one of the two points of the edge.
	 * @return void.
	 */
	public void addEdge(Person Pa, Person Pb) 
	{
		if (Pa.getName().equals(Pb.getName())) 
		{
			// System.out.println(person1.getName() + " is equal to " +
			// person2.getName());
			return;
		} 
		else 
		{
			if (nameSet.contains(Pa.getName()) && nameSet.contains(Pb.getName())) 
			{
				personList.get(Pa.index).Friend.add(Pb);
			} 
			else
				return;
		}
	}

	/**
	 * Get the shortest distance between two persons in the social network.
	 * 
	 * @param Person
	 *            person1. One of the two people that needed to know the
	 *            distance between them.
	 * @param Person
	 *            person2. One of the two people that needed to know the
	 *            distance between them.
	 * @return the shortest distance between the two people.
	 */
	public int getDistance(Person person1, Person person2) 
	{
		if (person1.getName().equals(person2.getName()))
			return 0;
		Queue<Person> queue = new LinkedList<>();
		for (int i = 0; i < NOP; i++) 
		{
			personList.get(i).Distance = 0;
			personList.get(i).Visit = false;
		}
		int ans = -1;
		person1.Visit = true;
		queue.offer(person1);
		boolean flag = false;
		Person person;
		while (!queue.isEmpty()) 
		{
			person = queue.poll();
			Set<Person> adj = person.Friend;
			for (Person person3 : adj) 
			{
				if (!person3.Visit) 
				{
					person3.Visit = true;
					queue.offer(person3);
					person3.Distance = person.Distance + 1;
					if (person3.getName().equals(person2.getName())) 
					{
						flag = true;
						ans = person3.Distance;
						break;
					}
				}
			}
			if (flag)
				return ans;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		FriendshipGraph graph = new FriendshipGraph();
		Person rachel = new Person("Rachel");
		Person ross = new Person("Ross");
		Person ben = new Person("Ben");
		Person kramer = new Person("Kramer");
		graph.addVertex(rachel);
		graph.addVertex(ross);
		graph.addVertex(ben);
		graph.addVertex(kramer);
//		graph.addEdge(rachel, ross);
		graph.addEdge(ross, rachel);
		graph.addEdge(ross, ben);
		graph.addEdge(ben, ross);
		System.out.println(graph.getDistance(rachel, ross));
		System.out.println(graph.getDistance(rachel, ben));
		System.out.println(graph.getDistance(rachel, rachel));
		System.out.println(graph.getDistance(rachel, kramer));
	}
}