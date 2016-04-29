package com.soft.fragmentdemo.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.soft.fragmentdemo.R;

/**
 * Created by Administrator on 2016/4/29.
 */
public class FragmentOne extends Fragment implements View.OnClickListener {

    private Button btnFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        btnFragment = (Button) view.findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentTwo ft=new FragmentTwo();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.id_content,ft,"TWO");

        //加入栈中
        tx.addToBackStack(null);
        tx.commit();


    }
}
