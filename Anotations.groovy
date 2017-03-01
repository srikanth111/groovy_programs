import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
/*this is a annotation interface called as a super interface.
this is used to define the members in the form of methods without declaring the body and an optional value.*/
enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun }
@interface Scheduled{
	DayOfWeek dayOfWeek()
}