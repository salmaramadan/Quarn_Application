package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity9 extends AppCompatActivity {
    Button back9;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        back9 = (Button) findViewById(R.id.back9);
        configureplaymusic();
        configurestopmusic();
        Button button;
        button = findViewById(R.id.download9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.arab-books.com/wp-content/uploads/2021/05/D986D988D8AD-converted.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
            }
        });
        back9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Activity0();
            }
        });
    }
    private void configureplaymusic() {
        Button playmusic =(Button) findViewById(R.id.playmusic9);
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Activity9.this, MyService9.class));
            }
        });
    }
    private void configurestopmusic() {
        Button stopmusic =(Button) findViewById(R.id.stopmusic9);
        stopmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Activity9.this, MyService9.class));
            }
        });
    }

    public void Activity0() {
        stopService(new Intent(Activity9.this, MyService9.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}





