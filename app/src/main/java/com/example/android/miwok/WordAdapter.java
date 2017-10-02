package com.example.android.miwok;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Trim on 10/1/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int color;
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int color) {
        super(context, 0,objects);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);
        TextView textView1 = (TextView)listItemView.findViewById(R.id.text1_view);
        textView1.setText(word.getMiwokTranslation());

        TextView textView2 = (TextView)listItemView.findViewById(R.id.text2_view);
        textView2.setText(word.getDefaultTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);

        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.text_layout);
        linearLayout.setBackgroundColor(this.color);
        if(word.hasImage()){
            Uri imgUri=Uri.parse("android.resource://com.example.android.miwok/"+word.getImageUri());
            imageView.setImageURI(null);
            imageView.setImageURI(imgUri);
        }else{
            imageView.setVisibility(View.GONE);
        }


        return listItemView;


    }
}
