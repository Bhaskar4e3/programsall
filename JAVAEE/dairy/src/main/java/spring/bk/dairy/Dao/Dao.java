package spring.bk.dairy.Dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.bk.dairy.Entities.User;
@Component
public class Dao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional(readOnly = false)
	public void save(User user) {
		hibernateTemplate.save(user);
		
	}
//public void update() {
//	hibernateTemplate.update();
		
	//}
//public void delete(User user) {
//	hibernateTemplate.delete(user);
//	
//}
	@Transactional(readOnly = false)
public List<User> findAll() {
 return	hibernateTemplate.loadAll(User.class);
	}
	public User getByString(String username) {
		User user1=null;
		DetachedCriteria criteria=DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("username", username));
		
		try {
			
			user1=(User)hibernateTemplate.findByCriteria(criteria).get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user1;
		
	}


}
