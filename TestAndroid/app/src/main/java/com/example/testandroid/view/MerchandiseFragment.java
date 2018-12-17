package com.example.testandroid.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testandroid.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MerchandiseFragment extends Fragment {


    public MerchandiseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_merchandise, container, false);
    }

}
