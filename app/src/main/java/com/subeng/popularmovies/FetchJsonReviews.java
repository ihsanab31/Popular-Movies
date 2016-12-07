package com.subeng.popularmovies;

import com.subeng.FetchJson;

import org.json.JSONObject;

/**
 * Created by ihsan on 12/05/16.
 */
public class FetchJsonReviews extends FetchJson {

    public FetchJsonReviews(Object listener, String url) {
        super(listener, url);
    }

    @Override
    protected void onPostExecute(JSONObject fetchedJson) {
        ((FetchJsonReviewsListener)listener).onFetchedJsonReviews(fetchedJson);
    }

    public interface FetchJsonReviewsListener{
        void onFetchedJsonReviews(JSONObject fetchedJsonReviews);
    }
}
