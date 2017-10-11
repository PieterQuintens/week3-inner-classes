package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {
		
			Vampire vampire = new HorrorShow().new Vampire();
			Werewolf werewolf = new HorrorShow().new Werewolf();
			
			vampire.menace();
			werewolf.destroy(vampire);
	}

	private class Vampire implements Monster {

		public void menace() {
			System.out.println("I'll drink your blood!!");
		}

	}

	private class Werewolf implements DangerousMonster {

		public void menace() {
			System.out.println("I'll destroy you!!");
		}

		public void destroy(Monster monster) {
			monster.menace();
			System.out.println("Big fight...");
			System.out.println(this.getClass().getSimpleName() + " killed one " + monster.getClass().getSimpleName());
		}

	}

}
