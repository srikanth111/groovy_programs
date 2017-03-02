import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Overriding extends Overidden{
	int a =20 
	 void display()
	{

	println "this is the sub class overriding method '${a}'"
	}
	static void main(String[] args)
	{
	def obj1 = new Overriding()
	//def obj2 = new Overidden()
	obj1.display()
	//obj2.display()
	//obj2.method2('Aparna')
	}
}