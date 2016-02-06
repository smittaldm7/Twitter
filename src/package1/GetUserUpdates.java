package package1;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

class Runner extends Thread
{
	public void run()
	{
		System.out.println("PArallel thread");
		try {
			sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Twitter account ->HonkyTonk
		Twitter twitter = new TwitterFactory().getInstance();
		
		twitter.setOAuthConsumer("vQe5Mqn7iJGI4kgZdCYdLm3RA",
				"2ctDx11tak2SRd5zFQMyzgg1AdCN827QHgpKxOdssMxhCJuC3g");
		twitter.setOAuthAccessToken( new AccessToken(
				"4838598882-Zm6wGMMCuWLySBtot3ntVp18Tw8TtkBjbNlp2UF",
				"aoqcEcr4xWhwwqBlkoztOxJEQAUPJa6TmIcDE4Zs4edtl") 
				);
		
		try {
			ResponseList<Status> statuses = twitter.getUserTimeline(new Paging(1,5));
			for(Status s:statuses)
			{
				System.out.println(s.getText());
			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		}
	}

public class GetUserUpdates {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start();
		
		System.out.println("MAin Thread");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Twitter account -> Sidharth
		Twitter twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer("3bDFWsM6FLIAjbf00yxLYGK07",
				"SrJ17tw5vRgRFWdgjJzdvve626YkeFjyTRalhKQAAWYbExutIt");
		twitter.setOAuthAccessToken( new AccessToken(
				"49551572-lYl72WzMdujwhlBzPYUQZo1saoy63L5Htbv8VSa33",
				"y0RaLolUiQxK5aFl0ELB57x4LXCSbHP4uOxAKSkocaAk9") 
				);
		
		try {
			ResponseList<Status> statuses = twitter.getUserTimeline(new Paging(1,5));
			for(Status s:statuses)
			{
				System.out.println(s.getText());
			}
		} catch (TwitterException e) {
			e.printStackTrace();
		}
		}
		

	}


