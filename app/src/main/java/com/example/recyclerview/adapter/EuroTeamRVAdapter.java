package com.example.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by krishna on 6/12/16.
 */
public class EuroTeamRVAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private ArrayList<String> teamList;



    public EuroTeamRVAdapter(ArrayList<String> list) {
        this.teamList = list;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        String teamName = teamList.get(position);
        holder.txtTeamName.setText(teamName);
        Picasso.with(holder.itemView.getContext()).load("http://www.theodora.com/flags/new12/uk-s.gif").into(holder.teamLogo);

    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }
}
