package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.SsoLoginForm;

public class SsoLoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse response) throws Exception {

		String loginid = req.getParameter("loginId");
		// このあと、このログインIDでOKかどうかをチェックする
		SsoLoginForm ssologinform = (SsoLoginForm) form;


//		HttpSession session = req.getSession();
//		session.setAttribute("sso", "true");
//		session.setAttribute("loginId", loginid);
		req.setAttribute("sso", "true");
		req.setAttribute("loginId", loginid);


		return mapping.findForward("success");
	}
}
