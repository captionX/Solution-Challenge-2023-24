import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DoctorSearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_search)

        // Set up a RecyclerView to display a list of doctors
        val recyclerView: RecyclerView = findViewById(R.id.doctorRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DoctorAdapter(getSampleDoctors())
    }

    private fun getSampleDoctors(): List<Doctor> {
        // Fetch doctor data from a server or database
        // For simplicity, using hardcoded data
        return listOf(
            Doctor("Dr. Smith", "Cardiologist", 4.5),
            Doctor("Dr. Johnson", "Dermatologist", 4.2),
            Doctor("Dr. Davis", "Pediatrician", 4.8)
        )
    }
}
