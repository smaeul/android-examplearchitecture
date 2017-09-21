package com.example.application;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.application.databinding.ChildFragment2Binding;

/**
 * Fragment 2 for ChildActivity.
 */

public class ChildFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ChildFragment2Binding binding =
                ChildFragment2Binding.inflate(inflater, container, false);
        binding.setActivity((ChildActivity) getActivity());
        return binding.getRoot();
    }
}
