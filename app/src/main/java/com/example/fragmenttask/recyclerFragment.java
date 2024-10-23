package com.example.fragmenttask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class recyclerFragment extends Fragment {




    public static RecyclerView rec;
    public static   RecyclerView.Adapter adapter;
    public static RecyclerView.LayoutManager manager;



    public recyclerFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_recycler,container,false);
        rec=view.findViewById(R.id.List);
        rec.setHasFixedSize(true);
        manager=new LinearLayoutManager(this.getActivity());
        return view;
    }
}