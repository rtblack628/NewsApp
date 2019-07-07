package com.example.android.newsapp;

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {

    /** Headline of the news article*/
    private String mHeadline;

    /** Byline for the news article*/
    private String mByline;

    /** Publication date of the news article*/
    private String mPublication;

    /** Trail text of the news article */
    private String mTrailText;

    /** Website URL of the news article */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param headline is the headline of the news article
     * @param byline is the byline for the news article
     * @param publication is the publication date of the news article
     * @param trailText is the trail text of the news article
     * @param url is the URL of the news article
     */
    public News(String headline, String byline, String publication, String trailText, String url) {
        mHeadline = headline;
        mByline = byline;
        mPublication = publication;
        mTrailText = trailText;
        mUrl = url;
    }

    /**
     * Returns the headline of the news article.
     */
    public String getHeadline() {
        return mHeadline;
    }

    /**
     * Returns the byline of the news article.
     */
    public String getByline() {
        return mByline;
    }

    /**
     * Returns the publication date of the news article.
     */
    public String getPublication() {
        return mPublication;
    }

    /**
     * Returns the trail text of the news article.
     */
    public String getTrailText() {
        return mTrailText;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}
