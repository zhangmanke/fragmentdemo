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
public class FragmentTwo extends Fragment implements View.OnClickListener {

    private Button btnFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        btnFragment = (Button) view.findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentThree ft=new FragmentThree();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.hide(this);
        tx.add(R.id.id_content,ft,"THREE");
        //加入到回退栈中
        tx.addToBackStack(null);
        tx.commit();
    }
}
