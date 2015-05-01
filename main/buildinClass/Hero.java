package buildinClass;

public class Hero {
	public String name;
	public Float attack;
	public Float defend;
	public Float life;
	public Skill[] skills;
	public Hero(String n, Float a, Float d, Float l, Skill[] sk){
		name = n;
		attack = a;
		defend = d;
		life = l;
		skills = sk;
	}
	public Hero(Hero h){
		name = h.name;
		attack = h.attack;
		defend = h.defend;
		life = h.life;
		skills = h.skills.clone();
	}
	
	public void showSkills() {
		for (int i = 0; i < skills.length; i++) {
			System.out.println((i + 1) + " - " + skills[i].name + ":" + skills[i].effect());
		}
	}
}
