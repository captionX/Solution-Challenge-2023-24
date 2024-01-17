import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoctorAdapter(private val doctors: List<Doctor>) : RecyclerView.Adapter<DoctorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_doctor, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doctor = doctors[position]
        holder.nameTextView.text = doctor.name
        holder.specialtyTextView.text = doctor.specialty
        holder.ratingTextView.text = doctor.rating.toString()
    }

    override fun getItemCount(): Int {
        return doctors.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val specialtyTextView: TextView = itemView.findViewById(R.id.specialtyTextView)
        val ratingTextView: TextView = itemView.findViewById(R.id.ratingTextView)
    }
}
