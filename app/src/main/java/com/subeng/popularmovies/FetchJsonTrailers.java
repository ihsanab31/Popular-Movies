package com.subeng.popularmovies;

import com.subeng.FetchJson;

import org.json.JSONObject;

/**
 * Created by ihsan on 12/07/16.
 */
public class FetchJsonTrailers extends FetchJson {

    public FetchJsonTrailers(Object listener, String url) {
        super(listener, url);
    }

    @Override
    protected void onPostExecute(JSONObject fetchedJson) {
        ((FetchJsonTrailersListener)listener).onFetchedJsonTrailers(fetchedJson);
    }

    public interface FetchJsonTrailersListener{
        void onFetchedJsonTrailers(JSONObject fetchedJsonTrailers);
    }
}
