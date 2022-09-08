package com.wisnawa.gd3_c_0831

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    // Attribute yang akan kita pakai
    private lateinit var inputUsername : TextInputLayout
    private lateinit var inputPassword : TextInputLayout
    private lateinit var mainLayout : ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ubah Title pada App Bar Aplikasi
        setTitle("User Login")

        // Hubungan varibel dengan view di layoutnya.
        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnClear : Button = findViewById(R.id.btnClear)
        val btnLogin : Button = findViewById(R.id.btnLogin)

        // Aksi btnClear Ketika di klik
        btnClear.setOnClickListener {// Mengosongkan input
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")

            //Memunculkan SnackBar
            Snackbar.make(mainLayout, "text cleared Success", Snackbar.LENGTH_LONG).show()

        }

        // Aksi pada btnLogin
        btnLogin.setOnClickListener(View.OnClickListener {
            var checkLogin = false
            var username : String = inputUsername.getEditText()?.getText().toString()
            var password : String = inputPassword.getEditText()?.getText().toString()

            // Pengecekan apakah inputan kosong
            if (username.isEmpty()) {
                inputUsername.setError("Username must be filled with text")
                checkLogin = false
            }

            // Pengecekan apakah inputan kosong
            if (password.isEmpty()) {
                inputPassword.setError("Password must be filled with text")
                checkLogin = false
            }

            // Ganti Password dengan NPM Kalian
            if (username == "admin" && password == "0831") checkLogin = true
            if (!checkLogin) return@OnClickListener
            val moveHome = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(moveHome)

        } )


    }
}