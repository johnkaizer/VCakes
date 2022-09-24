package com.project.vcakes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.vcakes.Adapter.NewsFeedAdapter;
import com.project.vcakes.Adapter.UpcomingAdapter;
import com.project.vcakes.Model.NewsFeedModel;
import com.project.vcakes.Model.UpcomingModel;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    RecyclerView newsFeedRec;
    NewsFeedAdapter newsFeedAdapter;
    ArrayList<NewsFeedModel> newsFeedModelList;
    LinearLayoutManager layoutManager;

    //upcoming
    RecyclerView upcomingRec;
    UpcomingAdapter upcomingAdapter ;
    ArrayList<UpcomingModel> upcomingModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        newsFeedRec = root.findViewById(R.id.offers);
        newsFeedModelList = new ArrayList<>();

        newsFeedModelList.add(new NewsFeedModel(R.drawable.cakes,"KSH 110","First come first served!!"));
        newsFeedModelList.add(new NewsFeedModel(R.drawable.vanilla,"KSH 110","Launching new flavours on Tuesday make orders"));
        newsFeedModelList.add(new NewsFeedModel(R.drawable.weddd,"KSH 110","Make orders... Pochi La Biashara"));
        newsFeedModelList.add(new NewsFeedModel(R.drawable.cakes,"KSH100@","Offers!! offers!! Buy 1pkt get 2 pcs free!!"));


        newsFeedAdapter = new NewsFeedAdapter(getActivity(), newsFeedModelList, this);
        newsFeedRec.setAdapter(newsFeedAdapter);
        newsFeedRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        newsFeedRec.setHasFixedSize(true);
        newsFeedRec.setNestedScrollingEnabled(false);
        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        newsFeedRec.setLayoutManager(layoutManager);

        LinearSnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(newsFeedRec);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (layoutManager.findFirstCompletelyVisibleItemPosition() < (newsFeedAdapter.getItemCount() -1)){
                    layoutManager.smoothScrollToPosition(newsFeedRec,new RecyclerView.State(),layoutManager.findFirstCompletelyVisibleItemPosition() + 1);
                }else if (layoutManager.findFirstCompletelyVisibleItemPosition() == (newsFeedAdapter.getItemCount() -1 )){
                    layoutManager.smoothScrollToPosition(newsFeedRec,new RecyclerView.State(),0);
                }

            }
        },0,3000);


        //Upcoming
        upcomingRec = root.findViewById(R.id.upcoming_bakes);
        upcomingModelList = new ArrayList<>();

        upcomingModelList.add(new UpcomingModel(R.drawable.cakes,"25th Sept 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.cakes,"27th Sept 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.vanilla,"29th Sept 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.cakes,"30th Sept 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.vanilla,"2nd 0ct 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.cakes,"4th 0ct 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.vanilla,"8th 0ct 2022"));
        upcomingModelList.add(new UpcomingModel(R.drawable.cakes,"10th 0ct 2022"));


        upcomingAdapter = new  UpcomingAdapter(getActivity(), upcomingModelList, this);
        upcomingRec.setAdapter(upcomingAdapter);
        upcomingRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));
        upcomingRec.setHasFixedSize(true);
        upcomingRec.setNestedScrollingEnabled(false);





        return  root;
    }
}