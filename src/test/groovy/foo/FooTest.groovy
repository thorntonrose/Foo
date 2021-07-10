package foo

import org.junit.*
import static groovy.test.GroovyAssert.*

class FooTest {
	@Test
	void testBar() {
		assertEquals "bar", new Foo().bar()
	}
}
