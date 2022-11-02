package br.com.xpe.xpeandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /*
    Callback obrigatório, disparado quando a activity é iniciada.
    Utilizada para realizar as configurações básicas da activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Inflando o layout
        configuarGatilhos() // Configuração dos listeners
    }

    private fun configuarGatilhos() {
        val tvNome = findViewById<EditText>(R.id.editTextTextPersonName)
        val btEnviar = findViewById<Button>(R.id.btnEnviar)
        var nome: String

        /*
        Vinculando ação do click ao botão.
        De onde vem o setOnClickListener:
//            View.OnClickListener actionHandle= new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    switch (v.getId()){
//                        case R.id.b_1:
//
//                            break;
//
//                        case R.id.b_2:
//
//                            break;
//                    }
//                }
//            };
         */

        btEnviar.setOnClickListener {
            acaoDoBotao(tvNome.text.toString())
        }
    }

    private fun acaoDoBotao(nome: String?) {
        Toast.makeText(this, "O nome é $nome", Toast.LENGTH_LONG).show()
    }
}