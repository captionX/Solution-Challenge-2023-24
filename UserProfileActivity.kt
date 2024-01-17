import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val saveProfileButton: Button = findViewById(R.id.saveProfileButton)
        val userNameEditText: EditText = findViewById(R.id.userNameEditText)

        saveProfileButton.setOnClickListener {
            val userName = userNameEditText.text.toString()

            // Save user profile to a database or SharedPreferences
            // For simplicity, just starting DoctorSearchActivity directly
            startActivity(Intent(this, DoctorSearchActivity::class.java))
        }
    }
}
