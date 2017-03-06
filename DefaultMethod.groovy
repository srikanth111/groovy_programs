//writing default method 

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

interface DefaultMethod {
	default void method()//default methods are not allowed in groovy
	{
	println 'groovy doesnt allow writing default method'
	}
	static void main(String[] args)
	{
		def obj = new DefaultMethod()
		obj.method()
	}
}