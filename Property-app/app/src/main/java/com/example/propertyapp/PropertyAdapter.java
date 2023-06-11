package com.example.propertyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.ViewHolder> {
    Context context;
    ArrayList<Property> pList;


    public PropertyAdapter(Context context, ArrayList<Property> pList) {
        this.context = context;
        this.pList = pList;
    }

    @NonNull
    @Override
    public PropertyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View rowPropertyView = layoutInflater.inflate(R.layout.row_property_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(rowPropertyView);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.ViewHolder holder, int position) {

        Property pp = pList.get(position);
        int resId = context.getResources().getIdentifier(context.getPackageName() + ":drawable/" + pp.getImages(), null, null);
        holder.imageView.setImageResource(resId);
        holder.txtAddress.setText(pp.getAddress());
        holder.txtRent.setText(pp.getRent());
        holder.txtBedrooms.setText(pp.getBedrooms());
        holder.txtCarParks.setText(pp.getCarparks());
        holder.txtBathrooms.setText(pp.getBathrooms());

    }


    @Override
    public int getItemCount() {

        if (pList == null) return 0;
        return pList.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtAddress, txtRent, txtBedrooms, txtCarParks, txtBathrooms;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgSet);
            txtAddress = itemView.findViewById(R.id.txt_pAddress);
            txtRent = itemView.findViewById(R.id.txt_rentPW);
            txtBedrooms = itemView.findViewById(R.id.txt_bedrooms);
            txtCarParks = itemView.findViewById(R.id.txt_carParks);
            txtBathrooms = itemView.findViewById(R.id.txt_bathRooms);
        }
    }

}
