package test.com.company; 

import com.company.Init;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Iterator;

/** 
* Init Tester. 
* 
* @author <Authors name> 
* @since <pre>七月 31, 2016</pre> 
* @version 1.0 
*/ 
public class InitTest { 

@Before
public void before() throws Exception {
    Init.init();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: init() 
* 
*/ 
@Test
public void testInit() throws Exception { 
//TODO: Test goes here...

} 

/** 
* 
* Method: getUserList() 
* 
*/ 
@Test
public void testGetUserList() throws Exception { 
//TODO: Test goes here...
    Iterator<HashMap<String, String>> iterator = Init.getUserList().iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next().toString());
    }
} 


} 
