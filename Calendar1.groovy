import org.codehaus.groovy.runtime.InvokerHelper
import java.util.Date
import java.sql.Date as SQLDate
class Calendar1{
	 static void main(String[] args)
	 {
	 	Date utilDate = new Date(1000L)
		SQLDate sqlDate = new SQLDate(1000L)

println utilDate //Thu Jan 01 05:30:01 IST 1970
println sqlDate  //1970-01-01

		assert utilDate instanceof java.util.Date
		assert sqlDate instanceof java.sql.Date
	 }
}