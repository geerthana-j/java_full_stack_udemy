package org.studyeasy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.studyeasy.model.GoogleToken;
import org.studyeasy.model.RequestTokenParams;
import org.studyeasy.model.User;

@WebServlet("/success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String client_id = "384157246601-a7ur95inteil30etlrgetdkdr98jnc32.apps.googleusercontent.com";
	private static String client_secret = "hIDwiKoG1UJWVeHdsRt-JaF4";
	private static Client client = ClientBuilder.newClient();
	WebTarget GoogleTokenServer = client.target("https://www.googleapis.com/oauth2/v4/token");

	public Success() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Step 2
		String code = request.getParameter("code");
		String redirect_uri = "http://localhost:8080/S07-GoogleOAuth/success", grant_type = "authorization_code";
		RequestTokenParams requestTokenParams = new RequestTokenParams(code, client_id, client_secret, redirect_uri,
				grant_type);
		Response tokenInJson = GoogleTokenServer.request().post(Entity.json(requestTokenParams));
		GoogleToken googleToken = tokenInJson.readEntity(GoogleToken.class);
		//Step 3
		WebTarget googleUserInfoAPI = client
				.target("https://www.googleapis.com/oauth2/v2/userinfo?access_token=" + googleToken.getAccess_token());
		Response userInfo = googleUserInfoAPI.request().get();
	    User user =  userInfo.readEntity(User.class);
	    request.setAttribute("User", user);
	    request.getRequestDispatcher("DisplayUserInfo.jsp").forward(request, response);
	


	}

}
