package orm;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class OrmRun {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		//ICatDao catDao = (ICatDao) factory.getBean("catDao");
		ICatService is = (ICatService) factory.getBean("catSv");

		Cat cat = new Cat();
		cat.setName("=====Hello Kitty");
		cat.setCreatedDate(new Date());

		is.createCat(cat);

		List<Cat> catList = is.listCats();

		//Cat cat2 = catDao
		for (Cat c : catList) {
			System.out.println("Name: " + c.getName());
		}

	}

}
