import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
	public String name;
	public int health;
	public String weapon;
	public String mainSkill;

	public Player(String name, int health, String weapon, String mainSkill) {
		this.name = name;
		this.health = health;
		this.weapon = weapon;
		this.mainSkill = mainSkill;
	}

	@Override
	public List<String> save() {
		List<String> values = new ArrayList<String>();
		values.add(this.name);
		values.add(""+this.health);
		values.add(this.weapon);
		values.add(this.mainSkill);
		System.out.println("Values: " + this.name +", " + this.health + ", " + this.weapon + ", " + this.mainSkill + ", have been saved to storage medium.");
		return values;
	}

	@Override
	public void load(List<String> values) {
		this.name = values.get(0);
		this.health = Integer.parseInt(values.get(1));
		this.weapon = values.get(2);
		this.mainSkill = values.get(3);
	}
	
	@Override
	public String toString() {
		return "Name = " + this.name +"\nHealth = " + this.health + "\nWeapon = " + this.weapon + "\nMain skill = " + this.mainSkill;
	}
}