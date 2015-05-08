package buildinClass;

import org.junit.Assert;
import org.junit.Test;

import buildinClass.Battle;

//@Test
public class BattleTest {
	@Test
	public void doTest(){
		// test the game when the hero is lost
		Skill s1 = new Skill("Defend", 5, 0, 0, 2, 1);
		Skill s2 = new Skill("Heal", 10, 0, 0, 0, 1);
		Skill s3 = new Skill("Think", 0, 2, 0, 0, 0);
		Skill s4 = new Skill("Let's do this", 0, 0, 3, -0.5, 3);
		Skill[] ss = {s1, s2, s3, s4};
		Unit m = new Unit("boss", 5, 3, 50, 5, ss);
		Unit h = new Unit("hero", 5, 3, 20, 5, ss);
		Battle b = new Battle("Battle to death!", m);
		Assert.assertEquals(b.trigger(h), true);
		
		
		
	}
	
	@Test
	public void testLost() {
		// test lost
		//Skill s3 = new Skill("futile", 0, 0, 0);
		//Skill[] ss2 = {s3};
		//Character h1 = new Character("PLT", 5, 2, 0, ss2);
		//Monster m1 = new Monster("Aho", 5, 2, 20, ss2);
		//Battle b2 = new Battle("futile", m1);
		//Assert.assertEquals(b2.trigger(h1), false);
	}
	
	
}