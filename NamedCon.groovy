//named argument constructor

import org.codehaus.groovy.runtime.InvokerHelper
class NamedCon{
	String name
	Integer age
  def display()
  {
  println name
  println age
  }
	static void main(String[] args)
	{
	def person1 = new NamedCon(name:'Mathew',age:22)
	def person2 = new NamedCon(name:'Lisa',age:21)
	//def person3 = new NamedCon()
	person1.display()
	person2.display()
	//person3.display()

	}
}
