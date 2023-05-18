package com.example.wordjumble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PAGE2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val button1 = findViewById<Button>(R.id.S)
        button1.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val button2 = findViewById<Button>(R.id.L)
        button2.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button3 = findViewById<Button>(R.id.J)
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

        val button8 = findViewById<Button>(R.id.F)
        button8.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button9 = findViewById<Button>(R.id.T)
        button9.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button10 = findViewById<Button>(R.id.Q)
        button10.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }
        val button11 = findViewById<Button>(R.id.Z)
        button11.setOnClickListener {
            Toast.makeText(this, " WRONG GUESS ", Toast.LENGTH_LONG).show()

        }

        val buttonc = findViewById<Button>(R.id.C)
        val answerc = findViewById<TextView>(R.id.answer)

        buttonc.setOnClickListener {
            val buttonTextc = buttonc.text.toString()
            val answerTextc = answerc.text.toString()
            val newTextc = answerTextc + buttonTextc
            answerc.setText(newTextc)
        }
        val buttonh = findViewById<Button>(R.id.H)
        val answerh = findViewById<TextView>(R.id.editTextText)

        buttonh.setOnClickListener {
            val buttonTexth = buttonh.text.toString()
            val answerTexth = answerh.text.toString()
            val newTexth = answerTexth + buttonTexth
            answerh.setText(newTexth)
        }

        val buttona = findViewById<Button>(R.id.A)
        val answera = findViewById<TextView>(R.id.editTextText2)

        buttona.setOnClickListener {
            val buttonTexta = buttona.text.toString()
            val answerTexta = answera.text.toString()
            val newTexta = answerTexta + buttonTexta
            answera.setText(newTexta)
        }

        val buttoni = findViewById<Button>(R.id.I)
        val answeri = findViewById<TextView>(R.id.editTextText3)

        buttoni.setOnClickListener {
            val buttonTexti = buttoni.text.toString()
            val answerTexti = answeri.text.toString()
            val newTexti = answerTexti + buttonTexti
            answeri.setText(newTexti)
        }

        val buttonr = findViewById<Button>(R.id.R)
        val answer = findViewById<TextView>(R.id.editTextText4)

        buttonr.setOnClickListener {
            val buttonTextr = buttonr.text.toString()
            val answerTextr = answer.text.toString()
            val newTextr = answerTextr + buttonTextr
            answer.setText(newTextr)
        }


        button4.setOnClickListener {
            Toast.makeText(this, "you completed this level ", Toast.LENGTH_LONG).show()
            val intent = Intent(this, PAGE3::class.java)
            startActivity(intent)
        }
        }


    }
