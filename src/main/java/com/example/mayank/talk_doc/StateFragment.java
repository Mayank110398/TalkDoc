package com.example.mayank.talk_doc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP on 22-06-2018.
 */
public class StateFragment extends Fragment {
    TextView tvState;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.state, null);
        tvState= (TextView) v.findViewById(R.id.textState);
        return  v;
    }

}
