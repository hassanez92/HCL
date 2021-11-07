package assignments;

class Room {
	int roomNo;
	String roomType;
	double roomArea;
	boolean acMachine;

	public void setData(int rno, String rt, double a, boolean ac) {
		roomNo = rno;
		roomType = rt;
		roomArea = a;
		acMachine = ac;
	}

	public void displayData() {

		System.out.println("The room# is " + roomNo);
		System.out.println("The room Type is " + roomType);
		System.out.println("The room Area is " + roomArea);
		String s = (acMachine) ? "yes" : "no";
		System.out.println("The A / c Machine needed " + s);
	}

	public static void main(String arg[]) {
		Room room1 = new Room();
		room1.setData(101, "Suite", 1000.0, true);
		room1.displayData();
	}
}
