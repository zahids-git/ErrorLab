package com.errorlab.Fragements;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.errorlab.R;
import com.errorlab.adapter.PostMainAdapter;

/**
 * Created by Md.Zahidul on 05-Sep-15.
 */
public class PostView extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.post, container, false);
        new Thread(new Runnable() {
            @Override
            public void run() {
            final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.postView);
            getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    PostMainAdapter adapter = new PostMainAdapter(getActivity());
                    SpacesItemDecoration decoration = new SpacesItemDecoration(20);
                    recyclerView.addItemDecoration(decoration);
                    recyclerView.setAdapter(adapter);
                    }
                }
            );
            }
        }).start();
        return view;
    }
}
