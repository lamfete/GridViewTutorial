package com.raywenderlich.babybookcase;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
        // find the proper book for this cell by using the position index
        final Book book = books[position];

        /* if convertview is null, insantiate a new cell view by using Layout Inflater
         *
         */
        if(convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_book, null);
        }

        //create references for each individual view that created in xml layout
        final ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView) convertView.findViewById(R.id.textview_book_name);
        final TextView authorTextView = (TextView) convertView.findViewById(R.id.textview_book_author);
        final ImageView imageViewFavorite = (ImageView) convertView.findViewById(R.id.imageview_cover_art);


        // set the book's cover at
        imageView.setImageResource(book.getImageResource());
        nameTextView.setText(mContext.getString(book.getName()));
        authorTextView.setText(mContext.getString(book.getAuthor()));

        return convertView;
    }
}
