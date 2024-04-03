package com.example.esteh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EsTehAdapter esTehAdapter;
    private ArrayList<EsTehModel> esTehModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        esTehAdapter = new EsTehAdapter(esTehModelList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(esTehAdapter);
    }

    private void getData() {
        esTehModelList = new ArrayList<>();
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_matcha, "Es Teh Matcha", "Minuman yang memikat dengan cita rasa khas matcha yang menyegarkan. Minuman ini terbuat dari bubuk matcha hijau yang diseduh dengan sempurna dan dicampur dengan es batu, menciptakan kombinasi yang menyegarkan dan kaya akan antioksidan.", 21000));
        esTehModelList.add(new EsTehModel(R.drawable.brown_sugar, "Brown Sugar", "Minuman yang memikat dengan kelezatan gula merah yang karamelisasi. Minuman ini terdiri dari campuran gula merah yang dimasak hingga menghasilkan sirup karamel yang kaya rasa, kemudian disajikan dengan es batu dan susu segar.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.sea_salt_cookies_cream, "Sea Salt Cream & Cookies", "Minuman yang menggoda dengan kombinasi yang unik antara krim garam laut yang lembut dan cookies yang renyah. Minuman ini menghadirkan sensasi manis dari cookies yang dipadukan dengan sentuhan gurih dari krim garam laut, menciptakan pengalaman rasa yang memukau dan memuaskan.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.thai_tea, "Thai Tea", "Minuman yang memukau dengan cita rasa khas rempah-rempah Thailand yang memikat. Minuman ini terbuat dari campuran teh hitam yang disajikan dengan susu kental manis dan es batu, menciptakan kombinasi yang menyegarkan dan kaya akan rasa.", 19000));
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_susu_nusantara, "Es Teh Susu Nusantara", "Minuman yang menggabungkan kelezatan teh dengan kekhasan susu dari Nusantara. Minuman ini terbuat dari teh yang diseduh dengan sempurna dan dicampur dengan susu segar, menciptakan paduan yang sempurna antara rasa teh yang menyegarkan dan kelembutan susu yang khas.", 18000));
        esTehModelList.add(new EsTehModel(R.drawable.chizu_avocado, "Chizu Avocado", "Minuman yang memukau dengan kombinasi yang lezat antara kelembutan alpukat dan keharuman serta kekhasan chizu, menciptakan sensasi rasa yang unik dan memuaskan. Minuman ini terbuat dari alpukat segar yang dihaluskan dan dicampur dengan chizu, memberikan rasa kreami yang lembut dengan sentuhan manis yang menyegarkan.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.chizu_matcha, "Chizu Matcha", "Minuman yang memukau dengan kombinasi yang menggoda antara matcha yang khas dengan kelembutan dan kelezatan chizu. Minuman ini terbuat dari bubuk matcha hijau yang diseduh dengan sempurna, kemudian dicampur dengan chizu yang memberikan rasa krimi yang lembut dan manis.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.chizu_red_velvet, "Chizu Red Velvet", "Minuman yang menggoda dengan kombinasi yang lembut dan manis dari red velvet dan kelezatan chizu. Minuman ini menghadirkan cita rasa khas red velvet yang lezat, dipadukan dengan kelembutan chizu yang khas.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.chizu_taro,"Chizu Taro",  "Minuman yang memukau dengan paduan yang lembut dan kaya rasa antara rasa taro yang khas dan kelembutan chizu. Minuman ini terbuat dari taro yang dihaluskan dengan sempurna, kemudian dicampur dengan chizu yang memberikan sentuhan kremi yang lembut.", 25000));
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_lemonade_berry, "Es Teh Lemonade Strawberry", "Minuman yang menyegarkan dengan kombinasi yang menyenangkan antara es teh, perasan lemon, dan potongan strawberry segar. Minuman ini menghadirkan cita rasa segar dari lemon yang dipadukan dengan manisnya strawberry, memberikan kesegaran yang menyenangkan.", 19000));
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_lemon, "Es Teh Lemon", "Minuman yang menyegarkan dengan kombinasi yang sederhana namun nikmat antara teh yang disajikan dengan es dan perasan lemon segar. Minuman ini menghadirkan rasa segar dan asam dari lemon yang dipadukan dengan kesegaran teh, menciptakan minuman yang cocok dinikmati di segala suasana.", 18000));
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_lychee, "Es Teh Lychee", "Mminuman yang menyegarkan dengan perpaduan yang unik antara es teh dan aroma manis dari buah leci segar. Minuman ini menghadirkan cita rasa segar dari teh yang dipadukan dengan manisnya lychee, memberikan kesegaran yang menyenangkan.", 18000));
        esTehModelList.add(new EsTehModel(R.drawable.es_teh_mango_greeantea, "Es Teh Mango Greentea", "Minuman segar yang memukau dengan perpaduan yang menggoda antara es teh hijau dan aroma manis dari mangga segar. Minuman ini menghadirkan kesegaran dari teh hijau yang dipadukan dengan manisnya potongan mangga, memberikan pengalaman rasa yang unik dan memuaskan.", 19000));
        esTehModelList.add(new EsTehModel(R.drawable.passion_fruit_lemonade, "Passion Fruit Lemonade", "Minuman yang menyegarkan dengan paduan yang menggoda antara perasan lemon dan aroma manis dari buah markisa segar. Minuman ini menghadirkan kesegaran dari perpaduan lemon yang asam dan manisnya buah markisa, menciptakan pengalaman rasa yang unik dan memuaskan.", 19000));

    }
}
