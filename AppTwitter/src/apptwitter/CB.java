/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptwitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author aparcerozas
 */
public class CB {

    /**
     *
     * @return
     */
    public Twitter instanciarCB(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey("*********************")
            .setOAuthConsumerSecret("******************************************")
            .setOAuthAccessToken("**************************************************")
            .setOAuthAccessTokenSecret("******************************************");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }
}
