package io.bootique.jersey.client.demo;

import io.bootique.BQCoreModule;
import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.di.Binder;

public class Application implements BQModule {

    public static void main(final String[] args) {
        Bootique
                .app(args)
                .autoLoadModules()
                .module(Application.class)
                .args("--hello", "--config=classpath:bootique.yml")
                .exec()
                .exit();
    }

    @Override
    public void configure(final Binder binder) {
        BQCoreModule.extend(binder).addCommand(HelloCommand.class);
    }
}
