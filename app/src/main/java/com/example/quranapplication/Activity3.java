package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity3 extends AppCompatActivity {
    Button back3;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        back3 = (Button) findViewById(R.id.back3);
        configureplaymusic();
        configurestopmusic();
        Button button;
        button = findViewById(R.id.download3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://ia803400.us.archive.org/6/items/quran05001/quran05682.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
            }
        });
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Activity0();
            }
        });
    }
    private void configureplaymusic() {
        Button playmusic =(Button) findViewById(R.id.playmusic3);
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Activity3.this, MyService3.class));
            }
        });
    }
    private void configurestopmusic() {
        Button stopmusic =(Button) findViewById(R.id.stopmusic3);
        stopmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Activity3.this, MyService3.class));
            }
        });
    }

    public void Activity0() {
        stopService(new Intent(Activity3.this, MyService3.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}





