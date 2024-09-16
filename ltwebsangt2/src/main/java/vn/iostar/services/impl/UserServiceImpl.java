package vn.iostar.services.impl;
import vn.iostar.dao.IUserDao;
import vn.iostar.dao.impl.UserDaoImpl;
import vn.iostar.models.UserModel;
import vn.iostar.services.IUserService;

public class UserServiceImpl implements IUserService {
	IUserDao userDao = new UserDaoImpl();
	
	public UserModel findByUserName(String username) {
		return userDao.findByUsername(username);
		
	}
	
	public UserModel login(String username, String password) {
		UserModel user = this.findByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
				return user;
			}
			return null;
	}
	public static void main(String[] args) {
		try {
			IUserService userServie = new UserServiceImpl();
			System.out.println(userServie.login("nghia", "123"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
