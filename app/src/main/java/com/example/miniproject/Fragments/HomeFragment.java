package com.example.miniproject.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.miniproject.R;
import com.example.miniproject.listening;
import com.example.miniproject.reading;
import com.example.miniproject.speaking;
import com.example.miniproject.writing;

public class HomeFragment extends Fragment {
    ImageView bus, listeningImageView, bus1, train,ig5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        bus = view.findViewById(R.id.bus);
        listeningImageView = view.findViewById(R.id.imageView3);
        bus1 = view.findViewById(R.id.bus1);
        train = view.findViewById(R.id.train);
        ig5=view.findViewById(R.id.ig5);

        bus.setOnClickListener(v -> startActivity(new Intent(getActivity(), listening.class)));
        listeningImageView.setOnClickListener(v -> startActivity(new Intent(getActivity(), reading.class)));
        bus1.setOnClickListener(v -> startActivity(new Intent(getActivity(), writing.class)));
        train.setOnClickListener(v -> startActivity(new Intent(getActivity(), speaking.class)));

        ImageView imageView = view.findViewById(R.id.ig5);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExternalLink("https://www.ieltsidpindia.com/"); // Replace with your desired external link
            }
        });

        return view;
    }

    private void openExternalLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
