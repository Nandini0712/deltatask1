package com.example.wordjumble

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PAGE3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        val button1 = findViewById<Button>(R.id.C)
        button1.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val button2 = findViewById<Button>(R.id.L)
        button2.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button3 = findViewById<Button>(R.id.I)
        button3.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button4 = findViewById<Button>(R.id.K)
        button4.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button5= findViewById<Button>(R.id.M)
        button5.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button6 = findViewById<Button>(R.id.N)
        button6.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button7 = findViewById<Button>(R.id.O)
        button7.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val button8 = findViewById<Button>(R.id.Q)
        button8.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button9 = findViewById<Button>(R.id.H)
        button9.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button10 = findViewById<Button>(R.id.F)
        button10.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button11 = findViewById<Button>(R.id.Z)
        button11.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val buttonw = findViewById<Button>(R.id.W)
        val answerw = findViewById<TextView>(R.id.answer)

        buttonw.setOnClickListener {
            val buttonTextw = buttonw.text.toString()
            val answerTextw = answerw.text.toString()
            val newTextw = answerTextw + buttonTextw
            answerw.setText(newTextw)
        }


        val buttona = findViewById<Button>(R.id.A)
        val answera = findViewById<TextView>(R.id.editTextText)

        buttona.setOnClickListener {
            val buttonTexta = buttona.text.toString()
            val answerTexta = answera.text.toString()
            val newTexta = answerTexta + buttonTexta
            answera.setText(newTexta)
        }
        val buttont = findViewById<Button>(R.id.T)
        val answert = findViewById<TextView>(R.id.editTextText2)

        buttont.setOnClickListener {
            val buttonTextt = buttont.text.toString()
            val answerTextt = answert.text.toString()
            val newTextt = answerTextt + buttonTextt
            answert.setText(newTextt)
        }

        val buttone = findViewById<Button>(R.id.E)
        val answere = findViewById<TextView>(R.id.editTextText3)

        buttone.setOnClickListener {
            val buttonTexte = buttone.text.toString()
            val answerTexte = answere.text.toString()
            val newTexte = answerTexte + buttonTexte
            answere.setText(newTexte)
        }

        val buttonr = findViewById<Button>(R.id.R)
        val answer = findViewById<TextView>(R.id.editTextText4)

        buttonr.setOnClickListener {
            val buttonTextr = buttonr.text.toString()
            val answerTextr = answer.text.toString()
            val newTextr = answerTextr + buttonTextr
            answer.text = newTextr
        }


            button4.setOnClickListener {
                Toast.makeText(this, "you completed this level ", Toast.LENGTH_LONG).show()
                val intent = Intent(this, PAGE4::class.java)
                startActivity(intent)
            }




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
    }
}