package gteamproject.shere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Magazine_Detail : AppCompatActivity() {

    // 위젯 변수선언
    lateinit var detailTitle: TextView
    lateinit var detailPublisher: TextView
    lateinit var detailImage: ImageView
    lateinit var detailContent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazine__detail)

        // 위젯 변수선언
        detailTitle = findViewById(R.id.detailTitle)
        detailPublisher = findViewById(R.id.detailPublisher)
        detailImage = findViewById(R.id.detailImage)
        detailContent = findViewById(R.id.detailContent)

        // 인텐트로 받아오기
        detailTitle.text = intent.getStringExtra("title")
        detailPublisher.text = intent.getStringExtra("publisher")
        detailImage.setImageResource(intent.getStringExtra("image")!!.toInt())
        detailContent.text = intent.getStringExtra("brief")

    }
}

// TODO: 제목, 본문내용, 작성자 정규화식 해야함