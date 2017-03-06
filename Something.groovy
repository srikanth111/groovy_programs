//this is implementing class which implements the extra method in Extra trait at run time.
import org.codehaus.groovy.runtime.InvokerHelper
import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import java.lang.*

class Something{
	
	String doSomething()
	{
	println 'this is a method in Something class'
	}

	static void main(String[] args)
	{
		def s = new Something()
	def d = s.withTraits Extra
	//def s = new Something()
	d.extra()
	s.doSomething()
	}
}