package com.example.registerform

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var genderRadioGroup: RadioGroup
    private lateinit var dobEditText: EditText
    private lateinit var addressEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var agreeCheckBox: CheckBox
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sử dụng findViewById để tìm các thành phần trên giao diện
        firstNameEditText = findViewById(R.id.firstNameEditText)
        lastNameEditText = findViewById(R.id.lastNameEditText)
        genderRadioGroup = findViewById(R.id.genderRadioGroup)
        dobEditText = findViewById(R.id.dobEditText)
        addressEditText = findViewById(R.id.addressEditText)
        emailEditText = findViewById(R.id.emailEditText)
        agreeCheckBox = findViewById(R.id.agreeCheckBox)
        registerButton = findViewById(R.id.registerButton)

        // Đăng ký sự kiện nhấn nút Register
        registerButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val genderId = genderRadioGroup.checkedRadioButtonId
            val dob = dobEditText.text.toString()
            val address = addressEditText.text.toString()
            val email = emailEditText.text.toString()
            val isAgreed = agreeCheckBox.isChecked

            if (firstName.isEmpty() || lastName.isEmpty() || genderId == -1 || dob.isEmpty() || address.isEmpty() || email.isEmpty() || !isAgreed) {
                Toast.makeText(this, "Please fill in all fields and agree to the Terms of Use.", Toast.LENGTH_SHORT).show()
            } else {
                // Nếu tất cả thông tin hợp lệ, thực hiện đăng ký ở đây
                // Ví dụ: Lưu thông tin vào cơ sở dữ liệu hoặc gửi đăng ký đến máy chủ
                // Code xử lý đăng ký ở đây
                Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
