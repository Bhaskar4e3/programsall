package spring.bk.dairy.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.bk.dairy.Dao.Dao;
import spring.bk.dairy.Entities.User;
@Component
public class Business {
	@Autowired
	private Dao dao;
		
		public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
		public void save(User user) {
			
			dao.save(user);
			
		}
//	public void update() {
//			dao.update();
//		}
//	public void delete(User user) {
//		dao.delete(user);;
//		
//	}
	public List<User> getAll() {
		return dao.findAll();
		
		
	}
	public User getByString(String username) {
		
		User user1=dao.getByString(username);
		return user1;
		
	}

	}
	
