package com.errorlab.Fragements;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.errorlab.R;
import com.errorlab.adapter.EventPageAdapter;

import java.util.ArrayList;

/**
 * Created by Md.Zahidul on 06-Sep-15.
 */
public class EventPage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_adapter, container, false);

        ArrayList<String> date = new ArrayList<String>();
        date.add("");
        date.add("");
        date.add("");
        date.add("");
        date.add("");
        date.add("");
        date.add("");

        ListView listView = (ListView) view.findViewById(R.id.eventListView);
        EventPageAdapter eventPageAdapter = new EventPageAdapter(getActivity(),date);
        listView.setAdapter(eventPageAdapter);
        return view;
    }
}
