package com.souzaleandror.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.souzaleandror.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lista de Alunos");
        setContentView(R.layout.activity_lista_alunos);
        List<String> students = new ArrayList<String>(Arrays.asList("Alex", "Fran", "Jose", "Joao", "Maria"));
        ListView listStudents = findViewById(R.id.activity_lista_alunos_list_view);
        listStudents.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, students));


    }
}
