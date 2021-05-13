package laboratory6.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		//1.create the object
//		SuperHero superHero=new SuperHero();
//		//2.initialize the object(if its not initialized it has no value)
//	    //dont forget
//		
//		SuperHero superHero2=
//				new SuperHero("SuperMan",
//						100,false,false,
//						new Weapon(),null,new Flying(),null);
		
		SuperHero superman=
				new SuperHero.SuperHeroBuilder("Superman", 100).build();
		
		SuperHero joker=
				new SuperHero.SuperHeroBuilder("Joker", 200).isWounded().setRightWeapon(new Weapon()).setSuperPower(new Flying()).build();
	

	}

}
