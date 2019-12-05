package concretes;

import abstracts.SocialMediaClient;

public class TwitterClient implements SocialMediaClient {

	@Override
	public void authenticate(String user, String password) {
		System.out.println("Autenticado com Twitter!");
	}

	@Override
	public void post(String message) {
		System.out.println("[Twitter] - " + message);
	}
}
