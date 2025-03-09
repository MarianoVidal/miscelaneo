package unlp.oo2.ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	private List<Retweet> retweets;
	private RetweetHandler manejadorRetweets;
	
	public Usuario(String screenName, RetweetHandler manejadorRetweets) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
		this.retweets = new ArrayList<Retweet>();
		this.manejadorRetweets = manejadorRetweets;
	}
	
	// Métodos públicos
	public Tweet publicar(String contenido) {
		Tweet tweet = new Tweet();
		
		if (tweet.establecerContenido(contenido)) {
			tweets.add(tweet);
			return tweet;
		}
		
		return null;
	}
	
	public void republicar(Tweet tweet) {
		Retweet retweet = new Retweet(tweet);
		this.retweets.add(retweet);
	}
	
	public void eliminarTweet(Tweet tweet) {
		this.tweets.remove(tweet);
		this.manejadorRetweets.buscarDesreferenciados();
	}
	
	public void eliminarRetweet(Retweet retweet) {
		this.retweets.remove(retweet);
	}
	
	public String getScreenName() { return this.screenName; }
	public List<Tweet> getTweets() { return this.tweets; }
	public List<Retweet> getRetweets() { return this.retweets; }
}
