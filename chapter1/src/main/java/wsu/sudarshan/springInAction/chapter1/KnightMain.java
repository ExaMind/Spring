package wsu.sudarshan.springInAction.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
		context.close();

	}

}
