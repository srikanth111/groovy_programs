//this program is based on Interface concept in groovy i.e this class implements Greeter interface

import org.codehaus.groovy.runtime.InvokerHelper
class SystemGreeter implements Greeter {
	void greet(String name){
	println "Hello $name"
	}
	static void main (String[] args)
	{
	 def greeter = new SystemGreeter()
	greeter.greet('srikanth')
	//coerced = greeter as Greeter
	assert greeter instanceof Greeter
	}
}