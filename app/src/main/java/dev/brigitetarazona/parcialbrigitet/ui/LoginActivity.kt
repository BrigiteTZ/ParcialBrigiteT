package dev.brigitetarazona.parcialbrigitet.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dev.brigitetarazona.parcialbrigitet.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailSuccess: String = "admin@mechanics.com"
        val passwordSuccess: String = "admin123"

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val eMail:String = etEmail.text.trim().toString()
            val password:String = etPassword.text.trim().toString()

            if (eMail == emailSuccess && password==passwordSuccess){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                if (eMail != emailSuccess) {etEmail.error = "eMail incorrecto"}
                if (password != passwordSuccess) {etPassword.error = "Password incorrectas"}
            }
            //Toast.makeText(requireContext(),"Credenciales Inválidasd", Toast.LENGTH_SHORT).show()
        }
    }
}