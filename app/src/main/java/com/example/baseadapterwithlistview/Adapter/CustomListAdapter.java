package com.example.baseadapterwithlistview.Adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.baseadapterwithlistview.Model.Item;
import com.example.baseadapterwithlistview.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> items;

    public CustomListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();//returns total no of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);//returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        //inflate the layout for each list row
//        if (convertView == null){
//            convertView = LayoutInflater.from(context).
//                    inflate(R.layout.custom_list_view, parent, false);
//        }
//
//        //get current item to be displayed
//        Item currentItem = (Item) getItem(position);
//
//        //get the TextView for item name and item description
//        TextView textViewItemName = (TextView) convertView.findViewById(R.id.tv_name);
//        TextView textViewItemDescription = (TextView) convertView.findViewById(R.id.tv_position);
//
//        //sets the text for item name and item description from the current item object
//        textViewItemName.setText(currentItem.getItemName());
//        textViewItemDescription.setText(currentItem.getItemDescription());
//
//        //returns the view for the current row
//        return convertView;


        //inflate the layout for each list row
        if (convertView == null){
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.custom_list_view, parent, false);
        }

        //get current item to be displayed
        Item currentItem = (Item) getItem(position);

        //get the TextView for item name and item description
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.tv_name);
        TextView textViewItemDescription = (TextView) convertView.findViewById(R.id.tv_position);

        //sets the text for item name and item description from the current item object
        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());

        //returns the view for the current row
        return convertView;
    }
}
