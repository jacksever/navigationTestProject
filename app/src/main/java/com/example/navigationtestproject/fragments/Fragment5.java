package com.example.navigationtestproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.navigationtestproject.R;

public class Fragment5 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ((TextView) view.findViewById(R.id.name)).setText(requireContext().getString(R.string.fragment5));

        view.findViewById(R.id.button1).setOnClickListener(v ->
                NavHostFragment.findNavController(this).navigate(R.id.action_fragment5_to_fragment5_1));

        view.findViewById(R.id.button2).setOnClickListener(v ->
                NavHostFragment.findNavController(this).navigate(R.id.action_fragment5_to_fragment5_2));

        view.findViewById(R.id.button3).setOnClickListener(v ->
                NavHostFragment.findNavController(this).navigate(R.id.action_fragment5_to_fragment5_3));
    }
}
