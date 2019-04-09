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
    public Twitter instanciarCB(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey("m4fc10McSLVNE4iPlEewWLhPK")
            .setOAuthConsumerSecret("B6uxoTQ3SZIcMdktj1yrD95ioepbLCU4sw2jPKKWtCxusEBVDC")
            .setOAuthAccessToken("1663520359-SsYceowur6Z6e7plVunxGBtiLeRPWtAqj3rRtEk")
            .setOAuthAccessTokenSecret("ZJGNCvOwBtIQROKuEN287qpmuq8Qrtv3yqJIVhsNakbrV");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }
}
