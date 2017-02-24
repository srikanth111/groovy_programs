import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Common extends Myclass {
	 static void main(String[] args)
	{
	Myclass obj1 = new Myclass();
	Myclass obj2 = new Myclass();
	Myclass obj3 = new Myclass();

	obj1.calculate(3);
	obj2.calculate(5);
	obj3.calculate(7);

	}
}