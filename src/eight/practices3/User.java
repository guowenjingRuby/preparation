package eight.practices3;

import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String password;
    private Date birthday;
    private String telNumber;
    private String email;

    public User(){}

    public User(String userName, String password, Date birthday, String telNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if(userName==null){
            if(user.userName!=null){
                return false;
            }
        } else if (!userName.equals(user.userName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }
}
