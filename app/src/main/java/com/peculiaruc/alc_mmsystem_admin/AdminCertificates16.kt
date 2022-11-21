package com.peculiaruc.alc_mmsystem_admin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdminCertificates16 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private lateinit var userAdapter: UserAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_certificates16)

        recyclerView = findViewById(R.id.rvUserRows)
        recyclerView.layoutManager= LinearLayoutManager(this)
        userList = ArrayList()

        userList.add(User(R.drawable.ellipse2, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.ea, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.cr, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.jk, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.pcu1, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.pcu2, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.pcu3, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.pu, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.ri, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))
        userList.add(User(R.drawable.ra, "Franka Kebede", "Program Assistant, Andela, She/her",
            "PROGRAM ASST.", "MENTOR GADS"))

        userAdapter = UserAdapter(userList)
        recyclerView.adapter = userAdapter


    }

}

