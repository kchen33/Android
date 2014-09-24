package com.example.simplefeng;

import com.example.chenimage.R;
import com.example.chenimage.R.id;
import com.example.chenimage.R.layout;
import com.example.chenimage.R.menu;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class Simplefrg extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simplefrg);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_simplefrg,
					container, false);
			
			Button btnClickMeColor = (Button)rootView.findViewById(R.id.btnsimpleFragColor);
			btnClickMeColor.setOnClickListener(new OnClickListener(){

				@SuppressLint("ShowToast") @Override
				public void onClick(View arg0) {
					Toast.makeText(getActivity(), "I am very cute!",Toast.LENGTH_SHORT).show();
					
				}
				
			});
			return rootView;
		}
	}
}
