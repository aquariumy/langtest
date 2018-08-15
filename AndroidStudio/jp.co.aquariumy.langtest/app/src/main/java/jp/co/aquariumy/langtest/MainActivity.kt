package jp.co.aquariumy.langtest

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var player : MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        player.setDataSource("https://secure1258m.sakura.ne.jp/happy-trip.jp/langtest/serif.mp3")
        player.prepare()
        player.start()
    }

    override fun onPause() {
        if (player != null) {
            player.stop()
        }
        super.onPause()
    }
    override fun onDestroy() {
        if (player != null) {
            player.release()
        }
        super.onDestroy()
    }

}
