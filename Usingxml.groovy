import org.codehaus.groovy.runtime.InvokerHelper
import groovy.xml.MarkupBuilder
class Usingxml {


/*def writer = new StringWriter()
	def html = new MarkupBuilder(writer)
	html.html {
		 title 'Simple Document'
	}
	body(id:'main'){
		h1 'building HTML the Groovy Way'
		p {
			mkp.yield 'Mixing text with'
			strong 'bold'
			mkp.yield 'elements.' 
				
		}
		a href:'more.html', 'Read more...'
	}
*/
	
	static void main(String[] args)
	{
	def xml = new MarkupBuilder()

	assert xml !=null
	//println writer

	def date = new Date()
	println date

	new MarkupBuilder().root{
		a(a1:'one'){
			b{mkp.yield('3<5')}//here mkp is used to escape from normal building mode to helper markup methods.
			c(a:'two','blah')
		}
	}
	println 'List Items'
	new MarkupBuilder().Beverages{
		Tea{}
		Coffee{}
		Milk{}
		
	}
	}
}