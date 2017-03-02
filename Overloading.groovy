import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Overloading{
	def a
	def b
	def c
	public void add(def a,def b)
	{
	this.a = a
	this.b = b
	def result = a+b
	println "the addition of two variables a and b is '${result}'"
	}
	public void add(def a,def b,def c)
	{
	this.a = a
	this.b = b
	def result = a+b+c
	println "the addition of three variables a, b and c is '${result}'"
	}

	static void main(String[] args)
	{
	def obj = new Overloading()
	obj.add(2,5)
	obj.add(2,5,8)
	}
}