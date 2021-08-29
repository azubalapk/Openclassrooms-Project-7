package com.azubal.go4lunch.ui.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.azubal.go4lunch.R;
import com.azubal.go4lunch.databinding.FragmentListViewBinding;
import com.azubal.go4lunch.databinding.FragmentMapViewBinding;
import com.azubal.go4lunch.ui.Activities.MainActivity;

public class ListViewFragment extends Fragment {

    MainActivity mainActivity;
    private FragmentListViewBinding binding;
    View view;



    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMainActivity();
        mainActivity.setToolbarTitle(getString(R.string.toolbarTitleFragmentMapViewListView));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListViewBinding.inflate(inflater, container, false);
        view = binding.getRoot();
        return view;
    }

    public void getMainActivity() {
        mainActivity = (MainActivity) getActivity();
    }
}