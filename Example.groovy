import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.sid = 1;
      st.marks = 10;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal());
   } 
} 





class Student implements Marks { 
   int sid
   int marks;  
} 