public class Main
{
	public static void main(String[] args) {
		mother m= new mother();
		m.show();// this will print hello mother
		child ch=new child();
		ch.show();// but this will Override the show function of mother class and run show function of child class only
		// so we can't call show() of mother class with object of child class it will Override it
	}
}
