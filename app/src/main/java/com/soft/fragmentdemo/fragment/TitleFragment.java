package com.soft.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.soft.fragmentdemo.R;

/**
 * Created by Administrator on 2016/4/29.
 */
public class TitleFragment extends Fragment {

    private ImageButton mTitleLeft;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_title, container, false);
        mTitleLeft = (ImageButton) view.findViewById(R.id.id_title_left_btn);
        mTitleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "i am am ImageButton in TitleFragment !", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
