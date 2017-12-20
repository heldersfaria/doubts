package example;

public class Execute {

	public static void main(String[] args) {
		House house = new House();

		house.getDrawer().addSock("sock 1");

		house.getDrawer().addSock("sock 2");

		house.getDrawer().addSock("sock 3");

		Thief.getIntoNeighborHouse(house, "sock 1");

		System.out.println(house.toString());

	}

}
