package com.example.registerform
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.*
import com.example.registerform.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val isConstraintLayout = true  

        if (isConstraintLayout) {
            val constraintLayout = ConstraintLayout(this)
            constraintLayout.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

            val registerButton = Button(this)
            registerButton.id = R.id.registerButton


            registerButton.setOnClickListener {
                val firstNameEditText = constraintLayout.findViewById<EditText>(R.id.firstNameEditText)
                val lastNameEditText = constraintLayout.findViewById<EditText>(R.id.lastNameEditText)
                val agreeCheckBox = constraintLayout.findViewById<CheckBox>(R.id.agreeCheckBox)

                val firstName = firstNameEditText.text.toString()
                val lastName = lastNameEditText.text.toString()
                val isAgreed = agreeCheckBox.isChecked

                if (firstName.isEmpty() || lastName.isEmpty() || !isAgreed) {
                    Toast.makeText(
                        this,
                        "Please fill in all fields and agree to the terms.",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                }
            }

            setContentView(constraintLayout)
        } else {
            val linearLayout = LinearLayout(this)
            linearLayout.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            linearLayout.orientation = LinearLayout.VERTICAL


            val registerButton = Button(this)
            registerButton.id = R.id.registerButtonNoConstraint

            registerButton.setOnClickListener {
                val firstNameEditText = linearLayout.findViewById<EditText>(R.id.firstNameEditTextNoConstraint)
                val lastNameEditText = linearLayout.findViewById<EditText>(R.id.lastNameEditTextNoConstraint)
                val agreeCheckBox = linearLayout.findViewById<CheckBox>(R.id.agreeCheckBoxNoConstraint)

                val firstName = firstNameEditText.text.toString()
                val lastName = lastNameEditText.text.toString()
                val isAgreed = agreeCheckBox.isChecked

                if (firstName.isEmpty() || lastName.isEmpty() || !isAgreed) {
                    // Show a simple Toast message if the conditions are not met
                    Toast.makeText(
                        this,
                        "Please fill in all fields and agree to the terms.",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                }
            }

            linearLayout.addView(registerButton)

            setContentView(linearLayout)
        }
    }
}
