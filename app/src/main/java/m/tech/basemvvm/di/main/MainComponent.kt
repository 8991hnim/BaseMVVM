package m.tech.basemvvm.di.main

import dagger.Subcomponent
import m.tech.basemvvm.MainActivity

@MainScope
@Subcomponent(
    modules = [
        MainModule::class,
        MainViewModelModule::class
    ]
)
interface MainComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}