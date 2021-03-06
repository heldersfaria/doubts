package example;

public class House {

	private Drawer drawer;

	public House() {
		this.setDrawer(new Drawer());
	}

	public House(Drawer drawer) {
		this.setDrawer(drawer);
	}

	public Drawer getDrawer() {
		return drawer;
	}

	public void setDrawer(Drawer drawer) {
		this.drawer = drawer;
	}

	@Override
	public String toString() {
		return drawer.toString();
	}

}
