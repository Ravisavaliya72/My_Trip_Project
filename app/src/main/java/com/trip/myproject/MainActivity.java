package com.trip.myproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> arrayList = new ArrayList<>();


        arrayList.add(new Item("Thailand", R.drawable.thailand, "https://www.makemytrip.com/holidays-international/thailand-vacation-tour-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-Tbam1Er7sII8KnigVuDSCFYthvv9Cavg0TnNZITYkKVRQzRIh9bX9xoCtrYQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|OBT_India_Thailand|Non-Brand_Thailand|ETA|Regular|586357471905&s_kwcid=AL!1631!3!586357471905!p!!g!!thailand%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-Tbam1Er7sII8KnigVuDSCFYthvv9Cavg0TnNZITYkKVRQzRIh9bX9xoCtrYQAvD_BwE:G:s"));
        arrayList.add(new Item("Kashmir", R.drawable.kashmir, "https://www.makemytrip.com/holidays-india/kashmir-travel-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TU-VStFFCUkypETdyBY-yS82xTy3kT5uOhMrK8CN3QXkBevCRP4SaBoCcEMQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|DOM_India_Kashmir_Desktop|Non_Brand_Kashmir_Desktop|ETA|Regular|600103221028&s_kwcid=AL!1631!3!600103221028!p!!g!!kashmir%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TU-VStFFCUkypETdyBY-yS82xTy3kT5uOhMrK8CN3QXkBevCRP4SaBoCcEMQAvD_BwE:G:s"));
        arrayList.add(new Item("Himachal", R.drawable.himachal, "https://holidayz.makemytrip.com/holidays/india/search?gclid=CjwKCAjw0N6hBhAUEiwAXab-TXxmHtlAPHRmr-XGRJeykP8JL0yvYhTXv5uGAjyQ9z_PrMHhOrIOkxoC1LYQAvD_BwE&dest=Himachal&redirectionPage=grouping&cmp=SEM|D|Holiday|G|Generic|DOM_India_Himachal|Non_Brand_Himachal|ETA|Regular|611086159407&s_kwcid=AL!1631!3!611086159407!p!!g!!himachal%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TXxmHtlAPHRmr-XGRJeykP8JL0yvYhTXv5uGAjyQ9z_PrMHhOrIOkxoC1LYQAvD_BwE:G:s"));
        arrayList.add(new Item("Goa", R.drawable.goa, "https://www.makemytrip.com/holidays-india/goa-travel-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TRd5pDeVHiVrPctgekvhjS4qbxynbG-nrZmRKDiaCqT1Xz_ga2HshRoCh5wQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|DOM_India_Goa|Non_Brand_Goa|ETA|Regular|539137716417&s_kwcid=AL!1631!3!539137716417!e!!g!!goa%20tourism%20packages&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TRd5pDeVHiVrPctgekvhjS4qbxynbG-nrZmRKDiaCqT1Xz_ga2HshRoCh5wQAvD_BwE:G:s"));
        arrayList.add(new Item("Kerala", R.drawable.kerela, "https://holidayz.makemytrip.com/holidays/india/search?gclid=CjwKCAjw0N6hBhAUEiwAXab-TZO3KF7Jr8ewALF5SvSE-Vs-UgzzM2bAyOCcFFn6b_YfeYNb92CgKxoC2HUQAvD_BwE&dest=Kerala&cmp=SEM|D|Holiday|G|Generic|DOM_India_Kerala|Non_Brand_Kerala|ETA|Regular|648788603437&s_kwcid=AL!1631!3!648788603437!p!!g!!kerala%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TZO3KF7Jr8ewALF5SvSE-Vs-UgzzM2bAyOCcFFn6b_YfeYNb92CgKxoC2HUQAvD_BwE:G:s"));
        arrayList.add(new Item("Bangalore", R.drawable.bangalore, "https://www.makemytrip.com/holidays-india/bangalore-tourism-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TdF7Xw_uqXXnevPs6b03PE4UY8vzU-oE7-NL6Gv2mNqJ2s4jqHPXGhoCjlQQAvD_BwE&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TdF7Xw_uqXXnevPs6b03PE4UY8vzU-oE7-NL6Gv2mNqJ2s4jqHPXGhoCjlQQAvD_BwE:G:s&cmp=SEM|D|Holiday|G|DSA|DOM_India_DSA_Desktop|Non_Brand_DSA|ETA|Regular|642469606921"));
        arrayList.add(new Item("Maldives", R.drawable.maldives, "https://www.makemytrip.com/holidays-international/maldives-vacation-tour-packages.html"));
        arrayList.add(new Item("Ladakh", R.drawable.ladakh, "https://www.makemytrip.com/holidays-india/ladakh-travel-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TWdMCVG1IHcSAU6DckLgdeLw-scbkzPfLnXZEUsy4qfh9X-cGk6vuBoCitgQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|DOM_India_Ladakh_Desktop|Non_Brand_Ladakh_Desktop|ETA|Regular|648753948924&s_kwcid=AL!1631!3!648753948924!e!!g!!ladakh%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TWdMCVG1IHcSAU6DckLgdeLw-scbkzPfLnXZEUsy4qfh9X-cGk6vuBoCitgQAvD_BwE:G:s"));
        arrayList.add(new Item("Kutch", R.drawable.kutch, "https://www.makemytrip.com/holidays-india/kutch-travel-packages.html"));
        arrayList.add(new Item("Andaman", R.drawable.andaman, "https://holidayz.makemytrip.com/holidays/india/search?gclid=CjwKCAjw0N6hBhAUEiwAXab-TVBtf_QRfWSfu3OGCglnyYONPfgt3a41BA-YfbkfN_8IaGGf19273RoCC_4QAvD_BwE&dest=Andaman&depCity=New%20Delhi&affiliate=MMT&cmp=SEM|D|Holiday|G|Generic|DOM_India_Andaman|Non_Brand_Andaman_Desktop|ETA|Regular|648848827913&s_kwcid=AL!1631!3!648848827913!p!!g!!andaman%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TVBtf_QRfWSfu3OGCglnyYONPfgt3a41BA-YfbkfN_8IaGGf19273RoCC_4QAvD_BwE:G:s"));
        arrayList.add(new Item("Rajasthan", R.drawable.rajasthan, "https://holidayz.makemytrip.com/holidays/india/search?gclid=CjwKCAjw0N6hBhAUEiwAXab-TWehO5IYVtDwDTxMHYaGR-0KCdU0UIDpwyH48W29vzfv29y1tx5U-RoCOGUQAvD_BwE&depCity=New%20Delhi&dest=Rajasthan&destValue=Rajasthan&affiliate=MMT&cmp=SEM|D|Holiday|G|Generic|DOM_India_Rajasthan|Non_Brand_Rajasthan|ETA|Regular|615408054163&s_kwcid=AL!1631!3!615408054163!e!!g!!rajasthan%20tourism%20package&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TWehO5IYVtDwDTxMHYaGR-0KCdU0UIDpwyH48W29vzfv29y1tx5U-RoCOGUQAvD_BwE:G:s"));
        arrayList.add(new Item("Dubai", R.drawable.dubai, "https://www.makemytrip.com/holidays-international/dubai-vacation-tour-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TRzWAilirD65PmBAOIMPlQ7Sucbk83U2rbtpfakvULVv0NrMb-FPvxoCOJEQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|OBT_India_Dubai|Non-Brand_Dubai|ETA|Regular|626846621925&s_kwcid=AL!1631!3!626846621925!e!!g!!dubai%20tourism%20packages&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TRzWAilirD65PmBAOIMPlQ7Sucbk83U2rbtpfakvULVv0NrMb-FPvxoCOJEQAvD_BwE:G:s"));
        arrayList.add(new Item("Bali", R.drawable.bali, "https://www.makemytrip.com/holidays-international/bali-tourism-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TW9Vjv90F8GkNxe0SOtXbi6nmwrrQlVe_wppiuizc7ouuIeD0ebNhxoCyCkQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|OBT_India_Bali_Desktop|Non_Brand_Bali_Desktop|ETA|Regular|608922848385&s_kwcid=AL!1631!3!608922848385!p!!g!!bali%20tourism%20packages&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TW9Vjv90F8GkNxe0SOtXbi6nmwrrQlVe_wppiuizc7ouuIeD0ebNhxoCyCkQAvD_BwE:G:s"));
        arrayList.add(new Item("Europe", R.drawable.europe, "https://www.makemytrip.com/holidays-international/europe-vacation-tour-packages.html"));
        arrayList.add(new Item("Singapore", R.drawable.singapore, "https://www.makemytrip.com/holidays-international/singapore-vacation-tour-packages.html?gclid=CjwKCAjw0N6hBhAUEiwAXab-TVpgxufttYugFTN5B6vZjpcWXOw4poITESyHtYXc7vE7PjMAw464MBoCyYYQAvD_BwE&cmp=SEM|D|Holiday|G|Generic|OBT_India_Singapore|Non_Brand_Singapore|ETA|Regular|609050943962&s_kwcid=AL!1631!3!609050943962!e!!g!!singapore%20tourism%20packages&ef_id=CjwKCAjw0N6hBhAUEiwAXab-TVpgxufttYugFTN5B6vZjpcWXOw4poITESyHtYXc7vE7PjMAw464MBoCyYYQAvD_BwE:G:s"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                intent.putExtra("data",item.getAbout());
                startActivity(intent);
            }
        });
    }
}