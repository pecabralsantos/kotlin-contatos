package br.com.multitrek.contatos.di

import android.app.Application
import br.com.multitrek.contatos.di.scope.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ApplicationComponent : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@ApplicationComponent)
            modules(appModule)
        }
    }

}