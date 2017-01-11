package wsu.sudarshan.springInAction.chapter1;

/**
 * Chapter 1 of Spring in Action, 4th edition.
 * Demonstrates the need for Dependency injection.
 */
public class DamselRescuingKnight implements Knight {
	
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest(); //DamselRescuingKnight is heavily coupled to RescueDamselQuest
											 //DamselRescuingKnight can only embark on a quest to rescue a Damsel
	}										// and nothing else.
	
	public void embarkOnQuest() {   
		quest.embark();
	}
}