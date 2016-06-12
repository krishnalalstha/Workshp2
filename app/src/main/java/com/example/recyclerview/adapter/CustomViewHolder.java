package com.example.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;

/**
 * Created by krishna on 6/12/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView txtTeamName;
    public ImageView teamLogo;

    public CustomViewHolder(View itemView) {
        super(itemView);
        txtTeamName = (TextView) itemView.findViewById(R.id.txtTeamName);
        teamLogo=(ImageView)itemView.findViewById(R.id.teamLogo);
    }
}
