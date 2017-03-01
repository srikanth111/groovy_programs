//this is a rectangle class which is inheriting shape class 
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Rectangle extends Shape
{
	int breadth
	Rectangle(int bre, int len)
	{
		super(len)
	breadth = bre
	println 'breadth value initialized using Rectangle class constructor'
	println "breadth is '$breadth'"
	}
	public void area()
	{
	def result = length*breadth
	println "the area of the rectangle is '$result'"
	}

	static void main(String[] args)
	{
	Rectangle rec = new Rectangle(3,6)
	rec.area()
	}
}