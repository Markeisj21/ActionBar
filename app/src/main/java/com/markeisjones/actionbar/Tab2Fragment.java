package com.markeisjones.actionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Fragment 2";

    private ListView mListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);

        mListView = (ListView) view.findViewById(R.id.listView);

        ArrayList<CardModel> list = new ArrayList<>();
        list.add(new CardModel("drawable://" + R.drawable.cafecircaatlfs, "Atl"));
        list.add(new CardModel("drawable://" + R.drawable.diegosunset, "SD"));
        list.add(new CardModel("drawable://" + R.drawable.projectclubla, "LA"));
        list.add(new CardModel("drawable://" + R.drawable.vegasdraisbeachclub, "Vegas"));
        list.add(new CardModel("drawable://" + R.drawable.washingtondcrosebar, "D.C."));
        list.add(new CardModel("drawable://" + R.drawable.sandiegonightsky, "SD"));


        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.card_view_layout, list);
        mListView.setAdapter(adapter);


        return view;
    }
}
