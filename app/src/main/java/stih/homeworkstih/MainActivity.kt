package stih.homeworkstih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log


private const val TAG = "Main Activity"
private const val MyTAG = "SashaLog"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d(MyTAG, """"
                        |Плыли по небу тучки.
                        |Тучек — четыре штучки:
                        |от первой до третьей — люди,
                        |четвертая была верблюдик.
        |""".trimMargin()
        )


    }


    override fun onStart() {
        super.onStart()
        Log.d(MyTAG, """"
                        |К ним, любопытством объятая,
                        |по дороге пристала пятая,
        """.trimMargin())

    }

    override fun onResume() {
        super.onResume()
        Log.d(MyTAG, """"
                        |от нее в небосинем лоне
                        |разбежались за слоником слоник.
        """.trimMargin())

    }

    override fun onPause() {
        super.onPause()
        Log.d(MyTAG, """"
                        |И, не знаю, спугнула шестая ли,
                        |тучки взяли все — и растаяли.
        """.trimMargin())

    }

    override fun onStop() {
        super.onStop()
        Log.d(MyTAG, """"
                        |И следом за ними, гонясь и сжирав,
                        |солнце погналось — желтый жираф.
        """.trimMargin())

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            MyTAG, """"
                        |
                        |Маяковский В. В.
                        |1917-1918 гг.
        """.trimMargin()
        )


    }}