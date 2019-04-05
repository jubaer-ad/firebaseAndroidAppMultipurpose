package com.jubaer.multipurpose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonOCR, buttonFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOCR = findViewById(R.id.btnToOCR);
        buttonFace = findViewById(R.id.btnToFaceDetector);
        buttonOCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOCR();
            }
        });
        buttonFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaceDetector();
            }
        });
    }

    public void openOCR(){
        Intent intent = new Intent(this, OCRActivity.class);
        startActivity(intent);
    }

    public void openFaceDetector(){
        Intent intent = new Intent(this, FaceDetectionActivity.class);
        startActivity(intent);
    }

}
