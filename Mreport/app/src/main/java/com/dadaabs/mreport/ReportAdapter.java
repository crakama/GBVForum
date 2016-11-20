package com.dadaabs.mreport;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by crakama on 11/18/2016.
 */

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ReportVH> {
    private Context mcontext;
    private List<ReportModel> reportList;
    public class ReportVH extends RecyclerView.ViewHolder{
        private TextView main_cv_title;
        private ImageView main_cv_img;

        public ReportVH(View itemView) {
            super(itemView);
            main_cv_img = (ImageView) itemView.findViewById(R.id.cv_img_reportOptn);
            main_cv_title = (TextView) itemView.findViewById(R.id.txttown_name);
        }
    }

    public ReportAdapter(List<ReportModel> repartList){
        this.reportList = repartList;
    }
    @Override
    public ReportVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View rv_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_cv,parent,false);
        return new ReportVH(rv_view);
    }
    @Override
    public void onBindViewHolder(ReportVH holder, int position) {
        ReportModel reportModel = reportList.get(position);
        holder.main_cv_img.setImageResource(reportModel.getRepimage());
        holder.main_cv_title.setText(reportModel.getTitle());

    }
    @Override
    public int getItemCount() {
        return reportList.size() ;
    }

}
