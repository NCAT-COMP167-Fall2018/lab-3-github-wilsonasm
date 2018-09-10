/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        Scanner handle=new Scanner(System.in);
        System.out.println("What's your name, tweeter?");
        String tweeterName = handle.nextLine();

        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        newTweet(tweets, tweeterName);
        System.out.println("Your twitter feed is full");
    }
    
   public static String getCurrentTimeStamp(){
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("  yyyy-MM-dd HH:mm:ss.SSSZ");
            return dateFormat.format(now);
    }
   public static void newTweet(String[] tweets, String tweeterName){
       Scanner scnr= new Scanner(System.in);
       System.out.println("Welcome to your personal Twitter!");
       int numTweets=0;
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            Scanner keyboard=new Scanner(System.in);
            tweets[numTweets] = keyboard.nextLine() + getCurrentTimeStamp();

            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i]);
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            if(numTweets < (MAX_NUMBER_TWEETS - 1)){
                System.out.println("Enter your next tweet:");
        }

        numTweets++;
        }

}
}
