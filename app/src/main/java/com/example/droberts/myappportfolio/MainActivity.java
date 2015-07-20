package com.example.droberts.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showToast(CharSequence message) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void buttonClicked(View view) throws Exception {
        Button button = (Button)view;
        CharSequence message;
        switch (button.getId()) {
            case R.id.button_spotify_streamer:
                message = getString(R.string.toast_spotify_streamer);
                break;
            case R.id.button_scores_app:
                message = getString(R.string.toast_scores_app);
                break;
            case R.id.button_library_app:
                message = getString(R.string.toast_library_app);
                break;
            case R.id.button_build_it_bigger:
                message = getString(R.string.toast_build_it_bigger);
                break;
            case R.id.button_xyz_reader:
                message = getString(R.string.toast_xyz_reader);
                break;
            case R.id.button_capstone:
                message = getString(R.string.toast_capstone);
                break;
            default:
                throw new Exception("Unknown button " + button.toString());
        }

        showToast(message);
    }
}
