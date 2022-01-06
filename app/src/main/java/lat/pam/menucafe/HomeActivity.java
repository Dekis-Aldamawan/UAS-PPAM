package lat.pam.menucafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;


import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        DB database = new DB (getApplicationContext());

        ArrayList<Food> data = (ArrayList<Food>) database.getFoodList(getApplicationContext());
        RecyclerView recyclerView = findViewById(R.id.list_item_view);
       FoodsAdapter adapter = new FoodsAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void addData(){
        DB database = new DB(getApplicationContext());
        ArrayList<Food> data = FoodData.getData(getApplicationContext());

        for (Food food: data) {
            database.inputData(food);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                this.finish();
                break;

            case R.id.tambahdata:
                addData();
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}