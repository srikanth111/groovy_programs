import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
enum DayOfWeek { mon, tue, wed, thu, fri, sat, sun}
@interface Scheduled{
	DayOfWeek dayOfWeek()
}
 