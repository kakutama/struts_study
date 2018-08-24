package form;

import org.apache.struts.action.ActionForm;

public class AuthenticationForm extends ActionForm {

    //(2)値を保持する変数の宣言
    private String id;
    private String pass;

    //(3)値を操作するアクセスメソッドの宣言
    public void setId(String id) {this.id = id;}
    public String getId() {return id;}
    public void setPass(String pass) {this.pass = pass;}
    public String getPass() {return pass;}
}
