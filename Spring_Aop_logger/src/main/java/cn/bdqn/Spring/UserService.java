package cn.bdqn.Spring;

public class UserService {
    private UserDaoImpl usi;

    public void setUsi(UserDaoImpl usi) {
        this.usi = usi;
    }
    public void addNewUser(User user){
        usi.addNewUser(user);
    }
}
