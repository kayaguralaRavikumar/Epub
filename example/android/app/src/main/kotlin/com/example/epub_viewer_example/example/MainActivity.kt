package com.example.epub_viewer_example.example

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    }
}
