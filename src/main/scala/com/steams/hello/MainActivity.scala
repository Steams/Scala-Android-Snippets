package com.steams.snippets

import android.app.{ Activity,Fragment}
import android.os.Bundle
import android.view.{LayoutInflater,Menu,MenuItem,View,ViewGroup}
import org.androidannotations.annotations.{ EActivity }

//@EActivity( R.layout.fragment_main )
class MainActivity extends Activity {

  override def onCreate( bundle:Bundle ){
    super.onCreate( bundle )
    setContentView( R.layout.fragment_main )
  }

}
