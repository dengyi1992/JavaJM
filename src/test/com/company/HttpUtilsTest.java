package test.com.company; 

import com.company.HttpUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static com.company.HttpUtils.doGet;

/** 
* HttpUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>七月 31, 2016</pre> 
* @version 1.0 
*/ 
public class HttpUtilsTest {

    private HttpUtils httpUtils;

    @Before
public void before() throws Exception {
        httpUtils = new HttpUtils();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: DoPost(String posturl, String postjson) 
* 
*/ 
@Test
public void testDoPost() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: doPostAsy(String posturl, String postjson, CallBack callBack) 
* 
*/ 
@Test
public void testDoPostAsy() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: doGet(String url) 
* 
*/ 
@Test
public void testDoGet() throws Exception {
//TODO: Test goes here...
    System.out.println(doGet("http://baidu.com"));
} 

/** 
* 
* Method: doGetWithHeaders(String url, HashMap<String, String> headers) 
* 
*/ 
@Test
public void testDoGetWithHeaders() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: onRequestComplete(String result) 
* 
*/ 
@Test
public void testOnRequestComplete() throws Exception { 
//TODO: Test goes here... 
} 


} 
