package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> FotoMakanan = new ArrayList<>();
    private ArrayList<String> NamaMakanan = new ArrayList<>();
    private ArrayList<String> InfoMakanan = new ArrayList<>();
    private ArrayList<String> HargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(FotoMakanan, NamaMakanan, InfoMakanan, HargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){
        NamaMakanan.add("Beef Burguignon");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Beef-Burguignon.jpg");
        InfoMakanan.add("Sesuai dengan namanya, bahan dasar masakan adalah daging sapi. Tentunya daging sapi yang digunakan adalah daging berkualitas tinggi dan memiliki tekstur lembut. Daging direbus di dalam anggur merah dengan waktu yang lama sehingga membuat cita rasanya khas serta berkesan mewah. Dibumbui dengan aneka rempah, bawang merah, bawang putih, dan jamur.");
        HargaMakanan.add("Harga : Rp 330.000");

        NamaMakanan.add("Coq Au Vin");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Coq-Au-Vin.jpg");
        InfoMakanan.add("Bahan dasar yang digunakan untuk membuat masakan ini adalah kaki ayam. Coq Au Vin merupakan bahasa Perancis yang artinya ayam jantan di wine. Cara memasaknya, kaki ayam direbus dalam waktu yang lama di dalam anggur merah. Karena itu tekstur dagingnya lembut dengan bumbu yang meresap. Pada penyajiannya, makanan khas Perancis ini juga dilengkapi dengan irisan jamur serta bumbu khas Perancis.");
        HargaMakanan.add("Harga : Rp 395.000");

        NamaMakanan.add("Cassoulet");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Cassoulet.jpg");
        InfoMakanan.add("Cassoulet adalah perpaduan antara kacang putih dan sosis yang dimasak jadi satu. Mirip dengan sup namun kuahnya jauh lebih kental.");
        HargaMakanan.add("Harga : Rp 190.000");

        NamaMakanan.add("Foie Gras");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Foie-Gras.jpg");
        InfoMakanan.add("Bahan utamanya adalah hati angsa atau bebek yang dibuat pasta. Proses pengolahannya bisa dilakukan dengan berbagai cara, mulai dari digoreng, dipanggang atau dibakar bersama saus khas Perancis sampai dicampurkan ke dalam sandwich. Menghadirkan rasa yang lezat dan gurih karena diberi mentega.");
        HargaMakanan.add("Harga : Rp 450.000");

        NamaMakanan.add("Soupe a l'oignon");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Soupe-a-l-oignon.jpg");
        InfoMakanan.add("merupakan sup bawang Perancis dengan nilai gizi yang tinggi. Cara membuatnya adalah dengan merebus kuah kaldu sapi kental dicampur dengan potongan bawang putih. Kemudian disajikan dengan daging ayam yang disuir serta parutan keju di atasnya.");
        HargaMakanan.add("Harga : Rp 150.000");

        prosesRecyclerViewAdapter();
    }
}