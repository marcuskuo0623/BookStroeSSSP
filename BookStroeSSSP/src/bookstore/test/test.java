package bookstore.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	private ApplicationContext ctx = null;
	{
		ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
	}

	@Test
	public void testData() throws SQLException {
		DataSource da = ctx.getBean(DataSource.class);
		System.out.println(da.getConnection());
	}

}
