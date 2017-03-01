import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

class MethodTest {
	def student
	def sid
	static student1
	public def method(def sname, def id){
		student = sname
		sid = id
		println 'values are initialized using mehtod'
	}

	public def display()
	{
		println student
		println sid
	}

	static String method2(String name)
	{
		
		student1 = name
		println 'values are initialized using static method'
		println student1
	}

	/*public def terinary()
	{
		def a = 10
		def b = 10
		def result = (a = b)? 'equal' : 'not equal'
	}*/
	static void main(String[] args)
	{
		def obj = new MethodTest()
		obj.method('srikanth',123)
		obj.display()
		//obj.terinary()
		MethodTest.method2('Aparna')

	}
}