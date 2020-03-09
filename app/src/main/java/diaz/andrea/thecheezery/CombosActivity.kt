package diaz.andrea.thecheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.combo_view.view.*

class CombosActivity : AppCompatActivity() {

    var combos = ArrayList<Combo>()
    var adaptador: AdaptadorCombos? = null

    fun cargarCombos(){
        combos.add(Combo("Combo muffin",R.drawable.muffincombo,28,"Muffin y dos galletas de San Valentin"))
        combos.add(Combo("Combo pastel",R.drawable.pastelcombo,40,"Rebanada de pastel y malteada mediana de fresa"))
        combos.add(Combo("Combo palomitas",R.drawable.palomitascombo,62,"Palomitas y soda tamaño grande"))
        combos.add(Combo("Combo hot-dog",R.drawable.hotdogcombo,56,"Hot-dog, orden de papas a la francesa y refresco 600 ml"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)

        cargarCombos()

        adaptador = AdaptadorCombos(this, combos)
        gridview_combos.adapter = adaptador
    }

    class AdaptadorCombos: BaseAdapter {
        var combos = ArrayList<Combo>()
        var contexto: Context? = null

        constructor(contexto: Context, combos: ArrayList<Combo>){
            this.contexto = contexto
            this.combos = combos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var combo = combos[position]
            var inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflater.inflate(R.layout.combo_view,null)

            vista.combo_img.setImageResource(combo.image)
            vista.combo_nombre.setText(combo.nombre)
            vista.combo_precio.setText("$${combo.precio}")
            vista.combo_descripcion.setText(combo.descripcion)

            return vista
        }

        override fun getItem(position: Int): Any {
            return combos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return combos.size
        }

    }

}
