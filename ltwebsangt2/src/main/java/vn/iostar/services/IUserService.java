package vn.iostar.services;
import vn.iostar.models.UserModel;
public interface IUserService {
	UserModel findByUserName(String username);
	UserModel login(String username, String password);
}
