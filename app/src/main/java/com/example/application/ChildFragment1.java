package com.example.application;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.application.databinding.ChildFragment1Binding;

/**
 * Fragment 1 for ChildActivity.
 */

public class ChildFragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ChildFragment1Binding binding =
                ChildFragment1Binding.inflate(inflater, container, false);
        binding.setActivity((ChildActivity) getActivity());
        return binding.getRoot();
    }
}
