package com.example.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class CustomDialog extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        final Dialog dialog = new Dialog(CustomDialog.this);
        dialog.setContentView(R.layout.dialog);
        TextView text = (TextView) dialog.findViewById(R.id.textView);
        Intent intent=getIntent();
        String v=intent.getStringExtra("val");
        text.setText(v);
        dialog.show();
        Button ok = (Button) dialog.findViewById(R.id.ok);

        // if decline button is clicked, close the custom dialog
        ok.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.cancel();
                dialog.setCancelable(true);
                finish();
                return;
            }
        });
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                dialog.cancel();
                dialog.dismiss();
                finish();
                return;
            }
        });
    }

}