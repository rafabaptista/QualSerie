package qualserie.studio.com.qualserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imagemExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar)findViewById(R.id.seekBarId);
        imagemExibicao = (ImageView)findViewById(R.id.imageExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;

                switch (valorProgresso){
                    case 1: imagemExibicao.setImageResource(R.drawable.pouco); break;
                    case 2: imagemExibicao.setImageResource(R.drawable.medio); break;
                    case 3: imagemExibicao.setImageResource(R.drawable.muito); break;
                    case 4: imagemExibicao.setImageResource(R.drawable.susto); break;
                    default: imagemExibicao.setImageResource(0); break;
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
