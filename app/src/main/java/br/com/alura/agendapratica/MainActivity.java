package br.com.alura.agendapratica;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// MainActivity herda da classe Activity (AndroidManifest.xml alterado para registrá-la)
public class MainActivity extends Activity {

    // onCreate é responsável por dar início ao ciclo de vida da activity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView é reponsável por colocar uma view dentro da activity
        // nossa view está em acitivy_main.xml, e seu endereço foi passado por referência
        setContentView(R.layout.activity_main);

        // lista que representa os alunos. Arrays.asList para criar a lista dinâmica
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Jose"));

        // findViewById para referenciarmos a view específica com base em sua identificação
        // activity_main_lista_de_alunos é a ListView em questão que criamos no arquivo .xml
        // a ListView faz parte do LinearLayout
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);

        // o setAdapter é um componente intermediário que entrega os dados e rederiza com uma view
        // ArrayAdapter é utilizado para facilitar a implementação do ListAdapter
        // android.R.layout.simple_list_item_1 é um layout pronto para usarmos com TextView
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}
