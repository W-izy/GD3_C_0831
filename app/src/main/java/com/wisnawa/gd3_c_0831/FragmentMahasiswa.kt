package com.wisnawa.gd3_c_0831

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wisnawa.gd3_c_0831.entity.Mahasiswa

class FragmentMahasiswa : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the layout for this fragment
        // proses menghubungkan layout fragment_mahasiswa_xml dengan fragment ini
        return inflater.inflate(R.layout.fragment_mahasiswa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVMahasiswaAdapter = RVMahasiswaAdapter(Mahasiswa.listofMahasiswa)

        // Menghubungkan RVMahasiswa dengan recycler view yang ada pada layout
        val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_mahasiswa)

        // set layout manager dari recycler view
        rvMahasiswa.layoutManager = layoutManager

        // Tidak mengubah size recycler view terdapat item ditambahkan atau dikurangkan
        rvMahasiswa.setHasFixedSize(true)

        // set adapter dari recycler vier
        rvMahasiswa.adapter = adapter

    }

}