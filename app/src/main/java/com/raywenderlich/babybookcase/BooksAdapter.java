package com.raywenderlich.babybookcase;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BooksAdapter extends BaseAdapter{
    private final Context mContext;
    private final Book[] books;

    // constructor ti instantiate a BooksAdapter
    public BooksAdapter(Context context, Book[] books) {
        this.mContext = context;
        this.books = books;
    }

    // return the number of cells to render here
    @Override
    public int getCount() {
        return books.length;
    }

    // it should return an id instead return 0 for this tutorial
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // idem, but instead return null
    public Object getItem(int position) {
        return null;
    }

    // return a dummy TextView as the cell view for GridView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));

        return dummyTextView;
    }
}
