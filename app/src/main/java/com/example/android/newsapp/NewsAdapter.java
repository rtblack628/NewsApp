package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * A {@link NewsAdapter} knows how to create a list item layout for each news item
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news items, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news item at the given position
     * in the list of news items.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID magnitude
        TextView headlineView = (TextView) listItemView.findViewById(R.id.headline);
        // Display the headline of the current news item in that TextView
        headlineView.setText(currentNews.getHeadline());

        // Find the TextView with view ID byline
        TextView bylineView = (TextView) listItemView.findViewById(R.id.byline);
        // Display the byline of the current news item in that TextView
        bylineView.setText(currentNews.getByline());

        // Find the TextView with view ID publication
        TextView publicationView = (TextView) listItemView.findViewById(R.id.publication);
        // Display the publication date of the current news item in that TextView
        bylineView.setText(currentNews.getPublication());

        // Find the TextView with view ID trail_text
        TextView trailTextView = (TextView) listItemView.findViewById(R.id.trail_text);
        // Display the trail text of the current news item in that TextView
        bylineView.setText(currentNews.getTrailText());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
