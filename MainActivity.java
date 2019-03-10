package com.example.manish.fl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class MainActivity extends AppCompatActivity {

    private Button buttonEnable;
    private  Button button1;
    private  Button button2;
    private  Button button3;
    private  Button button4;
    private  Button button5;
    private  Button button6;
    private  Button button7;
    private  Button button8;
    private  Button button9;
    private  Button button10;
    private  Button button11;
    private  Button button12;
    private  Button button13;
    private  Button button14;
    private  Button button15;
    private Button clear;
    private ImageView imageFlashlight;
    private static final int CAMERA_REQUEST = 50;
    private boolean flashLightStatus = false;
    String d;

    long blinkDelay =0;
    int i;

    public MainActivity() throws FileNotFoundException {
    }
    // mediaplayer.setDataSource(Context,Uri.parse("android.resource://"))




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // imageFlashlight = (ImageView) findViewById(R.id.imageFlashlight);
        buttonEnable = (Button) findViewById(R.id.buttonEnable);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        clear = (Button) findViewById(R.id.button16);
        // final MediaPlayer ring =MediaPlayer.create(MainActivity.this,R.raw.udeekan);

        final boolean hasCameraFlash = getPackageManager().
                hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        boolean isEnabled = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED;

        buttonEnable.setEnabled(!isEnabled);
        // imageFlashlight.setEnabled(isEnabled);
        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};




                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0"};




                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "0", "0", "0", "0", "0", "0", "0", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0" };



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] list1 = { "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1", "0", "1" ,"0","1","0", "1", "0","1","0","1","0","1","0","1", "0", "1", "0", "1", "0", "1", "0", "1", "0","1","0","1", "0"};



                for (i = 0; i < list1.length; i++) {
                    d= list1[i];
                    if (d.equals("0")) {

                        //  if (flashLightStatus)
                        flashLightOff();
                    } else {
                        flashLightOn();
                    }//
                    try {
                        Thread.sleep(blinkDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// else {
                    // Toast.makeText(MainActivity.this, "No flash available on your device",
                    // Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    private void flashLightOn() {
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, true);
            flashLightStatus = true;
            // imageFlashlight.setImageResource(R.drawable.btn_switch_on);
        } catch (CameraAccessException e) {
        }
    }

    private void flashLightOff() {
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, false);
            flashLightStatus = false;
            // imageFlashlight.setImageResource(R.drawable.btn_switch_off);
        } catch (CameraAccessException e) {
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode) {
            case CAMERA_REQUEST :
                if (grantResults.length > 0  &&  grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    buttonEnable.setEnabled(false);
                    buttonEnable.setText("Camera Enabled");
                    // imageFlashlight.setEnabled(true);
                } else {
                    Toast.makeText(MainActivity.this, "Permission Denied for the Camera", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

/*void printDataRead(byte[] buf) {
        for (byte c : buf) {
        System.out.println(Integer.toBinaryString(c));
        d= Integer.toBinaryString(c);
        }

        }*/
}


