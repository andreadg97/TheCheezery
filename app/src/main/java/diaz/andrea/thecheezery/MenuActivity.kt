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
            startActivity(intent)
        }

        btn_hotdrinks.setOnClickListener {
            var intent = Intent(this,ProductosActivity::class.java)
            startActivity(intent)
        }

        btn_3.setOnClickListener {
            var intent = Intent(this,SweetsActivity::class.java)
            startActivity(intent)
        }

        btn_4.setOnClickListener {
            var intent = Intent(this,SaltiesActivity::class.java)
            startActivity(intent)
        }

        btn_5.setOnClickListener {
            var intent = Intent(this,CombosActivity::class.java)
            startActivity(intent)
        }

        btn_6.setOnClickListener {
            var intent = Intent(this,PersonalizedActivity::class.java)
            startActivity(intent)
        }

    }
}
