package com.example.formula1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseExpandableListAdapter {
    //attributes
    private ArrayList<Profile> profiles;
    private Context context;
    private LayoutInflater inflater;

    public ListAdapter(ArrayList<Profile> profiles, Context context) {
        this.profiles = profiles;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    //Override instance methods
    @Override
    public int getGroupCount() {
        return this.profiles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.profiles.get(groupPosition).getTypeRecord().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return profiles.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return profiles.get(groupPosition).getTypeRecord().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(context);
        if (v==null)
            v = inflater.inflate(R.layout.profile_layout,null);
        ImageView ivPhoto = (ImageView)v.findViewById(R.id.ivPhoto);
        TextView tvName = (TextView)v.findViewById(R.id.tvName);
        TextView tvTeam = (TextView)v.findViewById(R.id.tvTeam);

        Profile p = profiles.get(groupPosition);
        ivPhoto.setImageDrawable(p.getPhoto());
        tvName.setText(p.getName());
        tvTeam.setText(p.getTeam());
        return v;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(context);
        if (v==null)
            v = inflater.inflate(R.layout.record_layout,null);
        ImageView ivIcon = (ImageView)v.findViewById(R.id.ivIcon);
        TextView tvType = (TextView)v.findViewById(R.id.tvType);
        TextView tvValue = (TextView)v.findViewById(R.id.tvValue);

        Record d = profiles.get(groupPosition).getTypeRecord().get(childPosition);
        ivIcon.setImageDrawable(d.getType().getIcon());
        tvType.setText(String.valueOf(d.getName()));
        tvValue.setText(String.valueOf(d.getType().getValue()));
        return  v;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
