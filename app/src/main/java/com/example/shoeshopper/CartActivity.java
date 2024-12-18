package com.example.shoeshopper;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        TextView cartItems = findViewById(R.id.textViewCartItems);
        cartItems.setText("Items in your cart:\n1. Running Shoes\n2. Sports Shoes");
    }
}