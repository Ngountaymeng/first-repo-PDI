package challengelab06;
class Weapon{
	String name;
	Weapon(String name){
		this.name = name;
	}
}
class Spell {
	String name;
	Spell(String name){
		this.name=name;
	}
}
class Character{
	void attack() {
		System.out.println("Character attacks");
	}
}
class Warrior extends Character{
	Weapon weapon;
	
	Warrior(Weapon weapon){
		this.weapon = weapon;
	}
}
class Wizard extends Character{
	Spell spell;
	Wizard(Spell spell){
		this.spell = spell;
	}
}
public class challenge06 {
	public static void main(String[] args) {
		Warrior w = new Warrior(new Weapon("Sword"));
		Wizard z = new Wizard(new Spell("Fireball"));
		
		System.out.println(w.weapon.name);
		System.out.println(z.spell.name);
	}
}
