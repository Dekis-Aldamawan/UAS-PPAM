package lat.pam.menucafe;


import android.content.Context;

import java.util.ArrayList;

public class FoodData {

    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.mie_goreng);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.donut);


        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Mie Goreng", "Mi goreng berarti \"mi yang digoreng\" adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura. Makanan ini sangat populer dan dapat ditemui di mana-mana di Indonesia, mulai dari pedagang pinggir jalan (kaki lima) sampai restoran mewah.", "Rp. 6500", context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Kopi Hitam", "Kopi hitam adalah minuman hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk.", "Rp. 5000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Nasi Goreng", "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging.", "Rp. 15000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Batagor", "Batagor dibuat dari tahu yang dilembutkan dan diisi dengan adonan berbahan ikan tenggiri dan tepung tapioka lalu dibentuk menyerupai bola yang digoreng dalam minyak panas selama beberapa menit hingga matang.", "Rp. 8000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Donut", "Donat adalah suatu bentuk makanan yang digoreng, berdasarkan campuran adonan tepung terigu, telur, metega, dan gula.", "Rp. 2500", context.getDrawable(R.drawable.donut)));
        return list;

    }
}
