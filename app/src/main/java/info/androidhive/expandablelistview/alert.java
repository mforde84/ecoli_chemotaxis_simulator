package info.androidhive.expandablelistview;

import android.content.Context;
import android.content.DialogInterface;
import android.app.AlertDialog;

public class alert{

public void alert(Context holdcontext, String message){

    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(holdcontext);

        // set title
    alertDialogBuilder.setTitle("error checking");

        // set dialog message
    alertDialogBuilder
        .setMessage(message)
        .setCancelable(false)
        .setPositiveButton("Yes",new DialogInterface.OnClickListener() {

    public void onClick(DialogInterface dialog,int id) {
        // if this button is clicked, close
        // current activity
        dialog.cancel();
        }
        })
        .setNegativeButton("No",new DialogInterface.OnClickListener() {

    public void onClick(DialogInterface dialog,int id) {
        // if this button is clicked, just close
        // the dialog box and do nothing
        dialog.cancel();
        }
        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}