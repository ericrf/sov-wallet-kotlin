package sov.wallet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.create_account_button).setOnClickListener{
            startActivity( Intent(this, SecretSeedActivity::class.java))
        }

        findViewById<Button>(R.id.access_account_button).setOnClickListener{
            startActivity( Intent(this, AccessAccountActivity::class.java))
        }
    }
}
