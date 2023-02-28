package com.example.baseadapterwithlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.baseadapterwithlistview.Adapter.CustomListAdapter;
import com.example.baseadapterwithlistview.Model.Item;
import com.example.baseadapterwithlistview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        populateUsersList();
    }

    private void populateUsersList() {
        ArrayList<Item> items = Item.getItems();
        CustomListAdapter adapter = new CustomListAdapter(this, items);
        b.listView.setAdapter(adapter);
    }
}