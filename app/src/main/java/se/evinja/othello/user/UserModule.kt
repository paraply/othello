package se.evinja.othello.user

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
interface UserModule {
    @Binds
    fun bindUser(impl: UserImpl): User
}