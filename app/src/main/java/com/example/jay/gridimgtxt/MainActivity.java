package com.example.jay.gridimgtxt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    private ArrayList<Integer> mApi;
    private ArrayList<String> mtitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) findViewById(R.id.lv_main);

        mApi = new ArrayList<>();
        mtitle = new ArrayList<>();

        mApi.add(R.drawable.gingerbread);
        mApi.add(R.drawable.honeycombbee);
        mApi.add(R.drawable.icecreamsandwich);
        mApi.add(R.drawable.jellybean);
        mApi.add(R.drawable.kitkat);
        mApi.add(R.drawable.lollipop);

        mtitle.add("Gingerbread");
        mtitle.add("Honeycomb");
        mtitle.add("Icecreamsandwich");
        mtitle.add("Jellybean");
        mtitle.add("Kitkat");
        mtitle.add("Lollipop");

        mGridView.setAdapter(new MyAdapter());


    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mApi.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            View rowview;

            if(convertView != null)
            {
                rowview=convertView;
            }

            else
            {
                rowview = getLayoutInflater().inflate(R.layout.imgtxtview_row, parent, false);
            }

            ImageView GoogleApi = (ImageView) rowview.findViewById(R.id.api_list);
            GoogleApi.setImageResource(mApi.get(i));

            TextView TitleApi = (TextView) rowview.findViewById(R.id.title_list);
            TitleApi.setText(mtitle.get(i));

            return rowview;
        }


    }
}
