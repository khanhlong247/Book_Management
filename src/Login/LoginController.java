package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Login.UserDao;
import Login.User;
import GUI.Giaodien;
import Login.LoginView;

public class LoginController {
    private UserDao userDao;
    private LoginView loginView;
    
    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }
    
    public void showLoginView() {
        loginView.setVisible(true);
    }
    
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
                Giaodien giaodien = new Giaodien();
                giaodien.setVisible(true);
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }
}


