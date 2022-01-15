package com.example.quranapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity5 extends AppCompatActivity {
    Button back5;
    DownloadManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        back5 = (Button) findViewById(R.id.back5);
        configureplaymusic();
        configurestopmusic();
        Button button;
        button = findViewById(R.id.download5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.arab-books.com/wp-content/uploads/2021/05/D8A7D984D985D984D983-converted.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long reference = manager.enqueue(request);
            }
        });
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Activity0();
            }
        });
    }
    private void configureplaymusic() {
        Button playmusic =(Button) findViewById(R.id.playmusic5);
        playmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(Activity5.this, MyService5.class));
            }
        });
    }
    private void configurestopmusic() {
        Button stopmusic =(Button) findViewById(R.id.stopmusic5);
        stopmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(Activity5.this, MyService5.class));
            }
        });
    }

    public void Activity0() {
        stopService(new Intent(Activity5.this, MyService5.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}





