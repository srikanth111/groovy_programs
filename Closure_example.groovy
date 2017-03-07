// declaring closure 

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Closure_example {
	
	static void main(String[] args){
	def listener = { e -> println "Clicked on $e.source" } 
	//println listener
	def code = {123} // no argument closure
 //def str = 'srikanth'
assert code.call() == 123

	def isOdd = {int i->i%2 == 1}
	assert isOdd(3) == true
	assert isOdd.call(2) == false

	def closureWithOneArg = {str-> str.toUpperCase()}

	assert closureWithOneArg('srikanth') == 'SRIKANTH'
	def closureWithTwoArg = {a,b->a+b}
	assert closureWithTwoArg(1,2) == 3

	def closureWithTwoArgAndExplicitTypes = {int a,int b->a+b}
	assert closureWithTwoArgAndExplicitTypes(2,5)==7
	
	
	}
}