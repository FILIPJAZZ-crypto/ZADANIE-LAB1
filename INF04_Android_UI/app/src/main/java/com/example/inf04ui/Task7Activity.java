package com.example.inf04ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Task7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task7);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Komputer przenośny do pracy i nauki"));
        products.add(new Product("Telefon", "Smartfon z ekranem dotykowym"));
        products.add(new Product("Słuchawki", "Słuchawki bezprzewodowe"));
        products.add(new Product("Klawiatura", "Klawiatura komputerowa USB"));
        products.add(new Product("Mysz", "Mysz optyczna do komputera"));

        recyclerView.setAdapter(new ProductAdapter(products));
    }
}
