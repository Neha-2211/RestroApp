package com.example.android.restroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.restroapp.R;

public class MainActivity extends AppCompatActivity {

    // private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=2;
    public void submitOrder(View view){
        String message="Name: Neha\n"+"Quantity: "+quantity+"\nTotal:" +calculatePrice()+"\nThank you\n\n"+"\tHope to visit you again!\n"+"\tHave a good day!";
        displayMessage( message);
    }


    private void displayMessage(String message){
        TextView summary=(TextView)findViewById(R.id.price_text_view);
        summary.setText(message);
    }
    private int calculatePrice(){
        int price= quantity*5;
        return price;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

}