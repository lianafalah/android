package com.example.testandroid.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.example.testandroid.R;
//import com.example.testandroid.controller.AdapterRecyclerMenu;
import com.example.testandroid.model.HomeResponse;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class DrinksFragment extends Fragment {

//    private AdapterRecyclerMenu adapterNonCoffe, adapterCoffe, adapterFrappeCoffe, adapterFrappeJuice,
//            adapterTea, adapterFrappeCream;
    private RecyclerView mItemList ;
    private ArrayList<Menu> listNonCoffe = new ArrayList<>();
    private ArrayList<Menu> listCoffe = new ArrayList<>();
    private ArrayList<Menu> listFrappeCoffe = new ArrayList<>();
    private ArrayList<Menu> listFrappeJuice = new ArrayList<>();
    private ArrayList<Menu> listTea = new ArrayList<>();
    private ArrayList<Menu> listFrappeCream = new ArrayList<>();
    private Context mContext;
    private SharedPreferences userPref;
    private boolean isNonCoffe, isCoffe, isFrappeCoffe, isFrappeJuice, isTea, isFrappeCream = false;
    private boolean isNonCoffeLoad, isCoffeLoad, isFrappeCoffeLoad, isFrappeJuiceLoad, isTeaLoad, isFrappeCreamLoad = false;
    public DrinksFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drinks, container, false);

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }


}
