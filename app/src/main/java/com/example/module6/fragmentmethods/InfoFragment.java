package com.example.module6.fragmentmethods;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.module6.R;
import com.example.module6.utils.Logging;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Logging.show(this, getString(R.string.on_create_view));
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logging.show(this, getString(R.string.on_attach));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logging.show(this, getString(R.string.on_create));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logging.show(this, getString(R.string.on_activity_created));
    }

    @Override
    public void onStart() {
        super.onStart();
        Logging.show(this, getString(R.string.on_start));
    }

    @Override
    public void onResume() {
        super.onResume();
        Logging.show(this, getString(R.string.on_resume));
    }

    @Override
    public void onPause() {
        super.onPause();
        Logging.show(this, getString(R.string.on_pause));
    }

    @Override
    public void onStop() {
        super.onStop();
        Logging.show(this, getString(R.string.on_stop));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logging.show(this, getString(R.string.on_destroy_view));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logging.show(this, getString(R.string.on_destroy));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logging.show(this, getString(R.string.on_detach));
    }
}
