package se.evinja.othello.di

import dagger.Component
import se.evinja.othello.user.UserModule

@Component(modules = [UserModule::class])
interface ApplicationComponent {
    fun inject(application: OthelloApplication)
}
