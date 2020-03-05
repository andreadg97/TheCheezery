package diaz.andrea.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_colddrinks.setOnClickListener {
            var intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton_origen","colddrinks")
            startActivity(intent)
        }

        btn_hotdrinksc.setOnClickListener {
            var intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton_origen","hotdrinks")
            startActivity(intent)
        }

        btn_sweets.setOnClickListener {
            var intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton_origen","sweets")
            startActivity(intent)
        }

        btn_salties.setOnClickListener {
            var intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton_origen","salties")
            startActivity(intent)
        }

        btn_combos.setOnClickListener {
            var intent = Intent(this,CombosActivity::class.java)
            startActivity(intent)
        }

        btn_6.setOnClickListener {
            var intent = Intent(this,PersonalizedActivity::class.java)
            startActivity(intent)
        }

    }
}
