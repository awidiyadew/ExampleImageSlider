package cf.awidiyadew.exampleimageslider;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DetailPhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_photo);

        String url = getIntent().getStringExtra("URL");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, PhotoFragment.newInstance(url))
                .commit();
    }

    @Override
    public void onBackPressed() {
        this.finish();
        Log.d("TAG", "DETAIL PHOTO ACTIVITY IS FINISH()");
    }
}
