package m.tech.basemvvm

import android.app.Application
import m.tech.basemvvm.di.AppComponent
import m.tech.basemvvm.di.DaggerAppComponent
import m.tech.basemvvm.di.main.MainComponent


class BaseApplication : Application() {

    private lateinit var appComponent: AppComponent

    private var mainComponent: MainComponent? = null

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    fun mainComponent(): MainComponent {
        if (mainComponent == null) {
            mainComponent = appComponent.mainComponent().create()
        }
        return mainComponent as MainComponent
    }

    fun releaseMainComponent() {
        mainComponent = null
    }

}