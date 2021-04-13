package es.ferriolblip.myheroacademy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.ferriolblip.myheroacademy.databinding.ActivityMainBinding
import es.ferriolblip.myheroacademy.databinding.ItemSuperheroBinding

class HeroAdapter(val superHero: List<SuperHero>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false));
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHero[position])
    }

    override fun getItemCount(): Int = superHero.size

    class HeroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemSuperheroBinding.bind(view)

        fun render(superHero: SuperHero) {
            binding.textRealName.text = superHero.realName
            binding.textSuperHeroName.text = superHero.superHeroName
            binding.textPublisher.text = superHero.publisher
            Picasso.get().load(superHero.image).into(binding.imageHero)

            view.setOnClickListener {
                Toast.makeText(
                    view.context,
                    "Selected ${superHero.superHeroName}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
