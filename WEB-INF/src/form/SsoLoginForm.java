package form;

import org.apache.struts.action.ActionForm;

public class SsoLoginForm extends ActionForm {

    //(2)値を保持する変数の宣言
    private String userId;
    private String sso;

    //(3)値を操作するアクセスメソッドの宣言
    public void setUserId(String userId) {this.userId = userId;}
    public String getUserId() {return userId;}
	public String getSso() {
		return sso;
	}
	public void setSso(String sso) {
		this.sso = sso;
	}

}
