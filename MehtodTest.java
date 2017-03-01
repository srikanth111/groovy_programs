import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

class MethodTest {
	def student
	def sid
	public def method(def sname, def id){
		student = sname
		sid = id
		println 'values are initialized using mehtod'
	}

	public def display()
	{
		prinln student
		println sid
	}
	static void main(String[] args)
	{
		def obj = new MethodTest
		obj.method('srikanth',123)
		obj.display()
	}
}