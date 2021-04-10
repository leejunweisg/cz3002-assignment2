package action;
import com.opensymphony.xwork2.ActionSupport;
import model.User;

public class VerifyLogin extends ActionSupport{
    String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        // call the authenticate method from the model
        if (User.authenticate(username,password)){
            return "SUCCESS";
        }else{
            return "FAILURE";
        }
    }
}
