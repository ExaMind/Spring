package wsu.sudarshan.springInAction.chapter1;

public class BraveKnight implements Knight{

	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest; //Unlike DamselRescuingKnight, BraveKnight is given a Quest at construction time.
	}						//Constructor dependency injection
	
	public void embarkOnQuest() {

		quest.embark();
		
	}
	

}
