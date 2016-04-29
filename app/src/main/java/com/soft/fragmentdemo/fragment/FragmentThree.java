package com.soft.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.soft.fragmentdemo.R;

/**
 * Created by Administrator on 2016/4/29.
 */
public class FragmentThree extends Fragment implements View.OnClickListener {
    private Button btnFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        btnFragment = (Button) view.findViewById(R.id.btn_fragment);
        btnFragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "i am a btn in fragment three", Toast.LENGTH_SHORT).show();
    }
}
