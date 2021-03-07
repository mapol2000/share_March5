package gteamproject.shere

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import gteamproject.shere.adapters.MagazineRecyclerAdapter

class Magazine: Fragment() {

    private var imageList = mutableListOf<Int>()
    private var briefList = mutableListOf<String>()
    private var publisherList = mutableListOf<String>()

    lateinit var recyclerView: RecyclerView


    companion object{
        const val TAG : String = "로그"

        fun newInstance() : Magazine {
            return Magazine()
        }
    }

    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Magazine.TAG, "Magazine_c")
    }

    // 프래그먼트를 안고있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(Magazine.TAG, "Magazine_a")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view!!.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MagazineRecyclerAdapter(imageList, briefList, publisherList)
    }

    override fun getContext() = super.getContext()!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(Magazine.TAG, "Magazine_v")

        postToList()

        val view = inflater.inflate(R.layout.magazine, container, false)

        return view
    }

    private fun addToList(image: Int, brief: String, publisher: String) {
        imageList.add(image)
        briefList.add(brief)
        publisherList.add(publisher)
    }

    private fun postToList() {
        for (i in 1..25) {
            addToList(R.drawable.dubai, "본문내용 $i", "작성자 $i")
        }

    }

}