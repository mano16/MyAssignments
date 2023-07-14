package week3.day1;

public class Automation extends MultipleLanguage implements TestTool{

	//why don't I get override in this  method
	public void java() {
		System.out.println("I'm java in Execution class from language interface");

	}

	@Override
	public void ruby() {
		System.out.println("I'm ruby implemented in Execution class from Multilanguage abstract class");

	}
	//why don't I get override in this  method
	public void Selenium() {
		System.out.println("I'm Selenium implemented in Execution class from TestTool interface");

	}


	public static void main(String[] args) {

		Automation auto = new Automation();
		auto.python();
		auto.java();
		auto.Selenium();
		auto.ruby();
	}


}
