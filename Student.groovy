import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Student implements Marks {


	int sid
	int smarks

static void main(String[] args)
{
	Student st = new Student()
	st.sid = 1;
	st.smarks = 10;
	println "st.DisplayMarks()"

}
}