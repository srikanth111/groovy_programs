// this is a groovy class which is using Inheritance Concept
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Shape {
	public int length;

	Shape(int len)
	{
	length = len
	println 'Length vlaue is initialized using Shape class constructor'
	println "length is '$length'"
	}

}