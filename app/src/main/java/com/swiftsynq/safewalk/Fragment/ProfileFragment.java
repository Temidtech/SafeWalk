package com.swiftsynq.safewalk.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.swiftsynq.safewalk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by popoolaadebimpe on 08/04/2018.
 */

public class ProfileFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.profile_fragment, container, false);
        ButterKnife.bind(this,rootView); // bind butterknife after

        return rootView;

    }
    public static ProfileFragment newInstance() {
        ProfileFragment fragment=new ProfileFragment();
        return fragment;
    }
    @Override
    public void onResume() {
        super.onResume();

        if (getActivity() instanceof AppCompatActivity) {
            AppCompatActivity activity = ((AppCompatActivity) getActivity());
            if (activity.getSupportActionBar() != null) {
                activity.getSupportActionBar().setTitle("Profile");
            }
        }
    }
}
