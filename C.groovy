//implementing multiple traits

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

class C implements A,B{
	static void main(String[] args)
	{
		def c = new C()
		def d = c.withTraits A,B
		d.methodFromA()
		d.methodFromB()
	}
}