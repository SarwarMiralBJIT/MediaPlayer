package com.bjit.mediaplayerexample

import android.media.MediaPlayer.OnPreparedListener
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bjit.mediaplayerexample.databinding.ActivityVideoBinding

class VideoActivity : AppCompatActivity() {

    lateinit var binding: ActivityVideoBinding

    var video_url = "https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uri: Uri = Uri.parse(video_url)
        binding.videoView.setVideoURI(uri)
        binding.videoView.start()

        binding.videoView.setOnPreparedListener(OnPreparedListener { //close the progress dialog when buffering is done

        })
    }
}