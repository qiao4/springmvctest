package orm;

import java.util.List;
//import org.springframework.web.servlet.DispatcherServlet;
public class CatServiceImpl implements ICatService {

	private ICatDao catDao;

	public ICatDao getCatDao() {
		return catDao;
	}

	public void setCatDao(ICatDao catDao) {
		this.catDao = catDao;
	}

	public void createCat(Cat cat) {

		if (catDao.findCatByName(cat.getName()) != null)
			throw new RuntimeException("è" + cat.getName() + "�Ѿ����ڡ�" );

		catDao.createCat(cat);
	}

	public int getCatsCount() {
		return catDao.getCatsCount();
	}

	public List<Cat> listCats() {
		return catDao.listCats();
	}

}
