package ro.iteahome.bikesharing.service;


import ro.iteahome.bikesharing.dao.UserDAO;
import ro.iteahome.bikesharing.exception.BikeSharingException;
import ro.iteahome.bikesharing.exception.BikeSharingUserAlreadyExistsException;
import ro.iteahome.bikesharing.exception.BikeSharingWrongCredentialsException;
import ro.iteahome.bikesharing.model.User;

public class UserService {

    private UserDAO userDao= new UserDAO();

    public User login(String inputEmail, String inputPassword) throws BikeSharingException {
        for (User user: userDao.readAllUsers()) {
            if (inputEmail.equals(user.getEmail()) && inputPassword.equals(user.getPassword())) {
                return user;
            }
        }
        throw new BikeSharingWrongCredentialsException();
    }

    public void signUp(User newUser) throws BikeSharingException {

        for (User user: userDao.readAllUsers()) {
            if (newUser.getEmail().equals(user.getEmail())) {
                throw new BikeSharingUserAlreadyExistsException();
            }
        }

        userDao.writeUser(newUser);
    }
}
