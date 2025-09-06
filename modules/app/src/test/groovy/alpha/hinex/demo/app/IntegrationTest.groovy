package alpha.hinex.demo.app

import io.github.springroll.test.AbstractIntegrationTest
import org.junit.Test
import org.springframework.http.HttpStatus

class IntegrationTest extends AbstractIntegrationTest {

    @Test
    void test() {
        assert resOfGet('/', HttpStatus.OK) == 'hello world'
        assert resOfGet('/same/path', HttpStatus.OK)['Context Path'] == ''
        assert resOfGet('/same/path', HttpStatus.OK)['Servlet Path'] == '/same/path'
        assert resOfGet('/foo/same/path', HttpStatus.OK)['Servlet Path'] == '/foo'
        assert resOfGet('/bar/same/path', HttpStatus.OK)['Servlet Path'] == '/bar'
    }

}
