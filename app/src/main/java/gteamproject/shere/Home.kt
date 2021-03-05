package gteamproject.shere

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.CarouselView

class Home : Fragment() {

    // 메인 화면 슬라이드 샘플 이미지가 들어갈 곳
    var sampleImages = intArrayOf(
        R.drawable.paris,
        R.drawable.moscow,
        R.drawable.dubai,
        R.drawable.uk
    )

    var cities = arrayOf("Paris", "Dubai", "United Kingdom", "Moscow")

    lateinit var carouselView: CarouselView

    companion object{
        const val TAG : String = "로그"

        fun newInstance() : Home {
            return Home()
        }
    }

    // 메모리에 올라갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        Log.d(TAG, "Home_c")
    }

    // 프래그먼트를 안고있는 액티비티에 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d(TAG, "Home_a")
    }

    // 뷰가 생성되었을 때
    // 프래그먼트와 레이아웃을 연결시켜주는 부분이다.
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "Home_v")

        val view = inflater.inflate(R.layout.home, container, false)

        carouselView = view.findViewById(R.id.carouselView)

        carouselView.pageCount = cities.size
        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }

        return view
    }
}