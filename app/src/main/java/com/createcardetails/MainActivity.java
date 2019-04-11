package com.createcardetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText carname, year, color, price, enginesize;
    TextView result;
    Button btn_add_car;
ModelCar car=new ModelCar();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*input fields*/
        carname = findViewById(R.id.et_carname);
        year = findViewById(R.id.et_year);
        color = findViewById(R.id.et_color);
        price = findViewById(R.id.et_price);
        enginesize = findViewById(R.id.et_enginesize);

        result=findViewById(R.id.result);

        btn_add_car=findViewById(R.id.btn_addcar);

        btn_add_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Setting the value for car model*/
                car.setCarname(carname.getText().toString());
                car.setYear(year.getText().toString());
                car.setColor(color.getText().toString());
                car.setPrice(price.getText().toString());
                car.setEngine_size(enginesize.getText().toString());

                /*getting values form car model and storing it in variables*/

                String carname, year, color, price, engine_size;

                carname = car.getCarname().toString();
                year = car.getYear().toString();
                color = car.getColor().toString();
                price = car.getPrice().toString();
                engine_size = car.getEngine_size().toString();

                /*textview to display values in scroll views */

                Log.d("car name", "Car name: "+ MainActivity.this.carname.getText().toString());


                String load_data = result.getText().toString() +
                        "\r\n" +
                        "\r\n" + "Car name : " + carname +
                        "\r\n" + "Year : " + year +
                        "\r\n" + "Color : " + color +
                        "\r\n" + "Price : " + price +
                        "\r\n" + "Engine Size : " + engine_size;

                result.setText(load_data);
            }
        });

    }
}