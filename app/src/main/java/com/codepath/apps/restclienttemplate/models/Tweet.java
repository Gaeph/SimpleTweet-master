package com.codepath.apps.restclienttemplate.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Tweet {
    private static JSONObject jsonObject;
    public String body;
public String createAd;
public User user;

public static Tweet fromJson(JSONObject jsonObject) throws JSONException {

    Tweet tweet = new Tweet();
    tweet.body = jsonObject.getString("text");
    tweet.createAd = jsonObject.getString("created_Ad");
    tweet.user = User.fromJson(jsonObject.getJSONObject("User"));
    return tweet;

}
public static List<Tweet> fromJsonArray(JSONArray jsonArray) throws JSONException {
List<Tweet> tweets = new ArrayList<>();
for(int i=0; i < jsonArray.length(); i++){
tweets.add(fromJson(jsonArray.getJSONObject(i)));
}
 return  tweets;
}


}
