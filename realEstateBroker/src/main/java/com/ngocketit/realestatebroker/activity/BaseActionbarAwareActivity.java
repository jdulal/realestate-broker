package com.ngocketit.realestatebroker.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.SearchView;

public abstract class BaseActionbarAwareActivity extends LoggedInRequiredActivity implements
SearchView.OnQueryTextListener, 
ActionBar.OnNavigationListener {
	
	@Override
	public boolean onNavigationItemSelected(int position, long id) {
		return false;
	}

	@Override
	public boolean onQueryTextChange(String newText) {
		return false;
	}

	@Override
	public boolean onQueryTextSubmit(String query) {
		return false;
	}
}
