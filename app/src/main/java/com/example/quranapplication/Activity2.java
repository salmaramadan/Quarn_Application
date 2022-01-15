package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button back2;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        back2 = (Button) findViewById(R.id.back2);
        configureplaymusic();
        configurestopmusic();
        Button button;
        button = findViewById(R.id.download2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://ia904509.us.archive.org/10/items/scholar00001/scholar01098.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
            }
        });
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Activity0();
            }
        });
    }
    private void configureplaymusic() {
        Button playmusic =(Button) findViewById(R.id.playmusic2);
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Activity2.this, MyService2.class));
            }
        });
    }
    private void configurestopmusic() {
        Button stopmusic =(Button) findViewById(R.id.stopmusic2);
        stopmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Activity2.this, MyService2.class));
            }
        });
    }

    public void Activity0() {
        stopService(new Intent(Activity2.this, MyService2.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}





