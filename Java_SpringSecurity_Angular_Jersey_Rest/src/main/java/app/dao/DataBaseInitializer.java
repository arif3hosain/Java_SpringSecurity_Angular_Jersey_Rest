package app.dao;

import java.util.Date;

import app.dao.UmsRoleMst.UmsRoleMstDao;
import app.dao.newsentry.NewsEntryDao;
import app.dao.user.UserDao;
import app.domain.UmsRoleMst;
import app.entity.NewsEntry;
import org.springframework.security.crypto.password.PasswordEncoder;

import app.entity.Role;
import app.entity.User;


/**
 * Initialize the database with some test entries.
 *
 * @author Philip W. Sorst <philip@sorst.net>
 */
public class DataBaseInitializer
{

	private NewsEntryDao newsEntryDao;

	private UserDao userDao;
	private UmsRoleMstDao umsRoleMstDao;

	private PasswordEncoder passwordEncoder;


	protected DataBaseInitializer()
	{
		/* Default constructor for reflection instantiation */
	}

	public DataBaseInitializer(UserDao userDao, NewsEntryDao newsEntryDao, PasswordEncoder passwordEncoder)
	{
		this.userDao = userDao;
		this.newsEntryDao = newsEntryDao;
		this.passwordEncoder = passwordEncoder;
	}

	public void initDataBase()
	{
//		System.out.print(">>>>>>>>>>>>>>>>>>>"+1);
//		User userUser = new User("user", this.passwordEncoder.encode("user"), "arif3hosain@gmail.com");
//		userUser.addRole(Role.USER);
//
//		this.userDao.save(userUser);
//		System.out.print(">>>>>>>>>>>>>>>>>>>"+2);
//
//		User adminUser = new User("admin", this.passwordEncoder.encode("admin"), "arif3hosain@gmail.com");
//		adminUser.addRole(Role.ADMIN);
//		this.userDao.save(adminUser);
//
//		Long l=new Long(5);

//		System.out.print(">>>>>>>>>>>>>>>>>>>Role..................."+l);
//		UmsRoleMst umsRoleMst=new UmsRoleMst(l,"ROLE_ADMIN", "1");
//		this.umsRoleMstDao.save(umsRoleMst);
//		System.out.print(">>>>>>>>>>>>>>>>>>>Role ..................");

//		System.out.print(">>>>>>>>>>>>>>>>>>>"+1);
//		long timestamp = System.currentTimeMillis() - (1000 * 60 * 60 * 24);
//		for (int i = 0; i < 10; i++) {
//			NewsEntry newsEntry = new NewsEntry();
//			newsEntry.setContent("This is example content " + i);
//			newsEntry.setDate(new Date(timestamp));
//			this.newsEntryDao.save(newsEntry);
//			timestamp += 1000 * 60 * 60;
//		}
	}
}