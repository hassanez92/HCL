import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex. of HashSet
		// Set of integers, Add value 1 2 4 2 3 5 3

		Set<Integer> s = new HashSet<Integer>();
		Integer[] data = { 3, 2, 4, 2, 3, 5, 1 };
		List data1 = Arrays.asList(data);
		s.addAll(data1);
		System.out.println(s);

		// TODO Auto-generated method stub
		// Ex. of HashSet
		// Set of integers, Add value 1 2 4 2 3 5 3

		TreeSet<Integer> s1 = new TreeSet<Integer>();
		Integer[] data2 = { 3, 2, 4, 2, 3, 5, 1 };
		List data3 = Arrays.asList(data);
		s1.addAll(data3);
		// s1.descendingSet();
		System.out.println(s1.descendingSet());

		// TODO Auto-generated method stub
		// Ex. of HashSet
		// Set of integers, Add value 1 2 4 2 3 5 3

		Set<Employee> s2 = new HashSet<Employee>();
		
		//override hashcode for distinct
		
		SetExample se = new SetExample();
		s2.add(se.new Employee("silvi", 35));
		s2.add(se.new Employee("loel", 100));
		s2.add(se.new Employee("silvi", 35));
		System.out.println(s2);
		System.out.println(s2.contains(se.new Employee("silvi", 35)));
		System.out.println(s2.contains(se.new Employee("divyluv", 35)));
		//returns boolean, contains search
		
		
		//Store employees in a sorting order
		Set<Employee> s3 = new TreeSet<Employee>();
		
		s3.add(se.new Employee("silvi", 35));
		s3.add(se.new Employee("loel", 100));
		s3.add(se.new Employee("silvi", 35));
		
		System.out.println(s3);
		System.out.println(s3.contains(se.new Employee("silvi", 35)));
		System.out.println(s3.contains(se.new Employee("divyluv", 35)));
		
		//Sort All Employees by scores from highest to lowest. If the scores are the same sort by alphabetically.
		//Almost 5 different employees [leo 55, loel 55, silvi 100, krishna 35, divyluv 100]
		//by treeset method. OUTPUT - [divyluv 100, silvi, 100, leo 55, loel 55, krishna 35]
		
		//Map both are similar to hashset and treeset
		//Hashmap: Hashmap keys are hashed. hashset data itself is hashed
		//Treemap: keys are sorted, treeset data is sorted.
		
		Map<String,String> bag=new HashMap<String,String>();
		
		bag.put("fruit","Orange");
		bag.put("vegetable","Carrot");
		bag.put("mammal","ape");
		bag.put("fish","cord");
		
		System.out.println(bag);
		System.out.println("HashMap keys:" + bag.keySet());
		System.out.println(bag.get("fruit"));


		Map<String,String> bag1=new TreeMap<String,String>();
		
		bag1.put("fruit","Orange");
		bag1.put("vegetable","Carrot");
		bag1.put("mammal","ape");
		bag1.put("fish","cord");
		
		System.out.println(bag1);
		System.out.println("TreeMap keys:" + bag1.keySet());
		System.out.println(bag1.get("fruit"));


	}

	class Employee implements Comparable {
		String name;
		Integer score;

		Employee(String name, int score) {
			this.name = name;
			this.score = score;

		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " " + score;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Employee e = (Employee) obj;
			return this.name.equals(e.name);
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode()+this.score.hashCode();
		}

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			Employee e = (Employee) arg0;

			return this.name.compareTo(e.name);
		}
	}
	//Assume class doesnt implement comparable. How would you sort the obj using TreeSet
	//Hint: Use TreeSet Constructor with comparator parameter.
	class Employee1 {
		String name;
		Integer score;

		Employee1(String name, int score) {
			this.name = name;
			this.score = score;

		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " " + score;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Employee e = (Employee) obj;
			return this.name.equals(e.name);
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode()+this.score.hashCode();
		}

		/*@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			Employee e = (Employee) arg0;

			return this.name.compareTo(e.name);
			*/
		}
	}