package sov.wallet

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_secret_seed.*
import org.stellar.sdk.KeyPair

class SecretSeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secret_seed)

        val keypair = KeyPair.random()

        findViewById<TextView>(R.id.secret_seed_text_view).setText("".toString())

//        findViewById<Button>(R.id.access_account_button).setOnClickListener{
//            val intent = Intent(this, )
//        }


    }

}
