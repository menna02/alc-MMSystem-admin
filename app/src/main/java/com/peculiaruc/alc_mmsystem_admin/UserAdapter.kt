package com.peculiaruc.alc_mmsystem_admin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    class UserViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val imageView13: ImageView = itemView.findViewById(R.id.imageView13)
        val franka_kebe: TextView = itemView.findViewById(R.id.franka_kebe)
        val program_ass: TextView = itemView.findViewById(R.id.program_ass)
        val program_ass2: TextView = itemView.findViewById(R.id.program_ass2)
        val mentor_gad: TextView = itemView.findViewById(R.id.mentor_gad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row_items, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.imageView13.setImageResource(user.image)
        holder.franka_kebe.text = user.userName
        holder.program_ass.text = user.programAssistant
        holder.program_ass2.text = user.rectangleProgramAsst
        holder.mentor_gad.text = user.rectangleMentor
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}