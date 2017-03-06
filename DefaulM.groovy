// implementing the DefaultMethod interface in this class

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

class DefaulM implements DefaultMethod {
	void method()
	{
	println 'this is default method in Default Method interface which is implementing in class'
	}
	static void main(String[] args)
	{
		def obj = new DefaulM()
		obj.method()
	}
}