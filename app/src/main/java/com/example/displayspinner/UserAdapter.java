package com.example.displayspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    Context context;
   List<UserPojo> userPojoList=new ArrayList<>();
    LayoutInflater layoutInflater;


    public UserAdapter(Context context, List<UserPojo> userPojoList) {
        this.context = context;
        this.userPojoList = userPojoList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View root=layoutInflater.inflate(R.layout.custom_spinner,null);
        ImageView cimg =root.findViewById(R.id.country_image);
        TextView cname=root.findViewById(R.id.country_name);
        TextView countrycapital=root.findViewById(R.id.displaycapital);

        cimg.setImageResource(userPojoList.get(i).getImage());
        cname.setText(userPojoList.get(i).getCountryname());
        countrycapital.setText(userPojoList.get(i).getCapital());
        return root;
    }
}
