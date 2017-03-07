//groovy programming using spread operator(*.)

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

class SpreadOperator {
	String make
	String model
	int x,y,z
	int function(x,y,z){
				x*y+y
			}
	static void main(String[] args)
	{
		def obj = new SpreadOperator()
		def cars = [new SpreadOperator(make:'Lamborghini',model:'LM002'),
					new SpreadOperator(make:'Audi',model:'A8')]
			def makes = cars*.make
			def models = cars.model
			assert makes == ['Lamborghini','Audi']
			assert models == ['LM002','A8']

			println "$makes"
			println "$models"

			/*def list = (4)
			assert function(*list,5,6) == 25 *///Spreading the method arguments
			 def list = obj.function(4,5,6)

			
		println "$list"
		assert list == 25
 
		def items = [4,5]
		def list1 = [1,2,3,*items,6] //Spreading the List Elements
		println "$list1"

		def m1 = [c:3,d:4]
		def map = [a:1,b:2,*:m1]
		println "$map"

//using spaceship operator
	assert (1<=>1) == 0 // here if the values are equal it returns 0, in assertion 0 == 0.
	assert (2<=>1) == 1 
	assert (1<=>2) == -1
	assert ('a'<=>'z') == -1
	assert ('srikanth'<=>'srikanth') == 0

	// using subscript operator

	def number_list = [1,2,3,4,5,6]
	assert number_list[1] == 2
	number_list[2] = 7
	println "$number_list"
	assert number_list[0..2] == [1,2,7] //checking whether the elements contain the given values or not
	number_list[0..2] = [9,9,9] // putAt 
	println "$number_list"

	// using membership operators

	def stringList = ['Grace', 'Rob', 'Emmy']
	assert ('Emmy' in stringList)
	stringList.isCase('Emmy')
	println stringList

	// using Identity Operator
	def stringList2 = ['Grace', 'Rob', 'Emmy']
	assert stringList == stringList2 // comparing the values as same equals method in java
	assert !stringList.is(stringList2) // checking the identity of the objects "stringList and stringList2"
	
	// using Coercion operator
	Integer x = 123
	String s = x as String
 	String ss = (String)x

 	int y = 2**3
 	println y

	}
}