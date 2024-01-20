package com.example.miniproject.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.miniproject.R;

public class pricing extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pricing, container, false);



        TextView imageView = view.findViewById(R.id.textView20);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExternalLink("https://www.ieltsidpindia.com/information/test-fee?gad_source=1&gclid=CjwKCAiAs6-sBhBmEiwA1Nl8s26V_scY9Y8R6TlOKhr0aHISuBWlw2JBwfik8YFrF1f6FoJEdJwfQBoCCtsQAvD_BwE"); // Replace with your desired external link
            }
        });
        TextView imageView1 = view.findViewById(R.id.textView21);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExternalLink("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=CllgCKCBkWGCsfXKDpQLnRqQKqhGbwwJGswdXFKZXGKSldtCRvVzZpSSzlNMCtfZNHPvCHcJjmg"); // Replace with your desired external link
            }
        });

        return view;
    }

    private void openExternalLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
