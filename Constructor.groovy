//positional argument constructor
import org.codehaus.groovy.runtime.InvokerHelper
class Constructor{
	String name
	Integer age

	 Constructor(name, age)
	 {
	 this.name = name
	 this.age = age
	 }

	 def display()
	 {
	 println name
	 println age
	 }

	 static void main(String[] args)
	 {
	 def person1 = new Constructor('srikanth',22)
	 def person2 = ['Aparna',21] as Constructor
	 	person1.display()
	 	person2.display()
	 }
}