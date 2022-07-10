package com.example.vidios;

        import androidx.appcompat.app.AppCompatActivity;
        import android.net.Uri;
        import android.os.Bundle;
        import android.widget.MediaController;
        import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vid = findViewById(R.id.videoView);//binding

        MediaController mp = new MediaController(this);//creating mediacontroller
        mp.setAnchorView(vid);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vid);//specify vid loc

        vid.setMediaController(mp);
        vid.setVideoURI(uri);
        vid.requestFocus();

        vid.start();
    }
}