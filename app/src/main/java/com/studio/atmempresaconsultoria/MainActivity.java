package com.studio.atmempresaconsultoria;



import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.botaoEmpresa = findViewById(R.id.menuEmpresa);
        this.mViewHolder.botaoClientes = findViewById(R.id.menuCliente);
        this.mViewHolder.botaoContato = findViewById(R.id.menuContato);
        this.mViewHolder.botaoServicos = findViewById(R.id.menuServico);


        this.mViewHolder.botaoEmpresa.setOnClickListener(this);
        this.mViewHolder.botaoServicos.setOnClickListener(this);
        this.mViewHolder.botaoClientes.setOnClickListener(this);
        this.mViewHolder.botaoContato.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuEmpresa:
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
                break;
            case R.id.menuServico:
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
                break;
            case R.id.menuCliente:
                startActivity(new Intent(MainActivity.this, ClienteActivity.class));
                break;
            case R.id.menuContato:
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
                break;
        }
    }

    private class ViewHolder {
    ImageButton botaoEmpresa;
    ImageButton botaoServicos;
    ImageButton botaoClientes;
    ImageButton botaoContato;

    }
}
