/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptwitter;

import java.util.List;
import twitter4j.*;

/**
 *
 * @author aparcerozas
 */
public class AppTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        //Realizar un tuit
        Twitter twitter = TwitterFactory.getSingleton();
        Status st = twitter.updateStatus("Ocupado");
        System.out.println("Successfully updated the status to [" + st.getText() + "].");
        
        //Traer la línea de tiempo
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" + status.getText());
        }
        
        //Filtrado
        Query query = new Query("source:twitter4j yusukey");
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
    
}
