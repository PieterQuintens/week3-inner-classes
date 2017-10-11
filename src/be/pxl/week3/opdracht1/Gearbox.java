package be.pxl.week3.opdracht1;

import java.util.ArrayList;

public class Gearbox {

	private int maxGears;
	private int currentGear;
	private boolean clutchIsIn = false;
	private ArrayList<Gear> gears = new ArrayList<>();

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		addGear();
	}

	public int getMaxGears() {
		return this.maxGears;
	}

	public void operateClutch(boolean clutch) {

		clutchIsIn = clutch;

	}

	private class Gear {
		private int gearNumber;
		private double ratio;

		public double driveSpeed(int revs) {
			return revs * ratio;
		}
	}

	public void addGear() {
		for (int i = 0; i <= maxGears; i++) {
			gears.add(new Gear());
			gears.get(i).gearNumber = i;
			gears.get(i).ratio = i * 5.3;
		}
	}

	public void changeGear(int newGear) {
		if (clutchIsIn && newGear <= maxGears) {
			currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Vreemd geluid");
			currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			return 0;
		} else {
			return gears.get(currentGear).driveSpeed(revs);
		}
	}
}
