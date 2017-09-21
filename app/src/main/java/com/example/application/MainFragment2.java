package com.example.application;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.application.databinding.MainFragment2Binding;

/**
 * Fragment 2 for MainActivity.
 */

public class MainFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final MainFragment2Binding binding =
                MainFragment2Binding.inflate(inflater, container, false);
        binding.setActivity((MainActivity) getActivity());
        return binding.getRoot();
    }
}
