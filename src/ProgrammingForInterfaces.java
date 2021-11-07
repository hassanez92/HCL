
public class ProgrammingForInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingForInterfaces p = new ProgrammingForInterfaces();
		
		Toyota t = new Toyota();
		
		System.out.println(t.whoAreYou());
		
		Toyota t1 = p.new Camery();
		
		System.out.println(t1.whoAreYou());
		
		}

	class Toyota{
		public String whoAreYou()
		{
			return "Passenger Car";
		}
	}
	
	class Camery extends Toyoya {
		public String whoAreYou();
		
		
	}
	
}
