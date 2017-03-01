import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class SomeSchedule extends Scheduled
{
	DayOfWeek dayOfWeek()
	{
	println 'this is some annotation class which implements the Anotations interface'
	def day1 = 'monday'
	def day2 = 'sunday'
	def result = day2-day1
	println result
	}
	static void  main(String[] args)
	{
		def obj = new Someanotation()
		obj.dayOfWeek() 
	}
}

/* we can also define a different  types of members in the form of methods.
1. String value() // string type
2. int value() // int type
3. Class appliesTo() // Classes type
4. enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun}
	@interface Scheduled {
	DayOfWeek dayOfWeek() // this is enum type annoation 
	}
	*/