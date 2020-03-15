package m.tech.basemvvm.di

import dagger.Module
import m.tech.basemvvm.di.main.MainComponent

@Module(
    subcomponents = [
        MainComponent::class
    ]
)
class SubComponentsModule