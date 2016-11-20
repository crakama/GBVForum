package com.dadaabs.mreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_mainscreen;
    LinearLayoutManager nwlinearLayoutManager;
    ReportAdapter reportAdapter;
    private List<ReportModel> reportModelList = new ArrayList<>();

    public static final String TOWNS = "MainModel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        townsInfo();
        prepareRepartData();
    }


    public void townsInfo() {
        nwlinearLayoutManager = new LinearLayoutManager(this);
        reportAdapter = new ReportAdapter(reportModelList);
        rv_mainscreen =(RecyclerView) findViewById(R.id.rv_reportOptions);
        rv_mainscreen.setLayoutManager(nwlinearLayoutManager);
        rv_mainscreen.setAdapter(reportAdapter);
        rv_mainscreen.addOnItemTouchListener(new ReportItemClickListener(getApplicationContext(),
                new ReportItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int i) {
                switch (i) {
                    case 0:
                        openReportIncidentActivity();
                        break;
                    case 1:
                       // Toast.makeText(view.getContext(), "POSITION" + i, Toast.LENGTH_LONG).show();
                        openJoinChatActivity();

                        break;
                    case 2:
                        // Toast.makeText(view.getContext(), "POSITION" + i, Toast.LENGTH_LONG).show();
                        openAffectedAreasActivity();
                        break;
                }
            }
        }));
    }

    private void openReportIncidentActivity() {
        Intent reportIntent = new Intent( MainActivity.this, ReportIncidentActivity.class);
        startActivity(reportIntent);
    }

    private void openJoinChatActivity() {
        Intent reportIntent = new Intent(MainActivity.this, ReportIncidentActivity.class);
        startActivity(reportIntent);
    }

    private void openAffectedAreasActivity() {
        Intent reportIntent = new Intent( MainActivity.this, ReportIncidentActivity.class);
        startActivity(reportIntent);
    }



    private void prepareRepartData() {
        ReportModel model = new ReportModel("Question & Answer Forum", R.drawable.faqbold);
        reportModelList.add(model);

        model = new ReportModel("Find Help on GBV Case",R.drawable.helpinghand);
        reportModelList.add(model);

        model = new ReportModel("What is GBV ? ",R.drawable.about);
        reportModelList.add(model);

        model = new ReportModel("Participants Mapping ",R.drawable.mapmarker);
        reportModelList.add(model);

    }
}

