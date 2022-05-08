package br.com.alura.agendapratica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

// MainActivity herda da classe Activity (AndroidManifest.xml alterado para registrá-la)
public class MainActivity extends Activity {

    // onCreate é responsável por dar início ao ciclo de vida da activity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Eduardo", Toast.LENGTH_LONG).show();
    }
}
