// declaring closure 

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Closure_example {
	
	static void main(String[] args){
	def listener = { e -> println "Clicked on $e.source" } 
	//println listener
	def code = {123} // no argument closure

assert code.call() == 123

	def isOdd = {int i->i%2 == 1}
	assert isOdd(3) == true
	assert isOdd.call(2) == false
	}
}