import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Person {
	final String name = 'Srikanth'
	final int age = 22
	/*Person(String name,int age)
	{
	this.name = name
	this.age = age
	println 'values are initialized by constructorised parameter'
	}*/ 
	 void display()
	{
		println name
		println age
	}

	void display2()
	{
		name = 'aparna'
		age = 21
	}

	static void main(String[] args)
	{
	def obj = new Person()
	obj.display()


	//def obj2 = new Person('shankar',22)
	//obj2.display()

	obj.display2() // cannot modify final field 'name' and 'age' outside of constructor.
	} 
}