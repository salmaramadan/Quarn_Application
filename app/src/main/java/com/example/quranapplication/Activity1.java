package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity1 extends AppCompatActivity {
    Button back1;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        back1 = (Button) findViewById(R.id.back1);
        configureplaymusic();
        configurestopmusic();
        Button button;
        button = findViewById(R.id.download1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://ia903409.us.archive.org/22/items/quran08001/quran08621.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
            }
        });
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Activity0();
            }
        });
    }
    private void configureplaymusic() {
        Button playmusic =(Button) findViewById(R.id.playmusic1);
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Activity1.this, MyService1.class));
            }
        });
    }
    private void configurestopmusic() {
        Button stopmusic =(Button) findViewById(R.id.stopmusic1);
        stopmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Activity1.this, MyService1.class));
            }
        });
    }

    public void Activity0() {
        stopService(new Intent(Activity1.this, MyService1.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}



