package com.ngocketit.realestatebroker.activity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.app.RealEstateBrokerApp;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.database.table.UserAccountTable;
import com.ngocketit.realestatebroker.model.UserAccountCredential;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;
import com.ngocketit.realestatebroker.util.CursorUtils;

public class SplashScreenActivity extends BaseActivity {
	private static final int SPLASH_TIME_OUT = 1000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_splash_screen);
		
		setContentView(R.layout.activity_splash_screen);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				checkUserLogin();
			}
		}, SPLASH_TIME_OUT);
	}
	
	private void checkUserLogin() {
		Uri uri = ContentDescriptor.ContentUri.USER_ACCOUNT;

		String[] projection = {
				TableColumn._ID,
				TableColumn.NAME,
				TableColumn.STATUS,
				TableColumn.PASSWORD,
				TableColumn.EMAIL,
				TableColumn.COVER_PIC_PATH,
				TableColumn.LANGUAGE
		};

		// Select user with logged in state
		String selection = TableColumn.STATUS + "=?";
		String[] selectionArgs = {
				String.valueOf(UserAccountTable.UserAccountStatus.LOGGED_IN)
		};

		Cursor cursor = getContentResolver().query(uri, projection, selection, selectionArgs, null);

		RealEstateBrokerApp app = (RealEstateBrokerApp)getApplication();

		if (cursor != null && cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			String langCode = CursorUtils.getRecordStringValue(cursor, TableColumn.LANGUAGE);

			UserAccountCredential currentUser = UserAccountCredential.readFromCursor(cursor);
			app.setCurrentUserCredential(currentUser);
			
			// Change language
			app.changeLocale(langCode);

			Intent mainIntent = new Intent(this, MainActivity.class); 
			startActivity(mainIntent);
		} else {
			// Use vi_VN as default locale
			app.setDefaultLocale();
			
			Intent loginIntent = new Intent(this, UserLoginActivity.class); 
			startActivity(loginIntent);
		}

		finish();
	}
}
