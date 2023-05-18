package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PAGE4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
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
        val button6 = findViewById<Button>(R.id.Q)
        button6.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button7 = findViewById<Button>(R.id.T)
        button7.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val button8 = findViewById<Button>(R.id.A)
        button8.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button9 = findViewById<Button>(R.id.R)
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

        val buttonp = findViewById<Button>(R.id.P)
        val answerp = findViewById<TextView>(R.id.answer)

        buttonp.setOnClickListener {
            val buttonTextp = buttonp.text.toString()
            val answerTextp = answerp.text.toString()
            val newTextp = answerTextp + buttonTextp
            answerp.setText(newTextp)
        }


        val buttonh = findViewById<Button>(R.id.H)
        val answerh = findViewById<TextView>(R.id.editTextText)

        buttonh.setOnClickListener {
            val buttonTexth = buttonh.text.toString()
            val answerTexth = answerh.text.toString()
            val newTexth = answerTexth + buttonTexth
            answerh.setText(newTexth)
        }


        val buttono = findViewById<Button>(R.id.O)
        val answeo = findViewById<TextView>(R.id.editTextText2)

        buttono.setOnClickListener {
            val buttonTexto = buttono.text.toString()
            val answerTexto = answeo.text.toString()
            val newTexto = answerTexto + buttonTexto
            answeo.setText(newTexto)
        }

        val buttonn = findViewById<Button>(R.id.N)
        val answern = findViewById<TextView>(R.id.editTextText3)

        buttonn.setOnClickListener {
            val buttonTextn = buttonn.text.toString()
            val answerTextn = answern.text.toString()
            val newTextn = answerTextn + buttonTextn
            answern.setText(newTextn)
        }

        val buttone = findViewById<Button>(R.id.E)
        val answere = findViewById<TextView>(R.id.editTextText4)

        buttone.setOnClickListener {
            val buttonTexte = buttone.text.toString()
            val answerTexte = answere.text.toString()
            val newTexte = answerTexte + buttonTexte
            answere.setText(newTexte)
        }


        button4.setOnClickListener {
                Toast.makeText(this, "you completed this level ", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LASTPAGE::class.java)
                startActivity(intent)
            }
        }

    }
