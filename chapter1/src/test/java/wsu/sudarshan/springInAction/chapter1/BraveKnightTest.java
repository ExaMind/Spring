package wsu.sudarshan.springInAction.chapter1;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.mockito.Mockito.*;



/**
 * Unit test for .
 */
public class BraveKnightTest  {
	
    @Test
	public void knightShouldEmbarkOnQuest() {
		
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
    
}
