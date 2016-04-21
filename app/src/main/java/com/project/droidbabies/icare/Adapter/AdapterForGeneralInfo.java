package com.project.droidbabies.icare.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.project.droidbabies.icare.Model.GeneralInformationModel;
import com.project.droidbabies.icare.R;

import java.util.ArrayList;

/**
 * Created by Sumon on 4/21/2016.
 */
public class AdapterForGeneralInfo extends ArrayAdapter<GeneralInformationModel> {

    ArrayList<GeneralInformationModel> generalInformationModel;
    Context context;

    public AdapterForGeneralInfo(Context context, ArrayList<GeneralInformationModel> generalInformationModelArrayList) {
        super(context, R.layout.custom_row_for_generalhealthinfo, generalInformationModelArrayList);
        this.context = context;
        this.generalInformationModel = generalInformationModelArrayList;
    }

    static class ViewHolder {
        TextView infoTitleTV, infoDescriptionTV, infocollectedFromTV;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_row_for_generalhealthinfo, null);
            viewHolder = new ViewHolder();
            viewHolder.infoTitleTV = (TextView) convertView.findViewById(R.id.infoTitleTV);
            viewHolder.infoDescriptionTV = (TextView) convertView.findViewById(R.id.infoDescriptionTV);
            viewHolder.infocollectedFromTV = (TextView) convertView.findViewById(R.id.infocollectedFromTV);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.infoTitleTV.setText(generalInformationModel.get(position).getTitle());
        viewHolder.infoDescriptionTV.setText(generalInformationModel.get(position).getDescription());
        viewHolder.infocollectedFromTV.setText(generalInformationModel.get(position).getCollectedFrom());
        viewHolder.infocollectedFromTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=generalInformationModel.get(position).getCollectedFrom();
                Intent visitIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                context.startActivity(visitIntent);
            }
        });
        return convertView;
    }
}
