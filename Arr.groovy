//array declaration and initialization & range & pattern
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
import java.util.*
import java.lang.ArrayList.*
import java.lang.String.*
class Arr{
	def array = [73,86,29,45]
	def swap

	void display()
		{
			for(int i = 0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(array[i]>array[j])
					{
						swap = array[i]
						array[i]=array[j]
						array[j]=swap
					}
				}
			}
			println "sorted array is : $array"
		}
	static void main(String[] args)
	{
		
	
	def map = [fn:"Srikanth",age:"22"]
	def range = 1..10
	def pattern = ~/fo*/

	//println "the elements in the array are: $array"
		def obj = new Arr()

		obj.display()

		//assert 86 in array 
		assert 5 in range
		//assert array[2] == 86 // subscript notation

		map << [ln:'Ramesh',ge:'22']
		println map

		//assert map.fn == 'srikanth'
		println range
	}
}
