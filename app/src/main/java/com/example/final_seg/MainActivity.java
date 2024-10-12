package com.example.final_seg;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_toolbar);
        }

    public void openNavDrawer(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void logout(View view) {
        logoutMenu(MainActivity.this); // Call method to show the logout confirmation dialog
    }

    private void logoutMenu(MainActivity mainActivity){ //logs out, posts a "are you sure" to logout message
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity); // Create a new AlertDialog builder
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int i){
                finish(); //logs out when pressed yes
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialogInterface, int i){
                dialogInterface.dismiss(); //does not log out if pressed no
            }
        });
        builder.show();
    }

}


