package unlp.oo2.ejercicio1;

public class Retweet {
	private Tweet tweetFuente;
	
	public Retweet(Tweet tweetFuente) {
		this.tweetFuente = tweetFuente;
	}
	
	public boolean existeReferencia() {
		return (tweetFuente != null);
	}
}
