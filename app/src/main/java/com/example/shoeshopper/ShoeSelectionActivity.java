package com.example.shoeshopper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ShoeSelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_selection);

        // ImageView of the shoe
        ImageView shoeImage = findViewById(R.id.shoeImageView);
        Button addToCartButton = findViewById(R.id.buttonAddToCart);
        Button viewCartButton = findViewById(R.id.buttonViewCart);

        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShoeSelectionActivity.this, "Shoe Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });

        viewCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoeSelectionActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}
